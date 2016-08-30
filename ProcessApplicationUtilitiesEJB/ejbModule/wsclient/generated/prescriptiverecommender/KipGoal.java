
package wsclient.generated.prescriptiverecommender;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für kipGoal complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="kipGoal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="abbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goalEffect" type="{http://webservices.interfaces.recommender/}kipGoalEffect" minOccurs="0"/>
 *         &lt;element name="goalTarget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goalValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="goalWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="goalend_period" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="goalstart_period" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kipGoal", propOrder = {
    "abbreviation",
    "goalEffect",
    "goalTarget",
    "goalValue",
    "goalWeight",
    "goalendPeriod",
    "goalstartPeriod"
})
public class KipGoal {

    protected String abbreviation;
    @XmlSchemaType(name = "string")
    protected KipGoalEffect goalEffect;
    protected String goalTarget;
    protected double goalValue;
    protected double goalWeight;
    @XmlElement(name = "goalend_period")
    protected int goalendPeriod;
    @XmlElement(name = "goalstart_period")
    protected int goalstartPeriod;

    /**
     * Ruft den Wert der abbreviation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Legt den Wert der abbreviation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbreviation(String value) {
        this.abbreviation = value;
    }

    /**
     * Ruft den Wert der goalEffect-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link KipGoalEffect }
     *     
     */
    public KipGoalEffect getGoalEffect() {
        return goalEffect;
    }

    /**
     * Legt den Wert der goalEffect-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link KipGoalEffect }
     *     
     */
    public void setGoalEffect(KipGoalEffect value) {
        this.goalEffect = value;
    }

    /**
     * Ruft den Wert der goalTarget-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoalTarget() {
        return goalTarget;
    }

    /**
     * Legt den Wert der goalTarget-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoalTarget(String value) {
        this.goalTarget = value;
    }

    /**
     * Ruft den Wert der goalValue-Eigenschaft ab.
     * 
     */
    public double getGoalValue() {
        return goalValue;
    }

    /**
     * Legt den Wert der goalValue-Eigenschaft fest.
     * 
     */
    public void setGoalValue(double value) {
        this.goalValue = value;
    }

    /**
     * Ruft den Wert der goalWeight-Eigenschaft ab.
     * 
     */
    public double getGoalWeight() {
        return goalWeight;
    }

    /**
     * Legt den Wert der goalWeight-Eigenschaft fest.
     * 
     */
    public void setGoalWeight(double value) {
        this.goalWeight = value;
    }

    /**
     * Ruft den Wert der goalendPeriod-Eigenschaft ab.
     * 
     */
    public int getGoalendPeriod() {
        return goalendPeriod;
    }

    /**
     * Legt den Wert der goalendPeriod-Eigenschaft fest.
     * 
     */
    public void setGoalendPeriod(int value) {
        this.goalendPeriod = value;
    }

    /**
     * Ruft den Wert der goalstartPeriod-Eigenschaft ab.
     * 
     */
    public int getGoalstartPeriod() {
        return goalstartPeriod;
    }

    /**
     * Legt den Wert der goalstartPeriod-Eigenschaft fest.
     * 
     */
    public void setGoalstartPeriod(int value) {
        this.goalstartPeriod = value;
    }

}
