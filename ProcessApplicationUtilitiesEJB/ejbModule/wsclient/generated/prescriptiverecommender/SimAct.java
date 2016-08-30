
package wsclient.generated.prescriptiverecommender;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für simAct complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="simAct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="benefit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="simGoalValues" type="{http://webservices.interfaces.recommender/}simGoal" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "simAct", propOrder = {
    "action",
    "benefit",
    "simGoalValues",
    "taskNameForAction",
    "taskRefForAction"
})
public class SimAct {

    protected String action;
    protected double benefit;
    @XmlElement(nillable = true)
    protected List<SimGoal> simGoalValues;
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
     * Gets the value of the simGoalValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simGoalValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimGoalValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimGoal }
     * 
     * 
     */
    public List<SimGoal> getSimGoalValues() {
        if (simGoalValues == null) {
            simGoalValues = new ArrayList<SimGoal>();
        }
        return this.simGoalValues;
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
