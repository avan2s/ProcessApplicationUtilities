
package wsclient.generated.prescriptiverecommender;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für registerDecisionResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="registerDecisionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registerDecisionResponseMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registerDecisionResponse", propOrder = {
    "registerDecisionResponseMessage"
})
public class RegisterDecisionResponse {

    protected String registerDecisionResponseMessage;

    /**
     * Ruft den Wert der registerDecisionResponseMessage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterDecisionResponseMessage() {
        return registerDecisionResponseMessage;
    }

    /**
     * Legt den Wert der registerDecisionResponseMessage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterDecisionResponseMessage(String value) {
        this.registerDecisionResponseMessage = value;
    }

}
