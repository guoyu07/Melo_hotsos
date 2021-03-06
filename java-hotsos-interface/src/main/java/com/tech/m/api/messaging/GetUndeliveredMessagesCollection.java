
package com.tech.m.api.messaging;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.tech.m.api.ApiObject;
import com.tech.m.api.ArrayOfUser;


/**
 * <p>Java class for GetUndeliveredMessagesCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUndeliveredMessagesCollection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:api.m-tech.com}apiObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Users" type="{urn:api.m-tech.com}ArrayOfUser" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUndeliveredMessagesCollection", propOrder = {
    "provider",
    "users"
})
public class GetUndeliveredMessagesCollection
    extends ApiObject
{

    @XmlElementRef(name = "Provider", namespace = "urn:messaging.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> provider;
    @XmlElementRef(name = "Users", namespace = "urn:messaging.api.m-tech.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUser> users;

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProvider(JAXBElement<String> value) {
        this.provider = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUser }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUser> getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUser }{@code >}
     *     
     */
    public void setUsers(JAXBElement<ArrayOfUser> value) {
        this.users = value;
    }

}
