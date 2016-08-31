//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.02.17 um 06:21:35 PM CET 
//

package de.gecko.egkfeuer.model.ekg.v52;

import java.math.BigInteger;
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
 *         &lt;element name="Zuzahlungsstatus">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Status" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}booleanInteger"/>
 *                   &lt;element name="Gueltig_bis" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}ISO8601Date" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BesonderePersonengruppe" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}codeDigits" minOccurs="0"/>
 *         &lt;element name="DMP_Kennzeichnung" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}codeDigits" minOccurs="0"/>
 *         &lt;element name="Selektivvertraege">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Aerztlich" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}codeDigit"/>
 *                   &lt;element name="Zahnaerztlich" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}codeDigit"/>
 *                   &lt;element name="Art" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="[0-1]{4}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RuhenderLeistungsanspruch" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Beginn" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}ISO8601Date"/>
 *                   &lt;element name="Ende" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}ISO8601Date" minOccurs="0"/>
 *                   &lt;element name="ArtDesRuhens" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}codeDigit"/>
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
@XmlType(name = "", propOrder = { "zuzahlungsstatus", "besonderePersonengruppe", "dmpKennzeichnung",
		"selektivvertraege", "ruhenderLeistungsanspruch" })
@XmlRootElement(name = "UC_GeschuetzteVersichertendatenXML")
public class UCGeschuetzteVersichertendatenXML
{
	@XmlElement(name = "Zuzahlungsstatus", required = true)
	protected UCGeschuetzteVersichertendatenXML.Zuzahlungsstatus zuzahlungsstatus;
	@XmlElement(name = "BesonderePersonengruppe")
	protected BigInteger besonderePersonengruppe;
	@XmlElement(name = "DMP_Kennzeichnung")
	protected BigInteger dmpKennzeichnung;
	@XmlElement(name = "Selektivvertraege", required = true)
	protected UCGeschuetzteVersichertendatenXML.Selektivvertraege selektivvertraege;
	@XmlElement(name = "RuhenderLeistungsanspruch")
	protected UCGeschuetzteVersichertendatenXML.RuhenderLeistungsanspruch ruhenderLeistungsanspruch;
	@XmlAttribute(name = "CDM_VERSION", required = true)
	protected String cdmversion;

	/**
	 * Ruft den Wert der zuzahlungsstatus-Eigenschaft ab.
	 * 
	 * @return possible object is
	 *         {@link UCGeschuetzteVersichertendatenXML.Zuzahlungsstatus }
	 * 
	 */
	public UCGeschuetzteVersichertendatenXML.Zuzahlungsstatus getZuzahlungsstatus()
	{
		return zuzahlungsstatus;
	}

	/**
	 * Legt den Wert der zuzahlungsstatus-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is
	 *            {@link UCGeschuetzteVersichertendatenXML.Zuzahlungsstatus }
	 * 
	 */
	public void setZuzahlungsstatus(UCGeschuetzteVersichertendatenXML.Zuzahlungsstatus value)
	{
		this.zuzahlungsstatus = value;
	}

	/**
	 * Ruft den Wert der besonderePersonengruppe-Eigenschaft ab.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getBesonderePersonengruppe()
	{
		return besonderePersonengruppe;
	}

	/**
	 * Legt den Wert der besonderePersonengruppe-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setBesonderePersonengruppe(BigInteger value)
	{
		this.besonderePersonengruppe = value;
	}

	/**
	 * Ruft den Wert der dmpKennzeichnung-Eigenschaft ab.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getDMPKennzeichnung()
	{
		return dmpKennzeichnung;
	}

	/**
	 * Legt den Wert der dmpKennzeichnung-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setDMPKennzeichnung(BigInteger value)
	{
		this.dmpKennzeichnung = value;
	}

	/**
	 * Ruft den Wert der selektivvertraege-Eigenschaft ab.
	 * 
	 * @return possible object is
	 *         {@link UCGeschuetzteVersichertendatenXML.Selektivvertraege }
	 * 
	 */
	public UCGeschuetzteVersichertendatenXML.Selektivvertraege getSelektivvertraege()
	{
		return selektivvertraege;
	}

	/**
	 * Legt den Wert der selektivvertraege-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is
	 *            {@link UCGeschuetzteVersichertendatenXML.Selektivvertraege }
	 * 
	 */
	public void setSelektivvertraege(UCGeschuetzteVersichertendatenXML.Selektivvertraege value)
	{
		this.selektivvertraege = value;
	}

	/**
	 * Ruft den Wert der ruhenderLeistungsanspruch-Eigenschaft ab.
	 * 
	 * @return possible object is
	 *         {@link UCGeschuetzteVersichertendatenXML.RuhenderLeistungsanspruch }
	 * 
	 */
	public UCGeschuetzteVersichertendatenXML.RuhenderLeistungsanspruch getRuhenderLeistungsanspruch()
	{
		return ruhenderLeistungsanspruch;
	}

	/**
	 * Legt den Wert der ruhenderLeistungsanspruch-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is
	 *            {@link UCGeschuetzteVersichertendatenXML.RuhenderLeistungsanspruch }
	 * 
	 */
	public void setRuhenderLeistungsanspruch(UCGeschuetzteVersichertendatenXML.RuhenderLeistungsanspruch value)
	{
		this.ruhenderLeistungsanspruch = value;
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
	 *         &lt;element name="Beginn" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}ISO8601Date"/>
	 *         &lt;element name="Ende" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}ISO8601Date" minOccurs="0"/>
	 *         &lt;element name="ArtDesRuhens" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}codeDigit"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "beginn", "ende", "artDesRuhens" })
	public static class RuhenderLeistungsanspruch
	{
		@XmlElement(name = "Beginn", required = true)
		protected String beginn;
		@XmlElement(name = "Ende")
		protected String ende;
		@XmlElement(name = "ArtDesRuhens", required = true)
		protected BigInteger artDesRuhens;

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
		 * Ruft den Wert der artDesRuhens-Eigenschaft ab.
		 * 
		 * @return possible object is {@link BigInteger }
		 * 
		 */
		public BigInteger getArtDesRuhens()
		{
			return artDesRuhens;
		}

		/**
		 * Legt den Wert der artDesRuhens-Eigenschaft fest.
		 * 
		 * @param value
		 *            allowed object is {@link BigInteger }
		 * 
		 */
		public void setArtDesRuhens(BigInteger value)
		{
			this.artDesRuhens = value;
		}
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
	 *         &lt;element name="Aerztlich" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}codeDigit"/>
	 *         &lt;element name="Zahnaerztlich" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}codeDigit"/>
	 *         &lt;element name="Art" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;pattern value="[0-1]{4}"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
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
	@XmlType(name = "", propOrder = { "aerztlich", "zahnaerztlich", "art" })
	public static class Selektivvertraege
	{
		@XmlElement(name = "Aerztlich", required = true)
		protected BigInteger aerztlich;
		@XmlElement(name = "Zahnaerztlich", required = true)
		protected BigInteger zahnaerztlich;
		@XmlElement(name = "Art")
		protected String art;

		/**
		 * Ruft den Wert der aerztlich-Eigenschaft ab.
		 * 
		 * @return possible object is {@link BigInteger }
		 * 
		 */
		public BigInteger getAerztlich()
		{
			return aerztlich;
		}

		/**
		 * Legt den Wert der aerztlich-Eigenschaft fest.
		 * 
		 * @param value
		 *            allowed object is {@link BigInteger }
		 * 
		 */
		public void setAerztlich(BigInteger value)
		{
			this.aerztlich = value;
		}

		/**
		 * Ruft den Wert der zahnaerztlich-Eigenschaft ab.
		 * 
		 * @return possible object is {@link BigInteger }
		 * 
		 */
		public BigInteger getZahnaerztlich()
		{
			return zahnaerztlich;
		}

		/**
		 * Legt den Wert der zahnaerztlich-Eigenschaft fest.
		 * 
		 * @param value
		 *            allowed object is {@link BigInteger }
		 * 
		 */
		public void setZahnaerztlich(BigInteger value)
		{
			this.zahnaerztlich = value;
		}

		/**
		 * Ruft den Wert der art-Eigenschaft ab.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getArt()
		{
			return art;
		}

		/**
		 * Legt den Wert der art-Eigenschaft fest.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setArt(String value)
		{
			this.art = value;
		}
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
	 *         &lt;element name="Status" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}booleanInteger"/>
	 *         &lt;element name="Gueltig_bis" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}ISO8601Date" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "status", "gueltigBis" })
	public static class Zuzahlungsstatus
	{
		@XmlElement(name = "Status", required = true)
		protected BigInteger status;
		@XmlElement(name = "Gueltig_bis")
		protected String gueltigBis;

		/**
		 * Ruft den Wert der status-Eigenschaft ab.
		 * 
		 * @return possible object is {@link BigInteger }
		 * 
		 */
		public BigInteger getStatus()
		{
			return status;
		}

		/**
		 * Legt den Wert der status-Eigenschaft fest.
		 * 
		 * @param value
		 *            allowed object is {@link BigInteger }
		 * 
		 */
		public void setStatus(BigInteger value)
		{
			this.status = value;
		}

		/**
		 * Ruft den Wert der gueltigBis-Eigenschaft ab.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getGueltigBis()
		{
			return gueltigBis;
		}

		/**
		 * Legt den Wert der gueltigBis-Eigenschaft fest.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setGueltigBis(String value)
		{
			this.gueltigBis = value;
		}
	}
}
