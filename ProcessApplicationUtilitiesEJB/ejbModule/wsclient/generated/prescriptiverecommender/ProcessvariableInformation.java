
package wsclient.generated.prescriptiverecommender;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für processvariableInformation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="processvariableInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="variableReferenceInProcessEngine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="variableValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="variableType" type="{http://webservices.interfaces.recommender/}variableType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processvariableInformation", propOrder = {
    "variableReferenceInProcessEngine",
    "variableValue",
    "variableType"
})
public class ProcessvariableInformation {

    protected String variableReferenceInProcessEngine;
    protected String variableValue;
    @XmlSchemaType(name = "string")
    protected VariableType variableType;

    /**
     * Ruft den Wert der variableReferenceInProcessEngine-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableReferenceInProcessEngine() {
        return variableReferenceInProcessEngine;
    }

    /**
     * Legt den Wert der variableReferenceInProcessEngine-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableReferenceInProcessEngine(String value) {
        this.variableReferenceInProcessEngine = value;
    }

    /**
     * Ruft den Wert der variableValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableValue() {
        return variableValue;
    }

    /**
     * Legt den Wert der variableValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableValue(String value) {
        this.variableValue = value;
    }

    /**
     * Ruft den Wert der variableType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VariableType }
     *     
     */
    public VariableType getVariableType() {
        return variableType;
    }

    /**
     * Legt den Wert der variableType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableType }
     *     
     */
    public void setVariableType(VariableType value) {
        this.variableType = value;
    }

}
