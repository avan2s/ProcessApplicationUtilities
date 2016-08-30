package org.processapp.utilities.beans;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;

import org.processapp.utilities.beans.interfaces.ICaseInstanceInformationLoader;
import org.processapp.utilities.beans.interfaces.IPrescriptiveServiceCaller;
import org.processapp.utilities.exceptions.CaseInstanceNotValidException;
import org.processapp.utilities.exceptions.TaskNotValidForInstanceException;

import wsclient.generated.prescriptiverecommender.GoalRequest;
import wsclient.generated.prescriptiverecommender.NextActionRecommendation;
import wsclient.generated.prescriptiverecommender.ObservedEffect;
import wsclient.generated.prescriptiverecommender.PrescriptiveRecommender;
import wsclient.generated.prescriptiverecommender.PrescriptiveRecommenderService;
import wsclient.generated.prescriptiverecommender.ProcessvariableInformation;
import wsclient.generated.prescriptiverecommender.SequenceRecommendation;
import wsclient.generated.prescriptiverecommender.SequenceType;
import wsclient.generated.prescriptiverecommender.TaskInformation;

@Stateless
public class PrescriptiveServiceCallerBean implements IPrescriptiveServiceCaller {

	@EJB
	ICaseInstanceInformationLoader informationLoader;

	@EJB
	private CaseValidatorBean validator;

	@WebServiceRef(PrescriptiveRecommenderService.class)
	private PrescriptiveRecommender port;

	@Override
	public NextActionRecommendation recommendNextAction(String caseInstanceId, List<GoalRequest> goals,
			boolean doNothingActionAllowed) {
		String refProcess = this.informationLoader.getCaseId(caseInstanceId);
		List<TaskInformation> taskInformationList = this.informationLoader.getTaskInformation(caseInstanceId);
		List<ProcessvariableInformation> variableInformationList = this.informationLoader
				.getVariableInformation(caseInstanceId);
		try {
			NextActionRecommendation recommendation = this.port.recommendNextAction(refProcess, caseInstanceId, goals,
					variableInformationList, taskInformationList, true);
			return recommendation;
		} catch (Exception ex) {

		}
		return null;
	}

	@Override
	public SequenceRecommendation recommendSequence(String caseInstanceId, SequenceType sequenceType,
			int numberOfDecisions, List<GoalRequest> goals, boolean doNothingActionAllowed)
			throws CaseInstanceNotValidException {
		String refProcess = this.informationLoader.getCaseId(caseInstanceId);
		if (refProcess != null) {
			List<TaskInformation> taskInformationList = this.informationLoader.getTaskInformation(caseInstanceId);
			List<ProcessvariableInformation> variableInformationList = this.informationLoader
					.getVariableInformation(caseInstanceId);
			try {
				SequenceRecommendation recommendation = this.port.recommendSequence(sequenceType, numberOfDecisions,
						refProcess, caseInstanceId, goals, variableInformationList, taskInformationList,
						doNothingActionAllowed);
				return recommendation;
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
		throw new CaseInstanceNotValidException(caseInstanceId);
	}

	@Override
	public String registerDecision(String caseInstanceId, String activityId) throws TaskNotValidForInstanceException {
		boolean activityIsValid = this.validator.validateActivityId(caseInstanceId, activityId);
		String refProcess = this.informationLoader.getCaseId(caseInstanceId);
		List<TaskInformation> taskInformationList = this.informationLoader.getTaskInformation(caseInstanceId);
		if (refProcess != null && activityIsValid) {
			List<ProcessvariableInformation> variableInformationList = this.informationLoader
					.getVariableInformation(caseInstanceId);
			try {
				String resultMessage = this.port.registerDecision(refProcess, caseInstanceId, activityId,
						variableInformationList, taskInformationList);
				return resultMessage;
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
				return null;
			}
		}
		throw new TaskNotValidForInstanceException(activityId, caseInstanceId);

	}

	@Override
	public String registerEffect(String caseInstanceId, String activityId, String goalFigure,
			ObservedEffect observedEffect) throws TaskNotValidForInstanceException {
		boolean activityIsValid = this.validator.validateActivityId(caseInstanceId, activityId);
		if (activityIsValid) {
			try {
				String resultMessage = this.port.registerEffect(caseInstanceId, activityId, goalFigure, observedEffect);
				return resultMessage;
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
				return null;
			}
		}
		throw new TaskNotValidForInstanceException(activityId, caseInstanceId);
	}

	// public void test() {
	// PrescriptiveRecommenderService service = new
	// PrescriptiveRecommenderService();
	// PrescriptiveRecommender port = service.getPrescriptiveRecommenderPort();
	// try {
	//
	// String refProcess = "shitstorm-ref";
	// String refInstance = "shitstorm-instance-4";
	// double kWeight = 100;
	// double kzWeight = 1;
	// double zaWeight = 1;
	// double spWeight = 1;
	// double igWeight = 1;
	// double sum = kWeight + kzWeight + zaWeight + spWeight + igWeight;
	// // Ziele definieren
	// GoalRequest goalK = new GoalRequest();
	// goalK.setGoalStartPeriod(0);
	// goalK.setGoalEndPeriod(4);
	// goalK.setGoalFigure("Kosten");
	// goalK.setGoalWeight(kWeight / sum);
	// goalK.setGoalValue(10000);
	//
	// GoalRequest goalZA = new GoalRequest();
	// goalZA.setGoalStartPeriod(0);
	// goalZA.setGoalEndPeriod(4);
	// goalZA.setGoalFigure("Zeitaufwand");
	// goalZA.setGoalValue(270);
	// goalZA.setGoalWeight(zaWeight / sum);
	//
	// GoalRequest goalKz = new GoalRequest();
	// goalKz.setGoalStartPeriod(0);
	// goalKz.setGoalEndPeriod(4);
	// goalKz.setGoalFigure("Kundenzufriedenheit");
	// goalKz.setGoalValue(20);
	// goalKz.setGoalWeight(kzWeight / sum);
	//
	// GoalRequest goalSP = new GoalRequest();
	// goalSP.setGoalStartPeriod(0);
	// goalSP.setGoalEndPeriod(4);
	// goalSP.setGoalFigure("Stakeholder-Power");
	// goalSP.setGoalValue(-40);
	// goalSP.setGoalWeight(spWeight / sum);
	//
	// GoalRequest goalIG = new GoalRequest();
	// goalIG.setGoalStartPeriod(0);
	// goalIG.setGoalEndPeriod(4);
	// goalIG.setGoalFigure("Informationsgewinn");
	// goalIG.setGoalValue(1);
	// goalIG.setGoalWeight(igWeight / sum);
	//
	// List<GoalRequest> goals = new ArrayList<>();
	// goals.add(goalK);
	// goals.add(goalKz);
	// goals.add(goalIG);
	// goals.add(goalSP);
	// goals.add(goalZA);
	//
	// List<ProcessvariableInformation> variableInformationList = new
	// ArrayList<>();
	// ProcessvariableInformation varKz = new ProcessvariableInformation();
	// varKz.setVariableReferenceInProcessEngine("kundenzufriedenheit");
	// varKz.setVariableValue("niedrig");
	// varKz.setVariableType(VariableType.STRING);
	//
	// ProcessvariableInformation varU = new ProcessvariableInformation();
	// varU.setVariableReferenceInProcessEngine("ursache");
	// varU.setVariableValue("unbekannt");
	// varU.setVariableType(VariableType.STRING);
	//
	// ProcessvariableInformation varSP = new ProcessvariableInformation();
	// varSP.setVariableReferenceInProcessEngine("stakeholderPower");
	// varSP.setVariableValue("hoch");
	// varSP.setVariableType(VariableType.STRING);
	// variableInformationList.add(varU);
	// variableInformationList.add(varSP);
	// variableInformationList.add(varKz);
	//
	// List<TaskInformation> taskInformationList = new ArrayList<>();
	// TaskInformation tSmtb = new TaskInformation();
	// tSmtb.setTaskReferenceInProcessEngine("SMTb");
	// tSmtb.setTaskState("enabled");
	//
	// TaskInformation tUf = new TaskInformation();
	// tUf.setTaskReferenceInProcessEngine("Uf");
	// tUf.setTaskState("enabled");
	//
	// TaskInformation tVe = new TaskInformation();
	// tVe.setTaskReferenceInProcessEngine("Ve");
	// tVe.setTaskState("available");
	//
	// TaskInformation tEv = new TaskInformation();
	// tEv.setTaskReferenceInProcessEngine("Ev");
	// tEv.setTaskState("enabled");
	//
	// taskInformationList.add(tSmtb);
	// taskInformationList.add(tUf);
	// taskInformationList.add(tVe);
	// taskInformationList.add(tEv);
	//
	// NextActionRecommendation act = port.recommendNextAction(refProcess,
	// refInstance, goals,
	// variableInformationList, taskInformationList, true);
	// return;
	// } catch (Exception ex) {
	// return;
	// }
	// }

}
