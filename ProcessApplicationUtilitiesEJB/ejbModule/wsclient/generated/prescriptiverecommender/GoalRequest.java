
package wsclient.generated.prescriptiverecommender;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für goalRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="goalRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="goalEndPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="goalFigure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goalStartPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="goalUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goalValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="goalWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "goalRequest", propOrder = {
    "goalEndPeriod",
    "goalFigure",
    "goalStartPeriod",
    "goalUnit",
    "goalValue",
    "goalWeight"
})
public class GoalRequest {

    protected int goalEndPeriod;
    protected String goalFigure;
    protected int goalStartPeriod;
    protected String goalUnit;
    protected double goalValue;
    protected double goalWeight;

    /**
     * Ruft den Wert der goalEndPeriod-Eigenschaft ab.
     * 
     */
    public int getGoalEndPeriod() {
        return goalEndPeriod;
    }

    /**
     * Legt den Wert der goalEndPeriod-Eigenschaft fest.
     * 
     */
    public void setGoalEndPeriod(int value) {
        this.goalEndPeriod = value;
    }

    /**
     * Ruft den Wert der goalFigure-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoalFigure() {
        return goalFigure;
    }

    /**
     * Legt den Wert der goalFigure-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoalFigure(String value) {
        this.goalFigure = value;
    }

    /**
     * Ruft den Wert der goalStartPeriod-Eigenschaft ab.
     * 
     */
    public int getGoalStartPeriod() {
        return goalStartPeriod;
    }

    /**
     * Legt den Wert der goalStartPeriod-Eigenschaft fest.
     * 
     */
    public void setGoalStartPeriod(int value) {
        this.goalStartPeriod = value;
    }

    /**
     * Ruft den Wert der goalUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoalUnit() {
        return goalUnit;
    }

    /**
     * Legt den Wert der goalUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoalUnit(String value) {
        this.goalUnit = value;
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

}
