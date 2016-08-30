
package wsclient.generated.prescriptiverecommender;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für simPeriod complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="simPeriod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="simActValues" type="{http://webservices.interfaces.recommender/}simAct" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simPeriod", propOrder = {
    "period",
    "simActValues"
})
public class SimPeriod {

    protected int period;
    @XmlElement(nillable = true)
    protected List<SimAct> simActValues;

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
     * Gets the value of the simActValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simActValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimActValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimAct }
     * 
     * 
     */
    public List<SimAct> getSimActValues() {
        if (simActValues == null) {
            simActValues = new ArrayList<SimAct>();
        }
        return this.simActValues;
    }

}
