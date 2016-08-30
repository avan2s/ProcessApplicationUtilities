
package wsclient.generated.prescriptiverecommender;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für observedEffect.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="observedEffect">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEGATIVE"/>
 *     &lt;enumeration value="NOTHING"/>
 *     &lt;enumeration value="POSITIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "observedEffect")
@XmlEnum
public enum ObservedEffect {

    NEGATIVE,
    NOTHING,
    POSITIVE;

    public String value() {
        return name();
    }

    public static ObservedEffect fromValue(String v) {
        return valueOf(v);
    }

}
