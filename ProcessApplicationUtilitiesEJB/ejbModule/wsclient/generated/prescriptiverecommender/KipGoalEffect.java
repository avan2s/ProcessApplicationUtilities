
package wsclient.generated.prescriptiverecommender;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für kipGoalEffect.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="kipGoalEffect">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="POSITIVE"/>
 *     &lt;enumeration value="NEGATIVE"/>
 *     &lt;enumeration value="NEUTRAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "kipGoalEffect")
@XmlEnum
public enum KipGoalEffect {

    POSITIVE,
    NEGATIVE,
    NEUTRAL;

    public String value() {
        return name();
    }

    public static KipGoalEffect fromValue(String v) {
        return valueOf(v);
    }

}
