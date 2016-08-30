package org.processapp.utilities.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.runtime.CaseExecution;
import org.camunda.bpm.engine.runtime.CaseInstance;

@Stateless
@LocalBean
public class CaseValidatorBean {

	@Inject
	private ProcessEngine engine;

	public boolean validateCaseInstance(String caseInstanceId) {
		List<CaseInstance> list = this.engine.getCaseService().createCaseInstanceQuery().caseInstanceId(caseInstanceId)
				.list();
		return list.size() > 0;
	}

	public boolean validateActivityId(String caseInstanceId, String activityId) {
		List<CaseExecution> list = this.engine.getCaseService().createCaseExecutionQuery()
				.caseInstanceId(caseInstanceId).activityId(activityId).list();
		return list.size() > 0;
	}
}
