
package wsclient.generated.prescriptiverecommender;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für taskInformation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="taskInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taskReferenceInProcessEngine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taskInformation", propOrder = {
    "taskReferenceInProcessEngine",
    "taskState"
})
public class TaskInformation {

    protected String taskReferenceInProcessEngine;
    @XmlElement(required = true)
    protected String taskState;

    /**
     * Ruft den Wert der taskReferenceInProcessEngine-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskReferenceInProcessEngine() {
        return taskReferenceInProcessEngine;
    }

    /**
     * Legt den Wert der taskReferenceInProcessEngine-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskReferenceInProcessEngine(String value) {
        this.taskReferenceInProcessEngine = value;
    }

    /**
     * Ruft den Wert der taskState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskState() {
        return taskState;
    }

    /**
     * Legt den Wert der taskState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskState(String value) {
        this.taskState = value;
    }

}
