package de.gecko.egkfeuer.model;

import de.gecko.egkfeuer.model.ekg.v51.pd.UCPersoenlicheVersichertendatenXML;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@Deprecated
public class UCPersWrapper
{

	private UCPersoenlicheVersichertendatenXML xmltree;

	public UCPersWrapper(UCPersoenlicheVersichertendatenXML xmltree)
	{
		this.xmltree = xmltree;
	}

	public String getNachname()
	{
		return xmltree.getVersicherter().getPerson().getNachname();
	}

	public String getVorname()
	{
		return xmltree.getVersicherter().getPerson().getVorname();
	}

	public Sex getGeschlecht()
	{
		switch (xmltree.getVersicherter().getPerson().getGeschlecht())
		{
			case "M":
				return Sex.MALE;
			case "W":
				return Sex.FEMALE;
			default:
				break;
		}
		return null;
	}

	public String getPostleitzahl()
	{
		return xmltree.getVersicherter().getPerson().getStrassenAdresse().getPostleitzahl();
	}

	public String getLand()
	{
		return xmltree.getVersicherter().getPerson().getStrassenAdresse().getLand().getWohnsitzlaendercode();
	}

	public LocalDate getGeburtsdatum()
	{
		return LocalDate.parse(xmltree.getVersicherter().getPerson().getGeburtsdatum(),
				DateTimeFormatter.ofPattern("yyyyMMdd"));
	}

	public String getTitel()
	{
		return null;
	}

	public String getOrt()
	{
		return xmltree.getVersicherter().getPerson().getStrassenAdresse().getOrt();
	}

	public String getStrasse()
	{
		return xmltree.getVersicherter().getPerson().getStrassenAdresse().getStrasse();
	}

	public String getHausnummer()
	{
		return xmltree.getVersicherter().getPerson().getStrassenAdresse().getHausnummer();
	}

	public String getStrasseUndHausnummer()
	{
		return getStrasse() + " " + getHausnummer();
	}

	public String getVersichertenID()
	{
		return xmltree.getVersicherter().getVersichertenID();
	}

	@Override
	public String toString()
	{
		return getTitel() + ":" + getVorname() + ":" + getNachname() + ":" + getGeburtsdatum() + ":" + getGeschlecht()
				+ ":" + getPostleitzahl() + ":" + getOrt() + ":" + getStrasseUndHausnummer() + ":"
				+ getVersichertenID();
	}

}
