
package wsclient.generated.prescriptiverecommender;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für expectedValue complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="expectedValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="procentualDeviation" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="uniformUtility" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="unitValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "expectedValue", propOrder = {
    "procentualDeviation",
    "uniformUtility",
    "unitValue"
})
public class ExpectedValue {

    protected double procentualDeviation;
    protected double uniformUtility;
    protected double unitValue;

    /**
     * Ruft den Wert der procentualDeviation-Eigenschaft ab.
     * 
     */
    public double getProcentualDeviation() {
        return procentualDeviation;
    }

    /**
     * Legt den Wert der procentualDeviation-Eigenschaft fest.
     * 
     */
    public void setProcentualDeviation(double value) {
        this.procentualDeviation = value;
    }

    /**
     * Ruft den Wert der uniformUtility-Eigenschaft ab.
     * 
     */
    public double getUniformUtility() {
        return uniformUtility;
    }

    /**
     * Legt den Wert der uniformUtility-Eigenschaft fest.
     * 
     */
    public void setUniformUtility(double value) {
        this.uniformUtility = value;
    }

    /**
     * Ruft den Wert der unitValue-Eigenschaft ab.
     * 
     */
    public double getUnitValue() {
        return unitValue;
    }

    /**
     * Legt den Wert der unitValue-Eigenschaft fest.
     * 
     */
    public void setUnitValue(double value) {
        this.unitValue = value;
    }

}
