
package wsclient.generated.prescriptiverecommender;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für recommendSequenceResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="recommendSequenceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sequenceRecommendation" type="{http://webservices.interfaces.recommender/}sequenceRecommendation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recommendSequenceResponse", propOrder = {
    "sequenceRecommendation"
})
public class RecommendSequenceResponse {

    protected SequenceRecommendation sequenceRecommendation;

    /**
     * Ruft den Wert der sequenceRecommendation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SequenceRecommendation }
     *     
     */
    public SequenceRecommendation getSequenceRecommendation() {
        return sequenceRecommendation;
    }

    /**
     * Legt den Wert der sequenceRecommendation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceRecommendation }
     *     
     */
    public void setSequenceRecommendation(SequenceRecommendation value) {
        this.sequenceRecommendation = value;
    }

}
