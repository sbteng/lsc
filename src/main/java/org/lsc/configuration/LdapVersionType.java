//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.07 at 03:56:47 PM CST 
//


package org.lsc.configuration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ldapVersionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ldapVersionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VERSION_2"/>
 *     &lt;enumeration value="VERSION_3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ldapVersionType")
@XmlEnum
public enum LdapVersionType {

    VERSION_2,
    VERSION_3;

    public String value() {
        return name();
    }

    public static LdapVersionType fromValue(String v) {
        return valueOf(v);
    }

}
