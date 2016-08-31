package de.gecko.egkfeuer.service;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.api.ResourceMetadataKeyEnum;
import ca.uhn.fhir.model.dstu2.composite.AddressDt;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.valueset.AddressTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.AdministrativeGenderEnum;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.rest.client.IGenericClient;
import de.gecko.egkfeuer.model.PatientWrapper;
import de.gecko.egkfeuer.model.Sex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatientToFhirServiceDSTU2 {

    private static final Logger logger = LoggerFactory.getLogger(CardReaderServiceImpl.class);
    private final String serverBase;

    public PatientToFhirServiceDSTU2(String serverBase) {
        this.serverBase = serverBase;
    }

    public String sendPatientToFhirServer(PatientWrapper patient) {
        FhirContext ctx = FhirContext.forDstu2();
        IGenericClient client = ctx.newRestfulGenericClient(serverBase);

        //set Identifier
        Patient fhirPatient = new Patient();
        fhirPatient.addIdentifier()
                .setSystem("http://hl7.de/fhir/KVNR")
                .setValue(patient.getHealthInsuranceNumber());
        //setName
        fhirPatient.addName()
                .addFamily(patient.getSurname())
                .addGiven(patient.getGivenName())
                .addPrefix(patient.getTitle());

        //setSex
        if (patient.getSex() == Sex.FEMALE)
            fhirPatient.setGender(AdministrativeGenderEnum.FEMALE);
        else if (patient.getSex() == Sex.MALE)
            fhirPatient.setGender(AdministrativeGenderEnum.MALE);
        else
            throw new RuntimeException("Gender of patient was not set");

        //setBirthday
        fhirPatient.setBirthDateWithDayPrecision(Date.from(patient.getBirthday().atStartOfDay(ZoneId.systemDefault()).toInstant()));

        //setAdress
        //TODO: AdressType postal, other Countries than Germany
        List<AddressDt> adresses = new ArrayList<AddressDt>();
        AddressDt adress = new AddressDt();
        adress.addLine(patient.getStreetAndNumber()).setCity(patient.getCity()).setType(AddressTypeEnum.PHYSICAL).setPostalCode(patient.getZip()).setCountry("Germany");
        adresses.add(adress);
        fhirPatient.setAddress(adresses);

        //setProfile
        fhirPatient.getResourceMetadata().put(ResourceMetadataKeyEnum.PROFILES,
                "http://fhir.de/StructureDefinition/kbv/persoenlicheVersicherungsdaten");

        //submitToServer
        IdDt id = (IdDt) client.update().resource(fhirPatient).conditional().where(Patient.IDENTIFIER.exactly().systemAndIdentifier("http://hl7.de/fhir/KVNR", patient.getHealthInsuranceNumber()))
                .execute().getId();
        logger.info("Patient with ID: " + id + " generated");
        return id.toString();
    }
}
