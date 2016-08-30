
package wsclient.generated.prescriptiverecommender;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für recommendSequence complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="recommendSequence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sequenceType" type="{http://webservices.interfaces.recommender/}sequenceType" minOccurs="0"/>
 *         &lt;element name="numberOfDecisions" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="refProcess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refInstance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goals" type="{http://webservices.interfaces.recommender/}goalRequest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="variableInformationList" type="{http://webservices.interfaces.recommender/}processvariableInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="taskInformationList" type="{http://webservices.interfaces.recommender/}taskInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="doNothingActionAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recommendSequence", propOrder = {
    "sequenceType",
    "numberOfDecisions",
    "refProcess",
    "refInstance",
    "goals",
    "variableInformationList",
    "taskInformationList",
    "doNothingActionAllowed"
})
public class RecommendSequence {

    @XmlSchemaType(name = "string")
    protected SequenceType sequenceType;
    protected int numberOfDecisions;
    protected String refProcess;
    protected String refInstance;
    protected List<GoalRequest> goals;
    protected List<ProcessvariableInformation> variableInformationList;
    protected List<TaskInformation> taskInformationList;
    protected boolean doNothingActionAllowed;

    /**
     * Ruft den Wert der sequenceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SequenceType }
     *     
     */
    public SequenceType getSequenceType() {
        return sequenceType;
    }

    /**
     * Legt den Wert der sequenceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceType }
     *     
     */
    public void setSequenceType(SequenceType value) {
        this.sequenceType = value;
    }

    /**
     * Ruft den Wert der numberOfDecisions-Eigenschaft ab.
     * 
     */
    public int getNumberOfDecisions() {
        return numberOfDecisions;
    }

    /**
     * Legt den Wert der numberOfDecisions-Eigenschaft fest.
     * 
     */
    public void setNumberOfDecisions(int value) {
        this.numberOfDecisions = value;
    }

    /**
     * Ruft den Wert der refProcess-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefProcess() {
        return refProcess;
    }

    /**
     * Legt den Wert der refProcess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefProcess(String value) {
        this.refProcess = value;
    }

    /**
     * Ruft den Wert der refInstance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefInstance() {
        return refInstance;
    }

    /**
     * Legt den Wert der refInstance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefInstance(String value) {
        this.refInstance = value;
    }

    /**
     * Gets the value of the goals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoalRequest }
     * 
     * 
     */
    public List<GoalRequest> getGoals() {
        if (goals == null) {
            goals = new ArrayList<GoalRequest>();
        }
        return this.goals;
    }

    /**
     * Gets the value of the variableInformationList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variableInformationList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariableInformationList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessvariableInformation }
     * 
     * 
     */
    public List<ProcessvariableInformation> getVariableInformationList() {
        if (variableInformationList == null) {
            variableInformationList = new ArrayList<ProcessvariableInformation>();
        }
        return this.variableInformationList;
    }

    /**
     * Gets the value of the taskInformationList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taskInformationList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaskInformationList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaskInformation }
     * 
     * 
     */
    public List<TaskInformation> getTaskInformationList() {
        if (taskInformationList == null) {
            taskInformationList = new ArrayList<TaskInformation>();
        }
        return this.taskInformationList;
    }

    /**
     * Ruft den Wert der doNothingActionAllowed-Eigenschaft ab.
     * 
     */
    public boolean isDoNothingActionAllowed() {
        return doNothingActionAllowed;
    }

    /**
     * Legt den Wert der doNothingActionAllowed-Eigenschaft fest.
     * 
     */
    public void setDoNothingActionAllowed(boolean value) {
        this.doNothingActionAllowed = value;
    }

}
