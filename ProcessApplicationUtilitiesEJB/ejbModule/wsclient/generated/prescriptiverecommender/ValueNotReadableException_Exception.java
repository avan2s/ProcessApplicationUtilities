
package wsclient.generated.prescriptiverecommender;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ValueNotReadableException", targetNamespace = "http://webservices.interfaces.recommender/")
public class ValueNotReadableException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ValueNotReadableException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ValueNotReadableException_Exception(String message, ValueNotReadableException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ValueNotReadableException_Exception(String message, ValueNotReadableException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: wsclient.generated.prescriptiverecommender.ValueNotReadableException
     */
    public ValueNotReadableException getFaultInfo() {
        return faultInfo;
    }

}
