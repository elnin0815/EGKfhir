package de.gecko.egkfeuer.model;

import java.time.LocalDate;
import java.util.Objects;

public class PatientWrapper
{
	private final String title;
	private final String givenName;
	private final String surname;
	private final LocalDate birthday;
	private final Sex sex;
	private final String zip;
	private final String city;
	private final String streetAndNumber;
	private final String healthInsuranceProviderNumber;
	private final String healthInsuranceNumber;

	/**
	 * @param title
	 * @param givenName
	 *            not <code>null</code>
	 * @param surname
	 *            not <code>null</code>
	 * @param birthday
	 *            not <code>null</code>
	 * @param sex
	 *            not <code>null</code>
	 * @param zip
	 * @param city
	 * @param streetAndNumber
	 * @param healthInsuranceProviderNumber
	 * @param healthInsuranceNumber

	 */
	public PatientWrapper(String title, String givenName, String surname, LocalDate birthday, Sex sex, String zip,
                          String city, String streetAndNumber, String healthInsuranceProviderNumber, String healthInsuranceNumber)
	{
		this.title = title;
		this.givenName = Objects.requireNonNull(givenName, "givenName");
		this.surname = Objects.requireNonNull(surname, "surname");
		this.birthday = Objects.requireNonNull(birthday, "birthday");
		this.sex = Objects.requireNonNull(sex, "sex");
		this.zip = zip;
		this.city = city;
		this.streetAndNumber = streetAndNumber;
		this.healthInsuranceProviderNumber = healthInsuranceProviderNumber;
		this.healthInsuranceNumber = healthInsuranceNumber;

	}


	public String getTitle()
	{
		return title;
	}

	public String getGivenName()
	{
		return givenName;
	}

	public String getSurname()
	{
		return surname;
	}

	public LocalDate getBirthday()
	{
		return birthday;
	}

	public Sex getSex()
	{
		return sex;
	}

	public String getZip()
	{
		return zip;
	}

	public String getCity()
	{
		return city;
	}

	public String getStreetAndNumber()
	{
		return streetAndNumber;
	}

	public String getHealthInsuranceProviderNumber()
	{
		return healthInsuranceProviderNumber;
	}

	public String getHealthInsuranceNumber()
	{
		return healthInsuranceNumber;
	}
}
