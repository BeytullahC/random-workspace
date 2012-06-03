//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.03 at 04:07:02 PM CEST 
//


package be.gallifreyan.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Customer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressPrimary" type="{http://www.liverestaurant.com/OrderService/schema}Address"/>
 *         &lt;element name="addressSecondary" type="{http://www.liverestaurant.com/OrderService/schema}Address"/>
 *         &lt;element name="name" type="{http://www.liverestaurant.com/OrderService/schema}Name"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer", propOrder = {
    "addressPrimary",
    "addressSecondary",
    "name"
})
public class Customer {

    @XmlElement(required = true)
    protected Address addressPrimary;
    @XmlElement(required = true)
    protected Address addressSecondary;
    @XmlElement(required = true)
    protected Name name;

    /**
     * Gets the value of the addressPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddressPrimary() {
        return addressPrimary;
    }

    /**
     * Sets the value of the addressPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddressPrimary(Address value) {
        this.addressPrimary = value;
    }

    /**
     * Gets the value of the addressSecondary property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddressSecondary() {
        return addressSecondary;
    }

    /**
     * Sets the value of the addressSecondary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddressSecondary(Address value) {
        this.addressSecondary = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

}
