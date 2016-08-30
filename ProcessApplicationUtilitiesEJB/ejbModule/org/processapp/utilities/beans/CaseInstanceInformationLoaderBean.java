package org.processapp.utilities.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.history.HistoricCaseActivityInstance;
import org.camunda.bpm.engine.repository.CaseDefinition;
import org.camunda.bpm.engine.runtime.CaseExecution;
import org.camunda.bpm.engine.runtime.CaseInstance;
import org.processapp.utilities.beans.interfaces.ICaseInstanceInformationLoader;

import wsclient.generated.prescriptiverecommender.ProcessvariableInformation;
import wsclient.generated.prescriptiverecommender.TaskInformation;
import wsclient.generated.prescriptiverecommender.VariableType;

/**
 * Session Bean implementation class CaseInstanceInformationLoader
 */
@Stateless
@Remote(ICaseInstanceInformationLoader.class)
public class CaseInstanceInformationLoaderBean implements ICaseInstanceInformationLoader {

	@Inject
	private ProcessEngine engine;

	public CaseInstanceInformationLoaderBean() {

	}

	@Override
	public String getCaseId(String caseInstanceId) {
		CaseInstance caseInstance = engine.getCaseService().createCaseInstanceQuery().caseInstanceId(caseInstanceId)
				.singleResult();
		CaseDefinition caseDefinition = engine.getRepositoryService()
				.getCaseDefinition(caseInstance.getCaseDefinitionId());
		return caseDefinition.getKey();
	}

	@Override
	public List<TaskInformation> getTaskInformation(String caseInstanceId) {
		List<TaskInformation> taskInformationList = new ArrayList<>();
		List<CaseExecution> allExecutions = this.getAllExecutions(caseInstanceId);
		// Alle aktiven Aktivitäten
		for (CaseExecution caseExecution : allExecutions) {
			TaskInformation taskInformation = new TaskInformation();
			if (caseExecution.isActive()) {
				taskInformation.setTaskReferenceInProcessEngine(caseExecution.getActivityId());
				taskInformation.setTaskState("active");
			} else if (caseExecution.isAvailable()) {
				taskInformation.setTaskReferenceInProcessEngine(caseExecution.getActivityId());
				taskInformation.setTaskState("available");
			} else if (caseExecution.isEnabled()) {
				taskInformation.setTaskReferenceInProcessEngine(caseExecution.getActivityId());
				taskInformation.setTaskState("enabled");
			}
			taskInformationList.add(taskInformation);
		}
		List<HistoricCaseActivityInstance> completedCaseExecutions = this.getCompletedCaseExecutions(caseInstanceId);
		for (HistoricCaseActivityInstance completedTask : completedCaseExecutions) {
			TaskInformation taskInformation = new TaskInformation();
			taskInformation.setTaskReferenceInProcessEngine(completedTask.getCaseActivityId());
			taskInformation.setTaskState("completed");
			taskInformationList.add(taskInformation);
		}
		return taskInformationList;
	}

	@Override
	public List<ProcessvariableInformation> getVariableInformation(String caseInstanceId) {
		Map<String, Object> variables = this.getVariables(caseInstanceId);
		List<ProcessvariableInformation> variableInformationList = new ArrayList<>();
		for (Map.Entry<String, Object> entry : variables.entrySet()) {
			ProcessvariableInformation variableInformation = new ProcessvariableInformation();
			variableInformation.setVariableReferenceInProcessEngine(entry.getKey());
			Object object = entry.getValue();

			if (Integer.class.isInstance(object)) {
				variableInformation.setVariableType(VariableType.INTEGER);
				variableInformation.setVariableValue(String.valueOf(object));
			} else if (String.class.isInstance(object)) {
				variableInformation.setVariableType(VariableType.STRING);
				variableInformation.setVariableValue(String.valueOf(object));
			} else if (Boolean.class.isInstance(object)) {
				variableInformation.setVariableType(VariableType.BOOLEAN);
				variableInformation.setVariableValue(String.valueOf(object));
			} else if (Double.class.isInstance(object)) {
				variableInformation.setVariableType((VariableType.DOUBLE));
				variableInformation.setVariableValue(String.valueOf(object));
			} else {

			}
			variableInformationList.add(variableInformation);
		}
		return variableInformationList;
	}

	private List<CaseExecution> getAllExecutions(String caseInstanceId) {
		return this.engine.getCaseService().createCaseExecutionQuery().caseInstanceId(caseInstanceId).list();
	}

	private List<HistoricCaseActivityInstance> getCompletedCaseExecutions(String caseInstanceId) {
		return this.engine.getHistoryService().createHistoricCaseActivityInstanceQuery().caseInstanceId(caseInstanceId)
				.completed().list();
	}

	private Map<String, Object> getVariables(String caseInstanceId) {
		return this.engine.getCaseService().getVariables(caseInstanceId);
	}

	@Override
	public String getFirstCaseInstanceId() {
		List<CaseInstance> list = this.engine.getCaseService().createCaseInstanceQuery().active().list();
		if (list.size() > 0) {
			return list.get(0).getCaseInstanceId();
		}
		return null;
	}

}
