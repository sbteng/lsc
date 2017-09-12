//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.12 at 09:37:15 AM CST 
//


package org.lsc.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ldapServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ldapServiceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}serviceType">
 *       &lt;sequence>
 *         &lt;element name="baseDn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pivotAttributes" type="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}valuesType" minOccurs="0"/>
 *         &lt;element name="fetchedAttributes" type="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}valuesType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="getAllFilter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="allFilter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="getOneFilter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="oneFilter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ldapServiceType", propOrder = {
    "baseDn",
    "pivotAttributes",
    "fetchedAttributes",
    "getAllFilter",
    "allFilter",
    "getOneFilter",
    "oneFilter"
})
@XmlSeeAlso({
    LdapDestinationServiceType.class,
    LdapSourceServiceType.class
})
public abstract class LdapServiceType
    extends ServiceType
{

    @XmlElement(required = true)
    protected String baseDn;
    protected ValuesType pivotAttributes;
    protected ValuesType fetchedAttributes;
    protected String getAllFilter;
    protected String allFilter;
    protected String getOneFilter;
    protected String oneFilter;

    /**
     * Gets the value of the baseDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseDn() {
        return baseDn;
    }

    /**
     * Sets the value of the baseDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseDn(String value) {
        this.baseDn = value;
    }

    /**
     * Gets the value of the pivotAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ValuesType }
     *     
     */
    public ValuesType getPivotAttributes() {
        return pivotAttributes;
    }

    /**
     * Sets the value of the pivotAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesType }
     *     
     */
    public void setPivotAttributes(ValuesType value) {
        this.pivotAttributes = value;
    }

    /**
     * Gets the value of the fetchedAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ValuesType }
     *     
     */
    public ValuesType getFetchedAttributes() {
        return fetchedAttributes;
    }

    /**
     * Sets the value of the fetchedAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesType }
     *     
     */
    public void setFetchedAttributes(ValuesType value) {
        this.fetchedAttributes = value;
    }

    /**
     * Gets the value of the getAllFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetAllFilter() {
        return getAllFilter;
    }

    /**
     * Sets the value of the getAllFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetAllFilter(String value) {
        this.getAllFilter = value;
    }

    /**
     * Gets the value of the allFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllFilter() {
        return allFilter;
    }

    /**
     * Sets the value of the allFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllFilter(String value) {
        this.allFilter = value;
    }

    /**
     * Gets the value of the getOneFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetOneFilter() {
        return getOneFilter;
    }

    /**
     * Sets the value of the getOneFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetOneFilter(String value) {
        this.getOneFilter = value;
    }

    /**
     * Gets the value of the oneFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneFilter() {
        return oneFilter;
    }

    /**
     * Sets the value of the oneFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneFilter(String value) {
        this.oneFilter = value;
    }

}
