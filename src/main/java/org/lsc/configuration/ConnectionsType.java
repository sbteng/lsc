//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.07 at 03:56:47 PM CST 
//


package org.lsc.configuration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for connectionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="connectionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="ldapConnection" type="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}ldapConnectionType"/>
 *         &lt;element name="databaseConnection" type="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}databaseConnectionType"/>
 *         &lt;element name="pluginConnection" type="{http://lsc-project.org/XSD/lsc-core-2.2.xsd}pluginConnectionType"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "connectionsType", propOrder = {
    "ldapConnectionOrDatabaseConnectionOrPluginConnection"
})
public class ConnectionsType {

    @XmlElements({
        @XmlElement(name = "ldapConnection", type = LdapConnectionType.class),
        @XmlElement(name = "databaseConnection", type = DatabaseConnectionType.class),
        @XmlElement(name = "pluginConnection", type = PluginConnectionType.class)
    })
    protected List<ConnectionType> ldapConnectionOrDatabaseConnectionOrPluginConnection;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the ldapConnectionOrDatabaseConnectionOrPluginConnection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ldapConnectionOrDatabaseConnectionOrPluginConnection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLdapConnectionOrDatabaseConnectionOrPluginConnection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LdapConnectionType }
     * {@link DatabaseConnectionType }
     * {@link PluginConnectionType }
     * 
     * 
     */
    public List<ConnectionType> getLdapConnectionOrDatabaseConnectionOrPluginConnection() {
        if (ldapConnectionOrDatabaseConnectionOrPluginConnection == null) {
            ldapConnectionOrDatabaseConnectionOrPluginConnection = new ArrayList<ConnectionType>();
        }
        return this.ldapConnectionOrDatabaseConnectionOrPluginConnection;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
