
package wsclient.generated.prescriptiverecommender;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für recommendNextActionResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="recommendNextActionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nextActionRecommendation" type="{http://webservices.interfaces.recommender/}nextActionRecommendation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recommendNextActionResponse", propOrder = {
    "nextActionRecommendation"
})
public class RecommendNextActionResponse {

    protected NextActionRecommendation nextActionRecommendation;

    /**
     * Ruft den Wert der nextActionRecommendation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NextActionRecommendation }
     *     
     */
    public NextActionRecommendation getNextActionRecommendation() {
        return nextActionRecommendation;
    }

    /**
     * Legt den Wert der nextActionRecommendation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NextActionRecommendation }
     *     
     */
    public void setNextActionRecommendation(NextActionRecommendation value) {
        this.nextActionRecommendation = value;
    }

}
