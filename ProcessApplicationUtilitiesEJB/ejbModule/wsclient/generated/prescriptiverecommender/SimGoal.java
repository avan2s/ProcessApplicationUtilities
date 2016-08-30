
package wsclient.generated.prescriptiverecommender;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für simGoal complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="simGoal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="expectedValue" type="{http://webservices.interfaces.recommender/}expectedValue" minOccurs="0"/>
 *         &lt;element name="kipGoal" type="{http://webservices.interfaces.recommender/}kipGoal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simGoal", propOrder = {
    "expectedValue",
    "kipGoal"
})
public class SimGoal {

    protected ExpectedValue expectedValue;
    protected KipGoal kipGoal;

    /**
     * Ruft den Wert der expectedValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedValue }
     *     
     */
    public ExpectedValue getExpectedValue() {
        return expectedValue;
    }

    /**
     * Legt den Wert der expectedValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedValue }
     *     
     */
    public void setExpectedValue(ExpectedValue value) {
        this.expectedValue = value;
    }

    /**
     * Ruft den Wert der kipGoal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link KipGoal }
     *     
     */
    public KipGoal getKipGoal() {
        return kipGoal;
    }

    /**
     * Legt den Wert der kipGoal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link KipGoal }
     *     
     */
    public void setKipGoal(KipGoal value) {
        this.kipGoal = value;
    }

}
