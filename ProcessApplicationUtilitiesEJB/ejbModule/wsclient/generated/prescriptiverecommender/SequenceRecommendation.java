
package wsclient.generated.prescriptiverecommender;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für sequenceRecommendation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="sequenceRecommendation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nextBestActions" type="{http://webservices.interfaces.recommender/}nextBestAction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="simGoals" type="{http://webservices.interfaces.recommender/}simGoal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sequenceRecommendation", propOrder = {
    "additionalInformation",
    "nextBestActions",
    "simGoals"
})
public class SequenceRecommendation {

    protected String additionalInformation;
    @XmlElement(nillable = true)
    protected List<NextBestAction> nextBestActions;
    @XmlElement(nillable = true)
    protected List<SimGoal> simGoals;

    /**
     * Ruft den Wert der additionalInformation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Legt den Wert der additionalInformation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInformation(String value) {
        this.additionalInformation = value;
    }

    /**
     * Gets the value of the nextBestActions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextBestActions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextBestActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NextBestAction }
     * 
     * 
     */
    public List<NextBestAction> getNextBestActions() {
        if (nextBestActions == null) {
            nextBestActions = new ArrayList<NextBestAction>();
        }
        return this.nextBestActions;
    }

    /**
     * Gets the value of the simGoals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simGoals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimGoals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimGoal }
     * 
     * 
     */
    public List<SimGoal> getSimGoals() {
        if (simGoals == null) {
            simGoals = new ArrayList<SimGoal>();
        }
        return this.simGoals;
    }

}
