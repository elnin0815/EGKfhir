//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.07.01 um 04:28:50 PM CEST 
//

package de.gecko.egkfeuer.model.ekg.v51.pd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse für anonymous complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Versicherter">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Versicherten_ID" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_10"/>
 *                   &lt;element name="Person">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Geburtsdatum" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}ZP_Zeitpunkt_8"/>
 *                             &lt;element name="Vorname" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_2_45"/>
 *                             &lt;element name="Nachname" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_45"/>
 *                             &lt;element name="Geschlecht" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_1"/>
 *                             &lt;element name="Vorsatzwort" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_20" minOccurs="0"/>
 *                             &lt;element name="Namenszusatz" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_20" minOccurs="0"/>
 *                             &lt;element name="Titel" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_20" minOccurs="0"/>
 *                             &lt;element name="PostfachAdresse" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Postleitzahl" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_10"/>
 *                                       &lt;element name="Ort" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_40"/>
 *                                       &lt;element name="Postfach" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_8"/>
 *                                       &lt;element name="Land">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Wohnsitzlaendercode" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_3"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="StrassenAdresse" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Postleitzahl" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_10"/>
 *                                       &lt;element name="Ort" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_40"/>
 *                                       &lt;element name="Land">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Wohnsitzlaendercode" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_3"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Strasse" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_46" minOccurs="0"/>
 *                                       &lt;element name="Hausnummer" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_9" minOccurs="0"/>
 *                                       &lt;element name="Anschriftenzusatz" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_40" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="CDM_VERSION" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "versicherter" })
@XmlRootElement(name = "UC_PersoenlicheVersichertendatenXML")
public class UCPersoenlicheVersichertendatenXML
{
	@XmlElement(name = "Versicherter", required = true)
	protected UCPersoenlicheVersichertendatenXML.Versicherter versicherter;
	@XmlAttribute(name = "CDM_VERSION", required = true)
	protected String cdmversion;

	/**
	 * Ruft den Wert der versicherter-Eigenschaft ab.
	 * 
	 * @return possible object is
	 *         {@link UCPersoenlicheVersichertendatenXML.Versicherter }
	 * 
	 */
	public UCPersoenlicheVersichertendatenXML.Versicherter getVersicherter()
	{
		return versicherter;
	}

	/**
	 * Legt den Wert der versicherter-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is
	 *            {@link UCPersoenlicheVersichertendatenXML.Versicherter }
	 * 
	 */
	public void setVersicherter(UCPersoenlicheVersichertendatenXML.Versicherter value)
	{
		this.versicherter = value;
	}

	/**
	 * Ruft den Wert der cdmversion-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCDMVERSION()
	{
		return cdmversion;
	}

	/**
	 * Legt den Wert der cdmversion-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCDMVERSION(String value)
	{
		this.cdmversion = value;
	}

	/**
	 * <p>
	 * Java-Klasse für anonymous complex type.
	 * 
	 * <p>
	 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
	 * Klasse enthalten ist.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="Versicherten_ID" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_10"/>
	 *         &lt;element name="Person">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="Geburtsdatum" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}ZP_Zeitpunkt_8"/>
	 *                   &lt;element name="Vorname" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_2_45"/>
	 *                   &lt;element name="Nachname" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_45"/>
	 *                   &lt;element name="Geschlecht" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_1"/>
	 *                   &lt;element name="Vorsatzwort" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_20" minOccurs="0"/>
	 *                   &lt;element name="Namenszusatz" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_20" minOccurs="0"/>
	 *                   &lt;element name="Titel" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_20" minOccurs="0"/>
	 *                   &lt;element name="PostfachAdresse" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="Postleitzahl" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_10"/>
	 *                             &lt;element name="Ort" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_40"/>
	 *                             &lt;element name="Postfach" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_8"/>
	 *                             &lt;element name="Land">
	 *                               &lt;complexType>
	 *                                 &lt;complexContent>
	 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                     &lt;sequence>
	 *                                       &lt;element name="Wohnsitzlaendercode" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_3"/>
	 *                                     &lt;/sequence>
	 *                                   &lt;/restriction>
	 *                                 &lt;/complexContent>
	 *                               &lt;/complexType>
	 *                             &lt;/element>
	 *                           &lt;/sequence>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                   &lt;element name="StrassenAdresse" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="Postleitzahl" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_10"/>
	 *                             &lt;element name="Ort" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_40"/>
	 *                             &lt;element name="Land">
	 *                               &lt;complexType>
	 *                                 &lt;complexContent>
	 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                     &lt;sequence>
	 *                                       &lt;element name="Wohnsitzlaendercode" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_3"/>
	 *                                     &lt;/sequence>
	 *                                   &lt;/restriction>
	 *                                 &lt;/complexContent>
	 *                               &lt;/complexType>
	 *                             &lt;/element>
	 *                             &lt;element name="Strasse" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_46" minOccurs="0"/>
	 *                             &lt;element name="Hausnummer" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_9" minOccurs="0"/>
	 *                             &lt;element name="Anschriftenzusatz" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_40" minOccurs="0"/>
	 *                           &lt;/sequence>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "versichertenID", "person" })
	public static class Versicherter
	{
		@XmlElement(name = "Versicherten_ID", required = true)
		protected String versichertenID;
		@XmlElement(name = "Person", required = true)
		protected UCPersoenlicheVersichertendatenXML.Versicherter.Person person;

		/**
		 * Ruft den Wert der versichertenID-Eigenschaft ab.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVersichertenID()
		{
			return versichertenID;
		}

		/**
		 * Legt den Wert der versichertenID-Eigenschaft fest.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVersichertenID(String value)
		{
			this.versichertenID = value;
		}

		/**
		 * Ruft den Wert der person-Eigenschaft ab.
		 * 
		 * @return possible object is
		 *         {@link UCPersoenlicheVersichertendatenXML.Versicherter.Person }
		 * 
		 */
		public UCPersoenlicheVersichertendatenXML.Versicherter.Person getPerson()
		{
			return person;
		}

		/**
		 * Legt den Wert der person-Eigenschaft fest.
		 * 
		 * @param value
		 *            allowed object is
		 *            {@link UCPersoenlicheVersichertendatenXML.Versicherter.Person }
		 * 
		 */
		public void setPerson(UCPersoenlicheVersichertendatenXML.Versicherter.Person value)
		{
			this.person = value;
		}

		/**
		 * <p>
		 * Java-Klasse für anonymous complex type.
		 * 
		 * <p>
		 * Das folgende Schemafragment gibt den erwarteten Content an, der in
		 * dieser Klasse enthalten ist.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="Geburtsdatum" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}ZP_Zeitpunkt_8"/>
		 *         &lt;element name="Vorname" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_2_45"/>
		 *         &lt;element name="Nachname" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_45"/>
		 *         &lt;element name="Geschlecht" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_1"/>
		 *         &lt;element name="Vorsatzwort" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_20" minOccurs="0"/>
		 *         &lt;element name="Namenszusatz" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_20" minOccurs="0"/>
		 *         &lt;element name="Titel" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_20" minOccurs="0"/>
		 *         &lt;element name="PostfachAdresse" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="Postleitzahl" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_10"/>
		 *                   &lt;element name="Ort" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_40"/>
		 *                   &lt;element name="Postfach" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_8"/>
		 *                   &lt;element name="Land">
		 *                     &lt;complexType>
		 *                       &lt;complexContent>
		 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                           &lt;sequence>
		 *                             &lt;element name="Wohnsitzlaendercode" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_3"/>
		 *                           &lt;/sequence>
		 *                         &lt;/restriction>
		 *                       &lt;/complexContent>
		 *                     &lt;/complexType>
		 *                   &lt;/element>
		 *                 &lt;/sequence>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *         &lt;element name="StrassenAdresse" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="Postleitzahl" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_10"/>
		 *                   &lt;element name="Ort" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_40"/>
		 *                   &lt;element name="Land">
		 *                     &lt;complexType>
		 *                       &lt;complexContent>
		 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                           &lt;sequence>
		 *                             &lt;element name="Wohnsitzlaendercode" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_3"/>
		 *                           &lt;/sequence>
		 *                         &lt;/restriction>
		 *                       &lt;/complexContent>
		 *                     &lt;/complexType>
		 *                   &lt;/element>
		 *                   &lt;element name="Strasse" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_46" minOccurs="0"/>
		 *                   &lt;element name="Hausnummer" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_9" minOccurs="0"/>
		 *                   &lt;element name="Anschriftenzusatz" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_40" minOccurs="0"/>
		 *                 &lt;/sequence>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "geburtsdatum", "vorname", "nachname", "geschlecht", "vorsatzwort",
				"namenszusatz", "titel", "postfachAdresse", "strassenAdresse" })
		public static class Person
		{
			@XmlElement(name = "Geburtsdatum", required = true)
			protected String geburtsdatum;
			@XmlElement(name = "Vorname", required = true)
			protected String vorname;
			@XmlElement(name = "Nachname", required = true)
			protected String nachname;
			@XmlElement(name = "Geschlecht", required = true)
			protected String geschlecht;
			@XmlElement(name = "Vorsatzwort")
			protected String vorsatzwort;
			@XmlElement(name = "Namenszusatz")
			protected String namenszusatz;
			@XmlElement(name = "Titel")
			protected String titel;
			@XmlElement(name = "PostfachAdresse")
			protected UCPersoenlicheVersichertendatenXML.Versicherter.Person.PostfachAdresse postfachAdresse;
			@XmlElement(name = "StrassenAdresse")
			protected UCPersoenlicheVersichertendatenXML.Versicherter.Person.StrassenAdresse strassenAdresse;

			/**
			 * Ruft den Wert der geburtsdatum-Eigenschaft ab.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getGeburtsdatum()
			{
				return geburtsdatum;
			}

			/**
			 * Legt den Wert der geburtsdatum-Eigenschaft fest.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setGeburtsdatum(String value)
			{
				this.geburtsdatum = value;
			}

			/**
			 * Ruft den Wert der vorname-Eigenschaft ab.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVorname()
			{
				return vorname;
			}

			/**
			 * Legt den Wert der vorname-Eigenschaft fest.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVorname(String value)
			{
				this.vorname = value;
			}

			/**
			 * Ruft den Wert der nachname-Eigenschaft ab.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getNachname()
			{
				return nachname;
			}

			/**
			 * Legt den Wert der nachname-Eigenschaft fest.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setNachname(String value)
			{
				this.nachname = value;
			}

			/**
			 * Ruft den Wert der geschlecht-Eigenschaft ab.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getGeschlecht()
			{
				return geschlecht;
			}

			/**
			 * Legt den Wert der geschlecht-Eigenschaft fest.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setGeschlecht(String value)
			{
				this.geschlecht = value;
			}

			/**
			 * Ruft den Wert der vorsatzwort-Eigenschaft ab.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVorsatzwort()
			{
				return vorsatzwort;
			}

			/**
			 * Legt den Wert der vorsatzwort-Eigenschaft fest.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVorsatzwort(String value)
			{
				this.vorsatzwort = value;
			}

			/**
			 * Ruft den Wert der namenszusatz-Eigenschaft ab.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getNamenszusatz()
			{
				return namenszusatz;
			}

			/**
			 * Legt den Wert der namenszusatz-Eigenschaft fest.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setNamenszusatz(String value)
			{
				this.namenszusatz = value;
			}

			/**
			 * Ruft den Wert der titel-Eigenschaft ab.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getTitel()
			{
				return titel;
			}

			/**
			 * Legt den Wert der titel-Eigenschaft fest.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setTitel(String value)
			{
				this.titel = value;
			}

			/**
			 * Ruft den Wert der postfachAdresse-Eigenschaft ab.
			 * 
			 * @return possible object is
			 *         {@link UCPersoenlicheVersichertendatenXML.Versicherter.Person.PostfachAdresse }
			 * 
			 */
			public UCPersoenlicheVersichertendatenXML.Versicherter.Person.PostfachAdresse getPostfachAdresse()
			{
				return postfachAdresse;
			}

			/**
			 * Legt den Wert der postfachAdresse-Eigenschaft fest.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link UCPersoenlicheVersichertendatenXML.Versicherter.Person.PostfachAdresse }
			 * 
			 */
			public void setPostfachAdresse(UCPersoenlicheVersichertendatenXML.Versicherter.Person.PostfachAdresse value)
			{
				this.postfachAdresse = value;
			}

			/**
			 * Ruft den Wert der strassenAdresse-Eigenschaft ab.
			 * 
			 * @return possible object is
			 *         {@link UCPersoenlicheVersichertendatenXML.Versicherter.Person.StrassenAdresse }
			 * 
			 */
			public UCPersoenlicheVersichertendatenXML.Versicherter.Person.StrassenAdresse getStrassenAdresse()
			{
				return strassenAdresse;
			}

			/**
			 * Legt den Wert der strassenAdresse-Eigenschaft fest.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link UCPersoenlicheVersichertendatenXML.Versicherter.Person.StrassenAdresse }
			 * 
			 */
			public void setStrassenAdresse(UCPersoenlicheVersichertendatenXML.Versicherter.Person.StrassenAdresse value)
			{
				this.strassenAdresse = value;
			}

			/**
			 * <p>
			 * Java-Klasse für anonymous complex type.
			 * 
			 * <p>
			 * Das folgende Schemafragment gibt den erwarteten Content an, der
			 * in dieser Klasse enthalten ist.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="Postleitzahl" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_10"/>
			 *         &lt;element name="Ort" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_40"/>
			 *         &lt;element name="Postfach" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_8"/>
			 *         &lt;element name="Land">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence>
			 *                   &lt;element name="Wohnsitzlaendercode" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_3"/>
			 *                 &lt;/sequence>
			 *               &lt;/restriction>
			 *             &lt;/complexContent>
			 *           &lt;/complexType>
			 *         &lt;/element>
			 *       &lt;/sequence>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "postleitzahl", "ort", "postfach", "land" })
			public static class PostfachAdresse
			{
				@XmlElement(name = "Postleitzahl", required = true)
				protected String postleitzahl;
				@XmlElement(name = "Ort", required = true)
				protected String ort;
				@XmlElement(name = "Postfach", required = true)
				protected String postfach;
				@XmlElement(name = "Land", required = true)
				protected UCPersoenlicheVersichertendatenXML.Versicherter.Person.PostfachAdresse.Land land;

				/**
				 * Ruft den Wert der postleitzahl-Eigenschaft ab.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getPostleitzahl()
				{
					return postleitzahl;
				}

				/**
				 * Legt den Wert der postleitzahl-Eigenschaft fest.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setPostleitzahl(String value)
				{
					this.postleitzahl = value;
				}

				/**
				 * Ruft den Wert der ort-Eigenschaft ab.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getOrt()
				{
					return ort;
				}

				/**
				 * Legt den Wert der ort-Eigenschaft fest.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setOrt(String value)
				{
					this.ort = value;
				}

				/**
				 * Ruft den Wert der postfach-Eigenschaft ab.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getPostfach()
				{
					return postfach;
				}

				/**
				 * Legt den Wert der postfach-Eigenschaft fest.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setPostfach(String value)
				{
					this.postfach = value;
				}

				/**
				 * Ruft den Wert der land-Eigenschaft ab.
				 * 
				 * @return possible object is
				 *         {@link UCPersoenlicheVersichertendatenXML.Versicherter.Person.PostfachAdresse.Land }
				 * 
				 */
				public UCPersoenlicheVersichertendatenXML.Versicherter.Person.PostfachAdresse.Land getLand()
				{
					return land;
				}

				/**
				 * Legt den Wert der land-Eigenschaft fest.
				 * 
				 * @param value
				 *            allowed object is
				 *            {@link UCPersoenlicheVersichertendatenXML.Versicherter.Person.PostfachAdresse.Land }
				 * 
				 */
				public void setLand(UCPersoenlicheVersichertendatenXML.Versicherter.Person.PostfachAdresse.Land value)
				{
					this.land = value;
				}

				/**
				 * <p>
				 * Java-Klasse f�r anonymous complex type.
				 * 
				 * <p>
				 * Das folgende Schemafragment gibt den erwarteten Content an,
				 * der in dieser Klasse enthalten ist.
				 * 
				 * <pre>
				 * &lt;complexType>
				 *   &lt;complexContent>
				 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *       &lt;sequence>
				 *         &lt;element name="Wohnsitzlaendercode" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_3"/>
				 *       &lt;/sequence>
				 *     &lt;/restriction>
				 *   &lt;/complexContent>
				 * &lt;/complexType>
				 * </pre>
				 * 
				 * 
				 */
				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = { "wohnsitzlaendercode" })
				public static class Land
				{
					@XmlElement(name = "Wohnsitzlaendercode", required = true)
					protected String wohnsitzlaendercode;

					/**
					 * Ruft den Wert der wohnsitzlaendercode-Eigenschaft ab.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getWohnsitzlaendercode()
					{
						return wohnsitzlaendercode;
					}

					/**
					 * Legt den Wert der wohnsitzlaendercode-Eigenschaft fest.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setWohnsitzlaendercode(String value)
					{
						this.wohnsitzlaendercode = value;
					}

				}

			}

			/**
			 * <p>
			 * Java-Klasse für anonymous complex type.
			 * 
			 * <p>
			 * Das folgende Schemafragment gibt den erwarteten Content an, der
			 * in dieser Klasse enthalten ist.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="Postleitzahl" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_10"/>
			 *         &lt;element name="Ort" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_40"/>
			 *         &lt;element name="Land">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence>
			 *                   &lt;element name="Wohnsitzlaendercode" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_3"/>
			 *                 &lt;/sequence>
			 *               &lt;/restriction>
			 *             &lt;/complexContent>
			 *           &lt;/complexType>
			 *         &lt;/element>
			 *         &lt;element name="Strasse" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_46" minOccurs="0"/>
			 *         &lt;element name="Hausnummer" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_9" minOccurs="0"/>
			 *         &lt;element name="Anschriftenzusatz" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_40" minOccurs="0"/>
			 *       &lt;/sequence>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "postleitzahl", "ort", "land", "strasse", "hausnummer",
					"anschriftenzusatz" })
			public static class StrassenAdresse
			{
				@XmlElement(name = "Postleitzahl", required = true)
				protected String postleitzahl;
				@XmlElement(name = "Ort", required = true)
				protected String ort;
				@XmlElement(name = "Land", required = true)
				protected UCPersoenlicheVersichertendatenXML.Versicherter.Person.StrassenAdresse.Land land;
				@XmlElement(name = "Strasse")
				protected String strasse;
				@XmlElement(name = "Hausnummer")
				protected String hausnummer;
				@XmlElement(name = "Anschriftenzusatz")
				protected String anschriftenzusatz;

				/**
				 * Ruft den Wert der postleitzahl-Eigenschaft ab.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getPostleitzahl()
				{
					return postleitzahl;
				}

				/**
				 * Legt den Wert der postleitzahl-Eigenschaft fest.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setPostleitzahl(String value)
				{
					this.postleitzahl = value;
				}

				/**
				 * Ruft den Wert der ort-Eigenschaft ab.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getOrt()
				{
					return ort;
				}

				/**
				 * Legt den Wert der ort-Eigenschaft fest.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setOrt(String value)
				{
					this.ort = value;
				}

				/**
				 * Ruft den Wert der land-Eigenschaft ab.
				 * 
				 * @return possible object is
				 *         {@link UCPersoenlicheVersichertendatenXML.Versicherter.Person.StrassenAdresse.Land }
				 * 
				 */
				public UCPersoenlicheVersichertendatenXML.Versicherter.Person.StrassenAdresse.Land getLand()
				{
					return land;
				}

				/**
				 * Legt den Wert der land-Eigenschaft fest.
				 * 
				 * @param value
				 *            allowed object is
				 *            {@link UCPersoenlicheVersichertendatenXML.Versicherter.Person.StrassenAdresse.Land }
				 * 
				 */
				public void setLand(UCPersoenlicheVersichertendatenXML.Versicherter.Person.StrassenAdresse.Land value)
				{
					this.land = value;
				}

				/**
				 * Ruft den Wert der strasse-Eigenschaft ab.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getStrasse()
				{
					return strasse;
				}

				/**
				 * Legt den Wert der strasse-Eigenschaft fest.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setStrasse(String value)
				{
					this.strasse = value;
				}

				/**
				 * Ruft den Wert der hausnummer-Eigenschaft ab.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getHausnummer()
				{
					return hausnummer;
				}

				/**
				 * Legt den Wert der hausnummer-Eigenschaft fest.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setHausnummer(String value)
				{
					this.hausnummer = value;
				}

				/**
				 * Ruft den Wert der anschriftenzusatz-Eigenschaft ab.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getAnschriftenzusatz()
				{
					return anschriftenzusatz;
				}

				/**
				 * Legt den Wert der anschriftenzusatz-Eigenschaft fest.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setAnschriftenzusatz(String value)
				{
					this.anschriftenzusatz = value;
				}

				/**
				 * <p>
				 * Java-Klasse für anonymous complex type.
				 * 
				 * <p>
				 * Das folgende Schemafragment gibt den erwarteten Content an,
				 * der in dieser Klasse enthalten ist.
				 * 
				 * <pre>
				 * &lt;complexType>
				 *   &lt;complexContent>
				 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *       &lt;sequence>
				 *         &lt;element name="Wohnsitzlaendercode" type="{http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1}TF_Textstring_3"/>
				 *       &lt;/sequence>
				 *     &lt;/restriction>
				 *   &lt;/complexContent>
				 * &lt;/complexType>
				 * </pre>
				 * 
				 * 
				 */
				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = { "wohnsitzlaendercode" })
				public static class Land
				{
					@XmlElement(name = "Wohnsitzlaendercode", required = true)
					protected String wohnsitzlaendercode;

					/**
					 * Ruft den Wert der wohnsitzlaendercode-Eigenschaft ab.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getWohnsitzlaendercode()
					{
						return wohnsitzlaendercode;
					}

					/**
					 * Legt den Wert der wohnsitzlaendercode-Eigenschaft fest.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setWohnsitzlaendercode(String value)
					{
						this.wohnsitzlaendercode = value;
					}
				}
			}
		}
	}
}
