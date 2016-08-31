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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Kostentraeger complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Kostentraeger">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Kostentraegerkennung">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Kostentraegerlaendercode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Name" type="{http://ws.gematik.de/fa/vsdm/vsd/v5.2}name"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kostentraeger", propOrder = {
    "kostentraegerkennung",
    "kostentraegerlaendercode",
    "name"
})
@XmlSeeAlso({
    UCAllgemeineVersicherungsdatenXML.Versicherter.Versicherungsschutz.Kostentraeger.class
})
public class Kostentraeger {

    @XmlElement(name = "Kostentraegerkennung", required = true)
    protected BigInteger kostentraegerkennung;
    @XmlElement(name = "Kostentraegerlaendercode", required = true)
    protected String kostentraegerlaendercode;
    @XmlElement(name = "Name", required = true)
    protected String name;

    /**
     * Ruft den Wert der kostentraegerkennung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKostentraegerkennung() {
        return kostentraegerkennung;
    }

    /**
     * Legt den Wert der kostentraegerkennung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKostentraegerkennung(BigInteger value) {
        this.kostentraegerkennung = value;
    }

    /**
     * Ruft den Wert der kostentraegerlaendercode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKostentraegerlaendercode() {
        return kostentraegerlaendercode;
    }

    /**
     * Legt den Wert der kostentraegerlaendercode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKostentraegerlaendercode(String value) {
        this.kostentraegerlaendercode = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
