//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.02.17 um 06:21:35 PM CET 
//

package de.gecko.egkfeuer.model.ekg.v52;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

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
 *                             &lt;element name="Beginn" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}ISO8601Date"/>
 *                             &lt;element name="Ende" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}ISO8601Date" minOccurs="0"/>
 *                             &lt;element name="Kostentraeger">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}Kostentraeger">
 *                                     &lt;sequence>
 *                                       &lt;element name="AbrechnenderKostentraeger" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}Kostentraeger" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
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
 *                             &lt;element name="ZusatzinfosGKV">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Versichertenart" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}codedString"/>
 *                                       &lt;element name="Zusatzinfos_Abrechnung_GKV">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Kostenerstattung" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="AerztlicheVersorgung" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}boolean"/>
 *                                                           &lt;element name="ZahnaerztlicheVersorgung" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}boolean"/>
 *                                                           &lt;element name="StationaererBereich" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}boolean"/>
 *                                                           &lt;element name="VeranlassteLeistungen" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}boolean"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="WOP" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}numberWithLeadingZero"/>
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
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="CDM_VERSION" use="required" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}CDMVersion" />
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
	 *                   &lt;element name="Beginn" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}ISO8601Date"/>
	 *                   &lt;element name="Ende" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}ISO8601Date" minOccurs="0"/>
	 *                   &lt;element name="Kostentraeger">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;extension base="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}Kostentraeger">
	 *                           &lt;sequence>
	 *                             &lt;element name="AbrechnenderKostentraeger" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}Kostentraeger" minOccurs="0"/>
	 *                           &lt;/sequence>
	 *                         &lt;/extension>
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
	 *                   &lt;element name="ZusatzinfosGKV">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="Versichertenart" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}codedString"/>
	 *                             &lt;element name="Zusatzinfos_Abrechnung_GKV">
	 *                               &lt;complexType>
	 *                                 &lt;complexContent>
	 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                     &lt;sequence>
	 *                                       &lt;element name="Kostenerstattung" minOccurs="0">
	 *                                         &lt;complexType>
	 *                                           &lt;complexContent>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                               &lt;sequence>
	 *                                                 &lt;element name="AerztlicheVersorgung" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}boolean"/>
	 *                                                 &lt;element name="ZahnaerztlicheVersorgung" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}boolean"/>
	 *                                                 &lt;element name="StationaererBereich" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}boolean"/>
	 *                                                 &lt;element name="VeranlassteLeistungen" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}boolean"/>
	 *                                               &lt;/sequence>
	 *                                             &lt;/restriction>
	 *                                           &lt;/complexContent>
	 *                                         &lt;/complexType>
	 *                                       &lt;/element>
	 *                                       &lt;element name="WOP" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}numberWithLeadingZero"/>
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
		 * Es handelt sich um eine Pflichtangabe.
		 * 
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
		 *         &lt;element name="Beginn" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}ISO8601Date"/>
		 *         &lt;element name="Ende" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}ISO8601Date" minOccurs="0"/>
		 *         &lt;element name="Kostentraeger">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;extension base="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}Kostentraeger">
		 *                 &lt;sequence>
		 *                   &lt;element name="AbrechnenderKostentraeger" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}Kostentraeger" minOccurs="0"/>
		 *                 &lt;/sequence>
		 *               &lt;/extension>
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
			 * Java-Klasse für anonymous complex type.
			 * 
			 * <p>
			 * Das folgende Schemafragment gibt den erwarteten Content an, der
			 * in dieser Klasse enthalten ist.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;extension base="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}Kostentraeger">
			 *       &lt;sequence>
			 *         &lt;element name="AbrechnenderKostentraeger" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}Kostentraeger" minOccurs="0"/>
			 *       &lt;/sequence>
			 *     &lt;/extension>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "abrechnenderKostentraeger" })
			public static class Kostentraeger extends de.gecko.egkfeuer.model.ekg.v52.Kostentraeger
			{

				@XmlElement(name = "AbrechnenderKostentraeger")
				protected de.gecko.egkfeuer.model.ekg.v52.Kostentraeger abrechnenderKostentraeger;

				/**
				 * Ruft den Wert der abrechnenderKostentraeger-Eigenschaft ab.
				 * 
				 * @return possible object is
				 *         {@link de.gecko.egkfeuer.model.ekg.v52.Kostentraeger }
				 * 
				 */
				public de.gecko.egkfeuer.model.ekg.v52.Kostentraeger getAbrechnenderKostentraeger()
				{
					return abrechnenderKostentraeger;
				}

				/**
				 * Legt den Wert der abrechnenderKostentraeger-Eigenschaft fest.
				 * 
				 * @param value
				 *            allowed object is
				 *            {@link de.gecko.egkfeuer.model.ekg.v52.Kostentraeger }
				 * 
				 */
				public void setAbrechnenderKostentraeger(de.gecko.egkfeuer.model.ekg.v52.Kostentraeger value)
				{
					this.abrechnenderKostentraeger = value;
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
		 *         &lt;element name="ZusatzinfosGKV">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="Versichertenart" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}codedString"/>
		 *                   &lt;element name="Zusatzinfos_Abrechnung_GKV">
		 *                     &lt;complexType>
		 *                       &lt;complexContent>
		 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                           &lt;sequence>
		 *                             &lt;element name="Kostenerstattung" minOccurs="0">
		 *                               &lt;complexType>
		 *                                 &lt;complexContent>
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                                     &lt;sequence>
		 *                                       &lt;element name="AerztlicheVersorgung" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}boolean"/>
		 *                                       &lt;element name="ZahnaerztlicheVersorgung" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}boolean"/>
		 *                                       &lt;element name="StationaererBereich" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}boolean"/>
		 *                                       &lt;element name="VeranlassteLeistungen" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}boolean"/>
		 *                                     &lt;/sequence>
		 *                                   &lt;/restriction>
		 *                                 &lt;/complexContent>
		 *                               &lt;/complexType>
		 *                             &lt;/element>
		 *                             &lt;element name="WOP" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}numberWithLeadingZero"/>
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
		@XmlType(name = "", propOrder = { "zusatzinfosGKV" })
		public static class Zusatzinfos
		{
			@XmlElement(name = "ZusatzinfosGKV", required = true)
			protected UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosGKV zusatzinfosGKV;

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
			 *         &lt;element name="Versichertenart" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}codedString"/>
			 *         &lt;element name="Zusatzinfos_Abrechnung_GKV">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence>
			 *                   &lt;element name="Kostenerstattung" minOccurs="0">
			 *                     &lt;complexType>
			 *                       &lt;complexContent>
			 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                           &lt;sequence>
			 *                             &lt;element name="AerztlicheVersorgung" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}boolean"/>
			 *                             &lt;element name="ZahnaerztlicheVersorgung" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}boolean"/>
			 *                             &lt;element name="StationaererBereich" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}boolean"/>
			 *                             &lt;element name="VeranlassteLeistungen" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}boolean"/>
			 *                           &lt;/sequence>
			 *                         &lt;/restriction>
			 *                       &lt;/complexContent>
			 *                     &lt;/complexType>
			 *                   &lt;/element>
			 *                   &lt;element name="WOP" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}numberWithLeadingZero"/>
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
			@XmlType(name = "", propOrder = { "versichertenart", "zusatzinfosAbrechnungGKV" })
			public static class ZusatzinfosGKV
			{
				@XmlElement(name = "Versichertenart", required = true)
				protected String versichertenart;
				@XmlElement(name = "Zusatzinfos_Abrechnung_GKV", required = true)
				protected UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosGKV.ZusatzinfosAbrechnungGKV zusatzinfosAbrechnungGKV;

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
				 *         &lt;element name="Kostenerstattung" minOccurs="0">
				 *           &lt;complexType>
				 *             &lt;complexContent>
				 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *                 &lt;sequence>
				 *                   &lt;element name="AerztlicheVersorgung" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}boolean"/>
				 *                   &lt;element name="ZahnaerztlicheVersorgung" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}boolean"/>
				 *                   &lt;element name="StationaererBereich" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}boolean"/>
				 *                   &lt;element name="VeranlassteLeistungen" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}boolean"/>
				 *                 &lt;/sequence>
				 *               &lt;/restriction>
				 *             &lt;/complexContent>
				 *           &lt;/complexType>
				 *         &lt;/element>
				 *         &lt;element name="WOP" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}numberWithLeadingZero"/>
				 *       &lt;/sequence>
				 *     &lt;/restriction>
				 *   &lt;/complexContent>
				 * &lt;/complexType>
				 * </pre>
				 * 
				 * 
				 */
				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = { "kostenerstattung", "wop" })
				public static class ZusatzinfosAbrechnungGKV
				{
					@XmlElement(name = "Kostenerstattung")
					protected UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosGKV.ZusatzinfosAbrechnungGKV.Kostenerstattung kostenerstattung;
					@XmlElement(name = "WOP", required = true)
					protected String wop;

					/**
					 * Ruft den Wert der kostenerstattung-Eigenschaft ab.
					 * 
					 * @return possible object is
					 *         {@link UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosGKV.ZusatzinfosAbrechnungGKV.Kostenerstattung }
					 * 
					 */
					public UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosGKV.ZusatzinfosAbrechnungGKV.Kostenerstattung getKostenerstattung()
					{
						return kostenerstattung;
					}

					/**
					 * Legt den Wert der kostenerstattung-Eigenschaft fest.
					 * 
					 * @param value
					 *            allowed object is
					 *            {@link UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosGKV.ZusatzinfosAbrechnungGKV.Kostenerstattung }
					 * 
					 */
					public void setKostenerstattung(
							UCAllgemeineVersicherungsdatenXML.Versicherter.Zusatzinfos.ZusatzinfosGKV.ZusatzinfosAbrechnungGKV.Kostenerstattung value)
					{
						this.kostenerstattung = value;
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

					/**
					 * <p>
					 * Java-Klasse für anonymous complex type.
					 * 
					 * <p>
					 * Das folgende Schemafragment gibt den erwarteten Content
					 * an, der in dieser Klasse enthalten ist.
					 * 
					 * <pre>
					 * &lt;complexType>
					 *   &lt;complexContent>
					 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
					 *       &lt;sequence>
					 *         &lt;element name="AerztlicheVersorgung" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}boolean"/>
					 *         &lt;element name="ZahnaerztlicheVersorgung" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}boolean"/>
					 *         &lt;element name="StationaererBereich" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}boolean"/>
					 *         &lt;element name="VeranlassteLeistungen" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}boolean"/>
					 *       &lt;/sequence>
					 *     &lt;/restriction>
					 *   &lt;/complexContent>
					 * &lt;/complexType>
					 * </pre>
					 * 
					 * 
					 */
					@XmlAccessorType(XmlAccessType.FIELD)
					@XmlType(name = "", propOrder = { "aerztlicheVersorgung", "zahnaerztlicheVersorgung",
							"stationaererBereich", "veranlassteLeistungen" })
					public static class Kostenerstattung
					{
						@XmlElement(name = "AerztlicheVersorgung", required = true, type = String.class)
						@XmlJavaTypeAdapter(ZeroOneBooleanAdapter.class)
						@XmlSchemaType(name = "boolean")
						protected Boolean aerztlicheVersorgung;
						@XmlElement(name = "ZahnaerztlicheVersorgung", required = true, type = String.class)
						@XmlJavaTypeAdapter(ZeroOneBooleanAdapter.class)
						@XmlSchemaType(name = "boolean")
						protected Boolean zahnaerztlicheVersorgung;
						@XmlElement(name = "StationaererBereich", required = true, type = String.class)
						@XmlJavaTypeAdapter(ZeroOneBooleanAdapter.class)
						@XmlSchemaType(name = "boolean")
						protected Boolean stationaererBereich;
						@XmlElement(name = "VeranlassteLeistungen", required = true, type = String.class)
						@XmlJavaTypeAdapter(ZeroOneBooleanAdapter.class)
						@XmlSchemaType(name = "boolean")
						protected Boolean veranlassteLeistungen;

						/**
						 * Ruft den Wert der aerztlicheVersorgung-Eigenschaft
						 * ab.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public Boolean isAerztlicheVersorgung()
						{
							return aerztlicheVersorgung;
						}

						/**
						 * Legt den Wert der aerztlicheVersorgung-Eigenschaft
						 * fest.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setAerztlicheVersorgung(Boolean value)
						{
							this.aerztlicheVersorgung = value;
						}

						/**
						 * Ruft den Wert der
						 * zahnaerztlicheVersorgung-Eigenschaft ab.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public Boolean isZahnaerztlicheVersorgung()
						{
							return zahnaerztlicheVersorgung;
						}

						/**
						 * Legt den Wert der
						 * zahnaerztlicheVersorgung-Eigenschaft fest.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setZahnaerztlicheVersorgung(Boolean value)
						{
							this.zahnaerztlicheVersorgung = value;
						}

						/**
						 * Ruft den Wert der stationaererBereich-Eigenschaft ab.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public Boolean isStationaererBereich()
						{
							return stationaererBereich;
						}

						/**
						 * Legt den Wert der stationaererBereich-Eigenschaft
						 * fest.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setStationaererBereich(Boolean value)
						{
							this.stationaererBereich = value;
						}

						/**
						 * Ruft den Wert der veranlassteLeistungen-Eigenschaft
						 * ab.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public Boolean isVeranlassteLeistungen()
						{
							return veranlassteLeistungen;
						}

						/**
						 * Legt den Wert der veranlassteLeistungen-Eigenschaft
						 * fest.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setVeranlassteLeistungen(Boolean value)
						{
							this.veranlassteLeistungen = value;
						}
					}
				}
			}
		}
	}
}
