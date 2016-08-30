
package wsclient.generated.prescriptiverecommender;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für variableType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="variableType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INTEGER"/>
 *     &lt;enumeration value="BOOLEAN"/>
 *     &lt;enumeration value="STRING"/>
 *     &lt;enumeration value="DOUBLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "variableType")
@XmlEnum
public enum VariableType {

    INTEGER,
    BOOLEAN,
    STRING,
    DOUBLE;

    public String value() {
        return name();
    }

    public static VariableType fromValue(String v) {
        return valueOf(v);
    }

}
