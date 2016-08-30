
package wsclient.generated.prescriptiverecommender;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsclient.generated.prescriptiverecommender package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RegisterEffectResponse_QNAME = new QName("http://webservices.interfaces.recommender/", "registerEffectResponse");
    private final static QName _RecommendSequenceResponse_QNAME = new QName("http://webservices.interfaces.recommender/", "recommendSequenceResponse");
    private final static QName _RegisterEffect_QNAME = new QName("http://webservices.interfaces.recommender/", "registerEffect");
    private final static QName _RegisterDecisionResponse_QNAME = new QName("http://webservices.interfaces.recommender/", "registerDecisionResponse");
    private final static QName _SequenceRecommendation_QNAME = new QName("http://webservices.interfaces.recommender/", "SequenceRecommendation");
    private final static QName _ValueNotReadableException_QNAME = new QName("http://webservices.interfaces.recommender/", "ValueNotReadableException");
    private final static QName _ProcessvariableInformation_QNAME = new QName("http://webservices.interfaces.recommender/", "ProcessvariableInformation");
    private final static QName _TaskInformation_QNAME = new QName("http://webservices.interfaces.recommender/", "TaskInformation");
    private final static QName _RecommendSequence_QNAME = new QName("http://webservices.interfaces.recommender/", "recommendSequence");
    private final static QName _RecommendNextAction_QNAME = new QName("http://webservices.interfaces.recommender/", "recommendNextAction");
    private final static QName _RegisterDecision_QNAME = new QName("http://webservices.interfaces.recommender/", "registerDecision");
    private final static QName _NextActionRecommendation_QNAME = new QName("http://webservices.interfaces.recommender/", "NextActionRecommendation");
    private final static QName _String_QNAME = new QName("http://webservices.interfaces.recommender/", "String");
    private final static QName _RecommendNextActionResponse_QNAME = new QName("http://webservices.interfaces.recommender/", "recommendNextActionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsclient.generated.prescriptiverecommender
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessvariableInformation }
     * 
     */
    public ProcessvariableInformation createProcessvariableInformation() {
        return new ProcessvariableInformation();
    }

    /**
     * Create an instance of {@link TaskInformation }
     * 
     */
    public TaskInformation createTaskInformation() {
        return new TaskInformation();
    }

    /**
     * Create an instance of {@link SequenceRecommendation }
     * 
     */
    public SequenceRecommendation createSequenceRecommendation() {
        return new SequenceRecommendation();
    }

    /**
     * Create an instance of {@link ValueNotReadableException }
     * 
     */
    public ValueNotReadableException createValueNotReadableException() {
        return new ValueNotReadableException();
    }

    /**
     * Create an instance of {@link RegisterDecisionResponse }
     * 
     */
    public RegisterDecisionResponse createRegisterDecisionResponse() {
        return new RegisterDecisionResponse();
    }

    /**
     * Create an instance of {@link RecommendNextActionResponse }
     * 
     */
    public RecommendNextActionResponse createRecommendNextActionResponse() {
        return new RecommendNextActionResponse();
    }

    /**
     * Create an instance of {@link NextActionRecommendation }
     * 
     */
    public NextActionRecommendation createNextActionRecommendation() {
        return new NextActionRecommendation();
    }

    /**
     * Create an instance of {@link RecommendNextAction }
     * 
     */
    public RecommendNextAction createRecommendNextAction() {
        return new RecommendNextAction();
    }

    /**
     * Create an instance of {@link RegisterDecision }
     * 
     */
    public RegisterDecision createRegisterDecision() {
        return new RegisterDecision();
    }

    /**
     * Create an instance of {@link RecommendSequence }
     * 
     */
    public RecommendSequence createRecommendSequence() {
        return new RecommendSequence();
    }

    /**
     * Create an instance of {@link RegisterEffect }
     * 
     */
    public RegisterEffect createRegisterEffect() {
        return new RegisterEffect();
    }

    /**
     * Create an instance of {@link RegisterEffectResponse }
     * 
     */
    public RegisterEffectResponse createRegisterEffectResponse() {
        return new RegisterEffectResponse();
    }

    /**
     * Create an instance of {@link RecommendSequenceResponse }
     * 
     */
    public RecommendSequenceResponse createRecommendSequenceResponse() {
        return new RecommendSequenceResponse();
    }

    /**
     * Create an instance of {@link GoalRequest }
     * 
     */
    public GoalRequest createGoalRequest() {
        return new GoalRequest();
    }

    /**
     * Create an instance of {@link SimAct }
     * 
     */
    public SimAct createSimAct() {
        return new SimAct();
    }

    /**
     * Create an instance of {@link NextBestAction }
     * 
     */
    public NextBestAction createNextBestAction() {
        return new NextBestAction();
    }

    /**
     * Create an instance of {@link SimPeriod }
     * 
     */
    public SimPeriod createSimPeriod() {
        return new SimPeriod();
    }

    /**
     * Create an instance of {@link SimGoal }
     * 
     */
    public SimGoal createSimGoal() {
        return new SimGoal();
    }

    /**
     * Create an instance of {@link KipGoal }
     * 
     */
    public KipGoal createKipGoal() {
        return new KipGoal();
    }

    /**
     * Create an instance of {@link ExpectedValue }
     * 
     */
    public ExpectedValue createExpectedValue() {
        return new ExpectedValue();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterEffectResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.interfaces.recommender/", name = "registerEffectResponse")
    public JAXBElement<RegisterEffectResponse> createRegisterEffectResponse(RegisterEffectResponse value) {
        return new JAXBElement<RegisterEffectResponse>(_RegisterEffectResponse_QNAME, RegisterEffectResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecommendSequenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.interfaces.recommender/", name = "recommendSequenceResponse")
    public JAXBElement<RecommendSequenceResponse> createRecommendSequenceResponse(RecommendSequenceResponse value) {
        return new JAXBElement<RecommendSequenceResponse>(_RecommendSequenceResponse_QNAME, RecommendSequenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterEffect }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.interfaces.recommender/", name = "registerEffect")
    public JAXBElement<RegisterEffect> createRegisterEffect(RegisterEffect value) {
        return new JAXBElement<RegisterEffect>(_RegisterEffect_QNAME, RegisterEffect.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterDecisionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.interfaces.recommender/", name = "registerDecisionResponse")
    public JAXBElement<RegisterDecisionResponse> createRegisterDecisionResponse(RegisterDecisionResponse value) {
        return new JAXBElement<RegisterDecisionResponse>(_RegisterDecisionResponse_QNAME, RegisterDecisionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SequenceRecommendation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.interfaces.recommender/", name = "SequenceRecommendation")
    public JAXBElement<SequenceRecommendation> createSequenceRecommendation(SequenceRecommendation value) {
        return new JAXBElement<SequenceRecommendation>(_SequenceRecommendation_QNAME, SequenceRecommendation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueNotReadableException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.interfaces.recommender/", name = "ValueNotReadableException")
    public JAXBElement<ValueNotReadableException> createValueNotReadableException(ValueNotReadableException value) {
        return new JAXBElement<ValueNotReadableException>(_ValueNotReadableException_QNAME, ValueNotReadableException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessvariableInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.interfaces.recommender/", name = "ProcessvariableInformation")
    public JAXBElement<ProcessvariableInformation> createProcessvariableInformation(ProcessvariableInformation value) {
        return new JAXBElement<ProcessvariableInformation>(_ProcessvariableInformation_QNAME, ProcessvariableInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.interfaces.recommender/", name = "TaskInformation")
    public JAXBElement<TaskInformation> createTaskInformation(TaskInformation value) {
        return new JAXBElement<TaskInformation>(_TaskInformation_QNAME, TaskInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecommendSequence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.interfaces.recommender/", name = "recommendSequence")
    public JAXBElement<RecommendSequence> createRecommendSequence(RecommendSequence value) {
        return new JAXBElement<RecommendSequence>(_RecommendSequence_QNAME, RecommendSequence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecommendNextAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.interfaces.recommender/", name = "recommendNextAction")
    public JAXBElement<RecommendNextAction> createRecommendNextAction(RecommendNextAction value) {
        return new JAXBElement<RecommendNextAction>(_RecommendNextAction_QNAME, RecommendNextAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterDecision }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.interfaces.recommender/", name = "registerDecision")
    public JAXBElement<RegisterDecision> createRegisterDecision(RegisterDecision value) {
        return new JAXBElement<RegisterDecision>(_RegisterDecision_QNAME, RegisterDecision.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NextActionRecommendation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.interfaces.recommender/", name = "NextActionRecommendation")
    public JAXBElement<NextActionRecommendation> createNextActionRecommendation(NextActionRecommendation value) {
        return new JAXBElement<NextActionRecommendation>(_NextActionRecommendation_QNAME, NextActionRecommendation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.interfaces.recommender/", name = "String")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecommendNextActionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.interfaces.recommender/", name = "recommendNextActionResponse")
    public JAXBElement<RecommendNextActionResponse> createRecommendNextActionResponse(RecommendNextActionResponse value) {
        return new JAXBElement<RecommendNextActionResponse>(_RecommendNextActionResponse_QNAME, RecommendNextActionResponse.class, null, value);
    }

}
