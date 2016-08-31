//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.07.01 um 04:26:36 PM CEST 
//

package de.gecko.egkfeuer.model.ekg.v51.vd;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

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
 *                   &lt;element name="Versicherungsschutz">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Beginn" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ZP_Zeitpunkt_8"/>
 *                             &lt;element name="Ende" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ZP_Zeitpunkt_8" minOccurs="0"/>
 *                             &lt;element name="Kostentraeger">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Kostentraegerkennung" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ID_ID_Nummer_9"/>
 *                                       &lt;element name="Kostentraegerlaendercode" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_3"/>
 *                                       &lt;element name="Name" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_45"/>
 *                                       &lt;element name="AbrechnenderKostentraeger" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Kostentraegerkennung" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ID_ID_Nummer_9"/>
 *                                                 &lt;element name="Name" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_45"/>
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
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Zusatzinfos">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="ZusatzinfosGKV">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="Rechtskreis" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_1"/>
 *                                         &lt;element name="Versichertenart" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_1"/>
 *                                         &lt;element name="Versichertenstatus_RSA" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_1"/>
 *                                         &lt;element name="Zusatzinfos_Abrechnung_GKV">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="Kostenerstattung_ambulant" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ID_ID_Nummer_1"/>
 *                                                   &lt;element name="Kostenerstattung_stationaer" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ID_ID_Nummer_1"/>
 *                                                   &lt;element name="WOP" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_2" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="ZusatzinfosPKV">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="PKV_Verbandstarif" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_2"/>
 *                                         &lt;element name="Beihilfeberechtigung" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="Kennzeichnung" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_2"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="StationaereLeistungen" maxOccurs="unbounded" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="Stationaere_Wahlleistung_Unterkunft" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_2" minOccurs="0"/>
 *                                                   &lt;element name="Prozentwert_Wahlleistung_Unterkunft" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}FK_Festkommazahl_3" minOccurs="0"/>
 *                                                   &lt;element name="HoechstsatzWahlleistungUnterkunft" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}GK_Gleitkommazahl_6" minOccurs="0"/>
 *                                                   &lt;element name="Stationaere_Wahlleistung_aerztliche_Behandlung" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ID_ID_Nummer_2" minOccurs="0"/>
 *                                                   &lt;element name="Prozentwert_Wahlleistung_aerztliche_Behandlung" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}FK_Festkommazahl_3" minOccurs="0"/>
 *                                                   &lt;element name="Teilnahme_ClinicCard_Verfahren" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_1"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/choice>
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
@XmlRootElement(name = "UC_AllgemeineVersicherungsdatenXML")
public class UCAllgemeineVersicherungsdatenXML
{
	@XmlElement(name = "Versicherter", required = true)
	protected UCAllgemeineVersicherungsdatenXML.Versicherter versicherter;
	@XmlAttribute(name = "CDM_VERSION", required = true)
	protected String cdmversion;

	/**
	 * Ruft den Wert der versicherter-Eigenschaft ab.
	 * 
	 * @return possible object is
	 *         {@link UCAllgemeineVersicherungsdatenXML.Versicherter }
	 * 
	 */
	public UCAllgemeineVersicherungsdatenXML.Versicherter getVersicherter()
	{
		return versicherter;
	}

	/**
	 * Legt den Wert der versicherter-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is
	 *            {@link UCAllgemeineVersicherungsdatenXML.Versicherter }
	 * 
	 */
	public void setVersicherter(UCAllgemeineVersicherungsdatenXML.Versicherter value)
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
	 *         &lt;element name="Versicherungsschutz">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="Beginn" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ZP_Zeitpunkt_8"/>
	 *                   &lt;element name="Ende" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ZP_Zeitpunkt_8" minOccurs="0"/>
	 *                   &lt;element name="Kostentraeger">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="Kostentraegerkennung" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ID_ID_Nummer_9"/>
	 *                             &lt;element name="Kostentraegerlaendercode" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_3"/>
	 *                             &lt;element name="Name" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_45"/>
	 *                             &lt;element name="AbrechnenderKostentraeger" minOccurs="0">
	 *                               &lt;complexType>
	 *                                 &lt;complexContent>
	 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                     &lt;sequence>
	 *                                       &lt;element name="Kostentraegerkennung" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ID_ID_Nummer_9"/>
	 *                                       &lt;element name="Name" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_45"/>
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
	 *         &lt;element name="Zusatzinfos">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;choice>
	 *                     &lt;element name="ZusatzinfosGKV">
	 *                       &lt;complexType>
	 *                         &lt;complexContent>
	 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                             &lt;sequence>
	 *                               &lt;element name="Rechtskreis" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_1"/>
	 *                               &lt;element name="Versichertenart" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_1"/>
	 *                               &lt;element name="Versichertenstatus_RSA" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_1"/>
	 *                               &lt;element name="Zusatzinfos_Abrechnung_GKV">
	 *                                 &lt;complexType>
	 *                                   &lt;complexContent>
	 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                       &lt;sequence>
	 *                                         &lt;element name="Kostenerstattung_ambulant" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ID_ID_Nummer_1"/>
	 *                                         &lt;element name="Kostenerstattung_stationaer" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ID_ID_Nummer_1"/>
	 *                                         &lt;element name="WOP" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_2" minOccurs="0"/>
	 *                                       &lt;/sequence>
	 *                                     &lt;/restriction>
	 *                                   &lt;/complexContent>
	 *                                 &lt;/complexType>
	 *                               &lt;/element>
	 *                             &lt;/sequence>
	 *                           &lt;/restriction>
	 *                         &lt;/complexContent>
	 *                       &lt;/complexType>
	 *                     &lt;/element>
	 *                     &lt;element name="ZusatzinfosPKV">
	 *                       &lt;complexType>
	 *                         &lt;complexContent>
	 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                             &lt;sequence>
	 *                               &lt;element name="PKV_Verbandstarif" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_2"/>
	 *                               &lt;element name="Beihilfeberechtigung" minOccurs="0">
	 *                                 &lt;complexType>
	 *                                   &lt;complexContent>
	 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                       &lt;sequence>
	 *                                         &lt;element name="Kennzeichnung" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_2"/>
	 *                                       &lt;/sequence>
	 *                                     &lt;/restriction>
	 *                                   &lt;/complexContent>
	 *                                 &lt;/complexType>
	 *                               &lt;/element>
	 *                               &lt;element name="StationaereLeistungen" maxOccurs="unbounded" minOccurs="0">
	 *                                 &lt;complexType>
	 *                                   &lt;complexContent>
	 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                       &lt;sequence>
	 *                                         &lt;element name="Stationaere_Wahlleistung_Unterkunft" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_2" minOccurs="0"/>
	 *                                         &lt;element name="Prozentwert_Wahlleistung_Unterkunft" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}FK_Festkommazahl_3" minOccurs="0"/>
	 *                                         &lt;element name="HoechstsatzWahlleistungUnterkunft" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}GK_Gleitkommazahl_6" minOccurs="0"/>
	 *                                         &lt;element name="Stationaere_Wahlleistung_aerztliche_Behandlung" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ID_ID_Nummer_2" minOccurs="0"/>
	 *                                         &lt;element name="Prozentwert_Wahlleistung_aerztliche_Behandlung" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}FK_Festkommazahl_3" minOccurs="0"/>
	 *                                         &lt;element name="Teilnahme_ClinicCard_Verfahren" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_1"/>
	 *                                       &lt;/sequence>
	 *                                     &lt;/restriction>
	 *                                   &lt;/complexContent>
	 *                                 &lt;/complexType>
	 *                               &lt;/element>
	 *                             &lt;/sequence>
	 *                           &lt;/restriction>
	 *                         &lt;/complexContent>
	 *                       &lt;/complexType>
	 *                     &lt;/element>
	 *                   &lt;/choice>
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
	@XmlType(name = "", propOrder = { "versicherungsschutz", "zusatzinfos" })
	public static class Versicherter
	{
		@XmlElement(name = "Versicherungsschutz", required = true)
		protected UCAllgemeineVersicherungsdatenXML.Versicherter.Versicherungsschutz versicherungsschutz;
		@XmlElement(name = "Zusatzinfos", required = true)
		protected UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos zusatzinfos;

		/**
		 * Ruft den Wert der versicherungsschutz-Eigenschaft ab.
		 * 
		 * @return possible object is
		 *         {@link UCAllgemeineVersicherungsdatenXML.Versicherter.Versicherungsschutz }
		 * 
		 */
		public UCAllgemeineVersicherungsdatenXML.Versicherter.Versicherungsschutz getVersicherungsschutz()
		{
			return versicherungsschutz;
		}

		/**
		 * Legt den Wert der versicherungsschutz-Eigenschaft fest.
		 * 
		 * @param value
		 *            allowed object is
		 *            {@link UCAllgemeineVersicherungsdatenXML.Versicherter.Versicherungsschutz }
		 * 
		 */
		public void setVersicherungsschutz(UCAllgemeineVersicherungsdatenXML.Versicherter.Versicherungsschutz value)
		{
			this.versicherungsschutz = value;
		}

		/**
		 * Ruft den Wert der zusatzinfos-Eigenschaft ab.
		 * 
		 * @return possible object is
		 *         {@link UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos }
		 * 
		 */
		public UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos getZusatzinfos()
		{
			return zusatzinfos;
		}

		/**
		 * Legt den Wert der zusatzinfos-Eigenschaft fest.
		 * 
		 * @param value
		 *            allowed object is
		 *            {@link UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos }
		 * 
		 */
		public void setZusatzinfos(UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos value)
		{
			this.zusatzinfos = value;
		}

		/**
		 * <p>
		 * Java-Klasse f�r anonymous complex type.
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
		 *         &lt;element name="Beginn" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ZP_Zeitpunkt_8"/>
		 *         &lt;element name="Ende" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ZP_Zeitpunkt_8" minOccurs="0"/>
		 *         &lt;element name="Kostentraeger">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="Kostentraegerkennung" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ID_ID_Nummer_9"/>
		 *                   &lt;element name="Kostentraegerlaendercode" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_3"/>
		 *                   &lt;element name="Name" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_45"/>
		 *                   &lt;element name="AbrechnenderKostentraeger" minOccurs="0">
		 *                     &lt;complexType>
		 *                       &lt;complexContent>
		 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                           &lt;sequence>
		 *                             &lt;element name="Kostentraegerkennung" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ID_ID_Nummer_9"/>
		 *                             &lt;element name="Name" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_45"/>
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
		@XmlType(name = "", propOrder = { "beginn", "ende", "kostentraeger" })
		public static class Versicherungsschutz
		{
			@XmlElement(name = "Beginn", required = true)
			protected String beginn;
			@XmlElement(name = "Ende")
			protected String ende;
			@XmlElement(name = "Kostentraeger", required = true)
			protected UCAllgemeineVersicherungsdatenXML.Versicherter.Versicherungsschutz.Kostentraeger kostentraeger;

			/**
			 * Ruft den Wert der beginn-Eigenschaft ab.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getBeginn()
			{
				return beginn;
			}

			/**
			 * Legt den Wert der beginn-Eigenschaft fest.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setBeginn(String value)
			{
				this.beginn = value;
			}

			/**
			 * Ruft den Wert der ende-Eigenschaft ab.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEnde()
			{
				return ende;
			}

			/**
			 * Legt den Wert der ende-Eigenschaft fest.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEnde(String value)
			{
				this.ende = value;
			}

			/**
			 * Ruft den Wert der kostentraeger-Eigenschaft ab.
			 * 
			 * @return possible object is
			 *         {@link UCAllgemeineVersicherungsdatenXML.Versicherter.Versicherungsschutz.Kostentraeger }
			 * 
			 */
			public UCAllgemeineVersicherungsdatenXML.Versicherter.Versicherungsschutz.Kostentraeger getKostentraeger()
			{
				return kostentraeger;
			}

			/**
			 * Legt den Wert der kostentraeger-Eigenschaft fest.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link UCAllgemeineVersicherungsdatenXML.Versicherter.Versicherungsschutz.Kostentraeger }
			 * 
			 */
			public void setKostentraeger(
					UCAllgemeineVersicherungsdatenXML.Versicherter.Versicherungsschutz.Kostentraeger value)
			{
				this.kostentraeger = value;
			}

			/**
			 * <p>
			 * Java-Klasse f�r anonymous complex type.
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
			 *         &lt;element name="Kostentraegerkennung" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ID_ID_Nummer_9"/>
			 *         &lt;element name="Kostentraegerlaendercode" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_3"/>
			 *         &lt;element name="Name" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_45"/>
			 *         &lt;element name="AbrechnenderKostentraeger" minOccurs="0">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence>
			 *                   &lt;element name="Kostentraegerkennung" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ID_ID_Nummer_9"/>
			 *                   &lt;element name="Name" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_45"/>
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
			@XmlType(name = "", propOrder = { "kostentraegerkennung", "kostentraegerlaendercode", "name",
					"abrechnenderKostentraeger" })
			public static class Kostentraeger
			{
				@XmlElement(name = "Kostentraegerkennung", required = true)
				protected BigInteger kostentraegerkennung;
				@XmlElement(name = "Kostentraegerlaendercode", required = true)
				protected String kostentraegerlaendercode;
				@XmlElement(name = "Name", required = true)
				protected String name;
				@XmlElement(name = "AbrechnenderKostentraeger")
				protected UCAllgemeineVersicherungsdatenXML.Versicherter.Versicherungsschutz.Kostentraeger.AbrechnenderKostentraeger abrechnenderKostentraeger;

				/**
				 * Ruft den Wert der kostentraegerkennung-Eigenschaft ab.
				 * 
				 * @return possible object is {@link BigInteger }
				 * 
				 */
				public BigInteger getKostentraegerkennung()
				{
					return kostentraegerkennung;
				}

				/**
				 * Legt den Wert der kostentraegerkennung-Eigenschaft fest.
				 * 
				 * @param value
				 *            allowed object is {@link BigInteger }
				 * 
				 */
				public void setKostentraegerkennung(BigInteger value)
				{
					this.kostentraegerkennung = value;
				}

				/**
				 * Ruft den Wert der kostentraegerlaendercode-Eigenschaft ab.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getKostentraegerlaendercode()
				{
					return kostentraegerlaendercode;
				}

				/**
				 * Legt den Wert der kostentraegerlaendercode-Eigenschaft fest.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setKostentraegerlaendercode(String value)
				{
					this.kostentraegerlaendercode = value;
				}

				/**
				 * Ruft den Wert der name-Eigenschaft ab.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getName()
				{
					return name;
				}

				/**
				 * Legt den Wert der name-Eigenschaft fest.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setName(String value)
				{
					this.name = value;
				}

				/**
				 * Ruft den Wert der abrechnenderKostentraeger-Eigenschaft ab.
				 * 
				 * @return possible object is
				 *         {@link UCAllgemeineVersicherungsdatenXML.Versicherter.Versicherungsschutz.Kostentraeger.AbrechnenderKostentraeger }
				 * 
				 */
				public UCAllgemeineVersicherungsdatenXML.Versicherter.Versicherungsschutz.Kostentraeger.AbrechnenderKostentraeger getAbrechnenderKostentraeger()
				{
					return abrechnenderKostentraeger;
				}

				/**
				 * Legt den Wert der abrechnenderKostentraeger-Eigenschaft fest.
				 * 
				 * @param value
				 *            allowed object is
				 *            {@link UCAllgemeineVersicherungsdatenXML.Versicherter.Versicherungsschutz.Kostentraeger.AbrechnenderKostentraeger }
				 * 
				 */
				public void setAbrechnenderKostentraeger(
						UCAllgemeineVersicherungsdatenXML.Versicherter.Versicherungsschutz.Kostentraeger.AbrechnenderKostentraeger value)
				{
					this.abrechnenderKostentraeger = value;
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
				 *         &lt;element name="Kostentraegerkennung" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ID_ID_Nummer_9"/>
				 *         &lt;element name="Name" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_45"/>
				 *       &lt;/sequence>
				 *     &lt;/restriction>
				 *   &lt;/complexContent>
				 * &lt;/complexType>
				 * </pre>
				 * 
				 * 
				 */
				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = { "kostentraegerkennung", "name" })
				public static class AbrechnenderKostentraeger
				{
					@XmlElement(name = "Kostentraegerkennung", required = true)
					protected BigInteger kostentraegerkennung;
					@XmlElement(name = "Name", required = true)
					protected String name;

					/**
					 * Ruft den Wert der kostentraegerkennung-Eigenschaft ab.
					 * 
					 * @return possible object is {@link BigInteger }
					 * 
					 */
					public BigInteger getKostentraegerkennung()
					{
						return kostentraegerkennung;
					}

					/**
					 * Legt den Wert der kostentraegerkennung-Eigenschaft fest.
					 * 
					 * @param value
					 *            allowed object is {@link BigInteger }
					 * 
					 */
					public void setKostentraegerkennung(BigInteger value)
					{
						this.kostentraegerkennung = value;
					}

					/**
					 * Ruft den Wert der name-Eigenschaft ab.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getName()
					{
						return name;
					}

					/**
					 * Legt den Wert der name-Eigenschaft fest.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setName(String value)
					{
						this.name = value;
					}
				}
			}
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
		 *         &lt;choice>
		 *           &lt;element name="ZusatzinfosGKV">
		 *             &lt;complexType>
		 *               &lt;complexContent>
		 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                   &lt;sequence>
		 *                     &lt;element name="Rechtskreis" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_1"/>
		 *                     &lt;element name="Versichertenart" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_1"/>
		 *                     &lt;element name="Versichertenstatus_RSA" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_1"/>
		 *                     &lt;element name="Zusatzinfos_Abrechnung_GKV">
		 *                       &lt;complexType>
		 *                         &lt;complexContent>
		 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                             &lt;sequence>
		 *                               &lt;element name="Kostenerstattung_ambulant" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ID_ID_Nummer_1"/>
		 *                               &lt;element name="Kostenerstattung_stationaer" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ID_ID_Nummer_1"/>
		 *                               &lt;element name="WOP" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_2" minOccurs="0"/>
		 *                             &lt;/sequence>
		 *                           &lt;/restriction>
		 *                         &lt;/complexContent>
		 *                       &lt;/complexType>
		 *                     &lt;/element>
		 *                   &lt;/sequence>
		 *                 &lt;/restriction>
		 *               &lt;/complexContent>
		 *             &lt;/complexType>
		 *           &lt;/element>
		 *           &lt;element name="ZusatzinfosPKV">
		 *             &lt;complexType>
		 *               &lt;complexContent>
		 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                   &lt;sequence>
		 *                     &lt;element name="PKV_Verbandstarif" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_2"/>
		 *                     &lt;element name="Beihilfeberechtigung" minOccurs="0">
		 *                       &lt;complexType>
		 *                         &lt;complexContent>
		 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                             &lt;sequence>
		 *                               &lt;element name="Kennzeichnung" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_2"/>
		 *                             &lt;/sequence>
		 *                           &lt;/restriction>
		 *                         &lt;/complexContent>
		 *                       &lt;/complexType>
		 *                     &lt;/element>
		 *                     &lt;element name="StationaereLeistungen" maxOccurs="unbounded" minOccurs="0">
		 *                       &lt;complexType>
		 *                         &lt;complexContent>
		 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                             &lt;sequence>
		 *                               &lt;element name="Stationaere_Wahlleistung_Unterkunft" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_2" minOccurs="0"/>
		 *                               &lt;element name="Prozentwert_Wahlleistung_Unterkunft" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}FK_Festkommazahl_3" minOccurs="0"/>
		 *                               &lt;element name="HoechstsatzWahlleistungUnterkunft" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}GK_Gleitkommazahl_6" minOccurs="0"/>
		 *                               &lt;element name="Stationaere_Wahlleistung_aerztliche_Behandlung" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ID_ID_Nummer_2" minOccurs="0"/>
		 *                               &lt;element name="Prozentwert_Wahlleistung_aerztliche_Behandlung" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}FK_Festkommazahl_3" minOccurs="0"/>
		 *                               &lt;element name="Teilnahme_ClinicCard_Verfahren" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_1"/>
		 *                             &lt;/sequence>
		 *                           &lt;/restriction>
		 *                         &lt;/complexContent>
		 *                       &lt;/complexType>
		 *                     &lt;/element>
		 *                   &lt;/sequence>
		 *                 &lt;/restriction>
		 *               &lt;/complexContent>
		 *             &lt;/complexType>
		 *           &lt;/element>
		 *         &lt;/choice>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "zusatzinfosGKV", "zusatzinfosPKV" })
		public static class Zusatzinfos
		{
			@XmlElement(name = "ZusatzinfosGKV")
			protected UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosGKV zusatzinfosGKV;
			@XmlElement(name = "ZusatzinfosPKV")
			protected UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosPKV zusatzinfosPKV;

			/**
			 * Ruft den Wert der zusatzinfosGKV-Eigenschaft ab.
			 * 
			 * @return possible object is
			 *         {@link UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosGKV }
			 * 
			 */
			public UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosGKV getZusatzinfosGKV()
			{
				return zusatzinfosGKV;
			}

			/**
			 * Legt den Wert der zusatzinfosGKV-Eigenschaft fest.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosGKV }
			 * 
			 */
			public void setZusatzinfosGKV(
					UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosGKV value)
			{
				this.zusatzinfosGKV = value;
			}

			/**
			 * Ruft den Wert der zusatzinfosPKV-Eigenschaft ab.
			 * 
			 * @return possible object is
			 *         {@link UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosPKV }
			 * 
			 */
			public UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosPKV getZusatzinfosPKV()
			{
				return zusatzinfosPKV;
			}

			/**
			 * Legt den Wert der zusatzinfosPKV-Eigenschaft fest.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosPKV }
			 * 
			 */
			public void setZusatzinfosPKV(
					UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosPKV value)
			{
				this.zusatzinfosPKV = value;
			}

			/**
			 * <p>
			 * Java-Klasse f�r anonymous complex type.
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
			 *         &lt;element name="Rechtskreis" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_1"/>
			 *         &lt;element name="Versichertenart" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_1"/>
			 *         &lt;element name="Versichertenstatus_RSA" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_1"/>
			 *         &lt;element name="Zusatzinfos_Abrechnung_GKV">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence>
			 *                   &lt;element name="Kostenerstattung_ambulant" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ID_ID_Nummer_1"/>
			 *                   &lt;element name="Kostenerstattung_stationaer" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ID_ID_Nummer_1"/>
			 *                   &lt;element name="WOP" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_2" minOccurs="0"/>
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
			@XmlType(name = "", propOrder = { "rechtskreis", "versichertenart", "versichertenstatusRSA",
					"zusatzinfosAbrechnungGKV" })
			public static class ZusatzinfosGKV
			{
				@XmlElement(name = "Rechtskreis", required = true)
				protected String rechtskreis;
				@XmlElement(name = "Versichertenart", required = true)
				protected String versichertenart;
				@XmlElement(name = "Versichertenstatus_RSA", required = true)
				protected String versichertenstatusRSA;
				@XmlElement(name = "Zusatzinfos_Abrechnung_GKV", required = true)
				protected UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosGKV.ZusatzinfosAbrechnungGKV zusatzinfosAbrechnungGKV;

				/**
				 * Ruft den Wert der rechtskreis-Eigenschaft ab.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getRechtskreis()
				{
					return rechtskreis;
				}

				/**
				 * Legt den Wert der rechtskreis-Eigenschaft fest.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setRechtskreis(String value)
				{
					this.rechtskreis = value;
				}

				/**
				 * Ruft den Wert der versichertenart-Eigenschaft ab.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getVersichertenart()
				{
					return versichertenart;
				}

				/**
				 * Legt den Wert der versichertenart-Eigenschaft fest.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setVersichertenart(String value)
				{
					this.versichertenart = value;
				}

				/**
				 * Ruft den Wert der versichertenstatusRSA-Eigenschaft ab.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getVersichertenstatusRSA()
				{
					return versichertenstatusRSA;
				}

				/**
				 * Legt den Wert der versichertenstatusRSA-Eigenschaft fest.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setVersichertenstatusRSA(String value)
				{
					this.versichertenstatusRSA = value;
				}

				/**
				 * Ruft den Wert der zusatzinfosAbrechnungGKV-Eigenschaft ab.
				 * 
				 * @return possible object is
				 *         {@link UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosGKV.ZusatzinfosAbrechnungGKV }
				 * 
				 */
				public UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosGKV.ZusatzinfosAbrechnungGKV getZusatzinfosAbrechnungGKV()
				{
					return zusatzinfosAbrechnungGKV;
				}

				/**
				 * Legt den Wert der zusatzinfosAbrechnungGKV-Eigenschaft fest.
				 * 
				 * @param value
				 *            allowed object is
				 *            {@link UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosGKV.ZusatzinfosAbrechnungGKV }
				 * 
				 */
				public void setZusatzinfosAbrechnungGKV(
						UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosGKV.ZusatzinfosAbrechnungGKV value)
				{
					this.zusatzinfosAbrechnungGKV = value;
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
				 *         &lt;element name="Kostenerstattung_ambulant" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ID_ID_Nummer_1"/>
				 *         &lt;element name="Kostenerstattung_stationaer" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ID_ID_Nummer_1"/>
				 *         &lt;element name="WOP" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_2" minOccurs="0"/>
				 *       &lt;/sequence>
				 *     &lt;/restriction>
				 *   &lt;/complexContent>
				 * &lt;/complexType>
				 * </pre>
				 * 
				 * 
				 */
				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = { "kostenerstattungAmbulant", "kostenerstattungStationaer", "wop" })
				public static class ZusatzinfosAbrechnungGKV
				{
					@XmlElement(name = "Kostenerstattung_ambulant", required = true)
					protected BigInteger kostenerstattungAmbulant;
					@XmlElement(name = "Kostenerstattung_stationaer", required = true)
					protected BigInteger kostenerstattungStationaer;
					@XmlElement(name = "WOP")
					protected String wop;

					/**
					 * Ruft den Wert der kostenerstattungAmbulant-Eigenschaft
					 * ab.
					 * 
					 * @return possible object is {@link BigInteger }
					 * 
					 */
					public BigInteger getKostenerstattungAmbulant()
					{
						return kostenerstattungAmbulant;
					}

					/**
					 * Legt den Wert der kostenerstattungAmbulant-Eigenschaft
					 * fest.
					 * 
					 * @param value
					 *            allowed object is {@link BigInteger }
					 * 
					 */
					public void setKostenerstattungAmbulant(BigInteger value)
					{
						this.kostenerstattungAmbulant = value;
					}

					/**
					 * Ruft den Wert der kostenerstattungStationaer-Eigenschaft
					 * ab.
					 * 
					 * @return possible object is {@link BigInteger }
					 * 
					 */
					public BigInteger getKostenerstattungStationaer()
					{
						return kostenerstattungStationaer;
					}

					/**
					 * Legt den Wert der kostenerstattungStationaer-Eigenschaft
					 * fest.
					 * 
					 * @param value
					 *            allowed object is {@link BigInteger }
					 * 
					 */
					public void setKostenerstattungStationaer(BigInteger value)
					{
						this.kostenerstattungStationaer = value;
					}

					/**
					 * Ruft den Wert der wop-Eigenschaft ab.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getWOP()
					{
						return wop;
					}

					/**
					 * Legt den Wert der wop-Eigenschaft fest.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setWOP(String value)
					{
						this.wop = value;
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
			 *         &lt;element name="PKV_Verbandstarif" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_2"/>
			 *         &lt;element name="Beihilfeberechtigung" minOccurs="0">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence>
			 *                   &lt;element name="Kennzeichnung" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_2"/>
			 *                 &lt;/sequence>
			 *               &lt;/restriction>
			 *             &lt;/complexContent>
			 *           &lt;/complexType>
			 *         &lt;/element>
			 *         &lt;element name="StationaereLeistungen" maxOccurs="unbounded" minOccurs="0">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence>
			 *                   &lt;element name="Stationaere_Wahlleistung_Unterkunft" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_2" minOccurs="0"/>
			 *                   &lt;element name="Prozentwert_Wahlleistung_Unterkunft" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}FK_Festkommazahl_3" minOccurs="0"/>
			 *                   &lt;element name="HoechstsatzWahlleistungUnterkunft" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}GK_Gleitkommazahl_6" minOccurs="0"/>
			 *                   &lt;element name="Stationaere_Wahlleistung_aerztliche_Behandlung" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ID_ID_Nummer_2" minOccurs="0"/>
			 *                   &lt;element name="Prozentwert_Wahlleistung_aerztliche_Behandlung" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}FK_Festkommazahl_3" minOccurs="0"/>
			 *                   &lt;element name="Teilnahme_ClinicCard_Verfahren" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_1"/>
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
			@XmlType(name = "", propOrder = { "pkvVerbandstarif", "beihilfeberechtigung", "stationaereLeistungen" })
			public static class ZusatzinfosPKV
			{
				@XmlElement(name = "PKV_Verbandstarif", required = true)
				protected String pkvVerbandstarif;
				@XmlElement(name = "Beihilfeberechtigung")
				protected UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosPKV.Beihilfeberechtigung beihilfeberechtigung;
				@XmlElement(name = "StationaereLeistungen")
				protected List<UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosPKV.StationaereLeistungen> stationaereLeistungen;

				/**
				 * Ruft den Wert der pkvVerbandstarif-Eigenschaft ab.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getPKVVerbandstarif()
				{
					return pkvVerbandstarif;
				}

				/**
				 * Legt den Wert der pkvVerbandstarif-Eigenschaft fest.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setPKVVerbandstarif(String value)
				{
					this.pkvVerbandstarif = value;
				}

				/**
				 * Ruft den Wert der beihilfeberechtigung-Eigenschaft ab.
				 * 
				 * @return possible object is
				 *         {@link UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosPKV.Beihilfeberechtigung }
				 * 
				 */
				public UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosPKV.Beihilfeberechtigung getBeihilfeberechtigung()
				{
					return beihilfeberechtigung;
				}

				/**
				 * Legt den Wert der beihilfeberechtigung-Eigenschaft fest.
				 * 
				 * @param value
				 *            allowed object is
				 *            {@link UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosPKV.Beihilfeberechtigung }
				 * 
				 */
				public void setBeihilfeberechtigung(
						UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosPKV.Beihilfeberechtigung value)
				{
					this.beihilfeberechtigung = value;
				}

				/**
				 * Gets the value of the stationaereLeistungen property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list,
				 * not a snapshot. Therefore any modification you make to the
				 * returned list will be present inside the JAXB object. This is
				 * why there is not a <CODE>set</CODE> method for the
				 * stationaereLeistungen property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * 
				 * <pre>
				 * getStationaereLeistungen().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosPKV.StationaereLeistungen }
				 * 
				 * 
				 */
				public List<UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosPKV.StationaereLeistungen> getStationaereLeistungen()
				{
					if (stationaereLeistungen == null)
					{
						stationaereLeistungen = new ArrayList<UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosPKV.StationaereLeistungen>();
					}
					return this.stationaereLeistungen;
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
				 *         &lt;element name="Kennzeichnung" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_2"/>
				 *       &lt;/sequence>
				 *     &lt;/restriction>
				 *   &lt;/complexContent>
				 * &lt;/complexType>
				 * </pre>
				 * 
				 * 
				 */
				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = { "kennzeichnung" })
				public static class Beihilfeberechtigung
				{
					@XmlElement(name = "Kennzeichnung", required = true)
					protected String kennzeichnung;

					/**
					 * Ruft den Wert der kennzeichnung-Eigenschaft ab.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getKennzeichnung()
					{
						return kennzeichnung;
					}

					/**
					 * Legt den Wert der kennzeichnung-Eigenschaft fest.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setKennzeichnung(String value)
					{
						this.kennzeichnung = value;
					}

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
				 *         &lt;element name="Stationaere_Wahlleistung_Unterkunft" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_2" minOccurs="0"/>
				 *         &lt;element name="Prozentwert_Wahlleistung_Unterkunft" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}FK_Festkommazahl_3" minOccurs="0"/>
				 *         &lt;element name="HoechstsatzWahlleistungUnterkunft" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}GK_Gleitkommazahl_6" minOccurs="0"/>
				 *         &lt;element name="Stationaere_Wahlleistung_aerztliche_Behandlung" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}ID_ID_Nummer_2" minOccurs="0"/>
				 *         &lt;element name="Prozentwert_Wahlleistung_aerztliche_Behandlung" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}FK_Festkommazahl_3" minOccurs="0"/>
				 *         &lt;element name="Teilnahme_ClinicCard_Verfahren" type="{http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1}TF_Textstring_1"/>
				 *       &lt;/sequence>
				 *     &lt;/restriction>
				 *   &lt;/complexContent>
				 * &lt;/complexType>
				 * </pre>
				 * 
				 * 
				 */
				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = { "stationaereWahlleistungUnterkunft",
						"prozentwertWahlleistungUnterkunft", "hoechstsatzWahlleistungUnterkunft",
						"stationaereWahlleistungAerztlicheBehandlung", "prozentwertWahlleistungAerztlicheBehandlung",
						"teilnahmeClinicCardVerfahren" })
				public static class StationaereLeistungen
				{
					@XmlElement(name = "Stationaere_Wahlleistung_Unterkunft")
					protected String stationaereWahlleistungUnterkunft;
					@XmlElement(name = "Prozentwert_Wahlleistung_Unterkunft")
					protected BigDecimal prozentwertWahlleistungUnterkunft;
					@XmlElement(name = "HoechstsatzWahlleistungUnterkunft")
					protected BigDecimal hoechstsatzWahlleistungUnterkunft;
					@XmlElement(name = "Stationaere_Wahlleistung_aerztliche_Behandlung")
					protected BigInteger stationaereWahlleistungAerztlicheBehandlung;
					@XmlElement(name = "Prozentwert_Wahlleistung_aerztliche_Behandlung")
					protected BigDecimal prozentwertWahlleistungAerztlicheBehandlung;
					@XmlElement(name = "Teilnahme_ClinicCard_Verfahren", required = true)
					protected String teilnahmeClinicCardVerfahren;

					/**
					 * Ruft den Wert der
					 * stationaereWahlleistungUnterkunft-Eigenschaft ab.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getStationaereWahlleistungUnterkunft()
					{
						return stationaereWahlleistungUnterkunft;
					}

					/**
					 * Legt den Wert der
					 * stationaereWahlleistungUnterkunft-Eigenschaft fest.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setStationaereWahlleistungUnterkunft(String value)
					{
						this.stationaereWahlleistungUnterkunft = value;
					}

					/**
					 * Ruft den Wert der
					 * prozentwertWahlleistungUnterkunft-Eigenschaft ab.
					 * 
					 * @return possible object is {@link BigDecimal }
					 * 
					 */
					public BigDecimal getProzentwertWahlleistungUnterkunft()
					{
						return prozentwertWahlleistungUnterkunft;
					}

					/**
					 * Legt den Wert der
					 * prozentwertWahlleistungUnterkunft-Eigenschaft fest.
					 * 
					 * @param value
					 *            allowed object is {@link BigDecimal }
					 * 
					 */
					public void setProzentwertWahlleistungUnterkunft(BigDecimal value)
					{
						this.prozentwertWahlleistungUnterkunft = value;
					}

					/**
					 * Ruft den Wert der
					 * hoechstsatzWahlleistungUnterkunft-Eigenschaft ab.
					 * 
					 * @return possible object is {@link BigDecimal }
					 * 
					 */
					public BigDecimal getHoechstsatzWahlleistungUnterkunft()
					{
						return hoechstsatzWahlleistungUnterkunft;
					}

					/**
					 * Legt den Wert der
					 * hoechstsatzWahlleistungUnterkunft-Eigenschaft fest.
					 * 
					 * @param value
					 *            allowed object is {@link BigDecimal }
					 * 
					 */
					public void setHoechstsatzWahlleistungUnterkunft(BigDecimal value)
					{
						this.hoechstsatzWahlleistungUnterkunft = value;
					}

					/**
					 * Ruft den Wert der
					 * stationaereWahlleistungAerztlicheBehandlung-Eigenschaft
					 * ab.
					 * 
					 * @return possible object is {@link BigInteger }
					 * 
					 */
					public BigInteger getStationaereWahlleistungAerztlicheBehandlung()
					{
						return stationaereWahlleistungAerztlicheBehandlung;
					}

					/**
					 * Legt den Wert der
					 * stationaereWahlleistungAerztlicheBehandlung-Eigenschaft
					 * fest.
					 * 
					 * @param value
					 *            allowed object is {@link BigInteger }
					 * 
					 */
					public void setStationaereWahlleistungAerztlicheBehandlung(BigInteger value)
					{
						this.stationaereWahlleistungAerztlicheBehandlung = value;
					}

					/**
					 * Ruft den Wert der
					 * prozentwertWahlleistungAerztlicheBehandlung-Eigenschaft
					 * ab.
					 * 
					 * @return possible object is {@link BigDecimal }
					 * 
					 */
					public BigDecimal getProzentwertWahlleistungAerztlicheBehandlung()
					{
						return prozentwertWahlleistungAerztlicheBehandlung;
					}

					/**
					 * Legt den Wert der
					 * prozentwertWahlleistungAerztlicheBehandlung-Eigenschaft
					 * fest.
					 * 
					 * @param value
					 *            allowed object is {@link BigDecimal }
					 * 
					 */
					public void setProzentwertWahlleistungAerztlicheBehandlung(BigDecimal value)
					{
						this.prozentwertWahlleistungAerztlicheBehandlung = value;
					}

					/**
					 * Ruft den Wert der
					 * teilnahmeClinicCardVerfahren-Eigenschaft ab.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getTeilnahmeClinicCardVerfahren()
					{
						return teilnahmeClinicCardVerfahren;
					}

					/**
					 * Legt den Wert der
					 * teilnahmeClinicCardVerfahren-Eigenschaft fest.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setTeilnahmeClinicCardVerfahren(String value)
					{
						this.teilnahmeClinicCardVerfahren = value;
					}
				}
			}
		}
	}
}
