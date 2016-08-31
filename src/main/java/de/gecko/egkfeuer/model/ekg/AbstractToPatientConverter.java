package de.gecko.egkfeuer.model.ekg;

import de.gecko.egkfeuer.model.Sex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;



public abstract class AbstractToPatientConverter implements ToPatientConverter
{
	private static final Logger logger = LoggerFactory.getLogger(AbstractToPatientConverter.class);

	protected boolean isCompatible(String content, String version)
	{
		try
		{
			Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder()
					.parse(new InputSource(new StringReader(content)));

			String cdmVersion = document.getDocumentElement().getAttribute("CDM_VERSION");

			return version.equals(cdmVersion);
		}
		catch (SAXException | IOException | ParserConfigurationException e)
		{
			logger.warn("Exception while acessing CDM_VERSION", e);
			return false;
		}
	}

	protected Sex toSex(String geschlecht)
	{
		switch (geschlecht)
		{
			case "M":
				return Sex.MALE;
			case "W":
				return Sex.FEMALE;
			default:
				return null;
		}
	}
}
