
package wsclient.generated.prescriptiverecommender;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für sequenceType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="sequenceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MAX_BENEFIT"/>
 *     &lt;enumeration value="MAX_PROBABILITY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sequenceType")
@XmlEnum
public enum SequenceType {

    MAX_BENEFIT,
    MAX_PROBABILITY;

    public String value() {
        return name();
    }

    public static SequenceType fromValue(String v) {
        return valueOf(v);
    }

}
