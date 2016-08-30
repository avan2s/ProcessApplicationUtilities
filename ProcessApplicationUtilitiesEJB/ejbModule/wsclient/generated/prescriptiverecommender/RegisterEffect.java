
package wsclient.generated.prescriptiverecommender;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für registerEffect complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="registerEffect">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refInstance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refTask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goalFigure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observedEffect" type="{http://webservices.interfaces.recommender/}observedEffect" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registerEffect", propOrder = {
    "refInstance",
    "refTask",
    "goalFigure",
    "observedEffect"
})
public class RegisterEffect {

    protected String refInstance;
    protected String refTask;
    protected String goalFigure;
    @XmlSchemaType(name = "string")
    protected ObservedEffect observedEffect;

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
     * Ruft den Wert der observedEffect-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ObservedEffect }
     *     
     */
    public ObservedEffect getObservedEffect() {
        return observedEffect;
    }

    /**
     * Legt den Wert der observedEffect-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservedEffect }
     *     
     */
    public void setObservedEffect(ObservedEffect value) {
        this.observedEffect = value;
    }

}
