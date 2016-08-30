
package wsclient.generated.prescriptiverecommender;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für nextBestAction complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="nextBestAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="benefit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="simPeriod" type="{http://webservices.interfaces.recommender/}simPeriod" minOccurs="0"/>
 *         &lt;element name="taskNameForAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskRefForAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nextBestAction", propOrder = {
    "action",
    "benefit",
    "period",
    "simPeriod",
    "taskNameForAction",
    "taskRefForAction"
})
public class NextBestAction {

    protected String action;
    protected double benefit;
    protected int period;
    protected SimPeriod simPeriod;
    protected String taskNameForAction;
    protected String taskRefForAction;

    /**
     * Ruft den Wert der action-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Legt den Wert der action-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Ruft den Wert der benefit-Eigenschaft ab.
     * 
     */
    public double getBenefit() {
        return benefit;
    }

    /**
     * Legt den Wert der benefit-Eigenschaft fest.
     * 
     */
    public void setBenefit(double value) {
        this.benefit = value;
    }

    /**
     * Ruft den Wert der period-Eigenschaft ab.
     * 
     */
    public int getPeriod() {
        return period;
    }

    /**
     * Legt den Wert der period-Eigenschaft fest.
     * 
     */
    public void setPeriod(int value) {
        this.period = value;
    }

    /**
     * Ruft den Wert der simPeriod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SimPeriod }
     *     
     */
    public SimPeriod getSimPeriod() {
        return simPeriod;
    }

    /**
     * Legt den Wert der simPeriod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SimPeriod }
     *     
     */
    public void setSimPeriod(SimPeriod value) {
        this.simPeriod = value;
    }

    /**
     * Ruft den Wert der taskNameForAction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskNameForAction() {
        return taskNameForAction;
    }

    /**
     * Legt den Wert der taskNameForAction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskNameForAction(String value) {
        this.taskNameForAction = value;
    }

    /**
     * Ruft den Wert der taskRefForAction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskRefForAction() {
        return taskRefForAction;
    }

    /**
     * Legt den Wert der taskRefForAction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskRefForAction(String value) {
        this.taskRefForAction = value;
    }

}
