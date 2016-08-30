
package wsclient.generated.prescriptiverecommender;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für registerDecision complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="registerDecision">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refProcess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refInstance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refTask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="variableInformationList" type="{http://webservices.interfaces.recommender/}processvariableInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="taskInformationList" type="{http://webservices.interfaces.recommender/}taskInformation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registerDecision", propOrder = {
    "refProcess",
    "refInstance",
    "refTask",
    "variableInformationList",
    "taskInformationList"
})
public class RegisterDecision {

    protected String refProcess;
    protected String refInstance;
    protected String refTask;
    protected List<ProcessvariableInformation> variableInformationList;
    protected List<TaskInformation> taskInformationList;

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
     * Ruft den Wert der refTask-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefTask() {
        return refTask;
    }

    /**
     * Legt den Wert der refTask-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefTask(String value) {
        this.refTask = value;
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

}
