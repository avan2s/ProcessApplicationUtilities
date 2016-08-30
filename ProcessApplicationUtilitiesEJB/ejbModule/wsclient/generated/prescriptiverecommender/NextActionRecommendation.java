
package wsclient.generated.prescriptiverecommender;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für nextActionRecommendation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="nextActionRecommendation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NextRecommendedAction" type="{http://webservices.interfaces.recommender/}nextBestAction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nextActionRecommendation", propOrder = {
    "additionalInformation",
    "nextRecommendedAction"
})
public class NextActionRecommendation {

    protected String additionalInformation;
    @XmlElement(name = "NextRecommendedAction")
    protected NextBestAction nextRecommendedAction;

    /**
     * Ruft den Wert der additionalInformation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Legt den Wert der additionalInformation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInformation(String value) {
        this.additionalInformation = value;
    }

    /**
     * Ruft den Wert der nextRecommendedAction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NextBestAction }
     *     
     */
    public NextBestAction getNextRecommendedAction() {
        return nextRecommendedAction;
    }

    /**
     * Legt den Wert der nextRecommendedAction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NextBestAction }
     *     
     */
    public void setNextRecommendedAction(NextBestAction value) {
        this.nextRecommendedAction = value;
    }

}
