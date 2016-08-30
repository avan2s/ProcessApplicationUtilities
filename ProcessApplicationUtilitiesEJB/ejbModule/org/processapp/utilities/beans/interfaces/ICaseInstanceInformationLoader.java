package org.processapp.utilities.beans.interfaces;

import java.util.List;

import wsclient.generated.prescriptiverecommender.ProcessvariableInformation;
import wsclient.generated.prescriptiverecommender.TaskInformation;

// TODO: Auto-generated Javadoc
/**
 * The Interface ICaseInstanceInformationLoader.
 */
public interface ICaseInstanceInformationLoader {

	/**
	 * Gets the first case instance id.
	 *
	 * @return the first case instance id
	 */
	String getFirstCaseInstanceId();

	/**
	 * Gets the case id.
	 *
	 * @param caseInstanceId the case instance id
	 * @return the case id
	 */
	String getCaseId(String caseInstanceId);

	/**
	 * Gets the variable information.
	 *
	 * @param caseInstanceId the case instance id
	 * @return the variable information
	 */
	List<ProcessvariableInformation> getVariableInformation(String caseInstanceId);

	/**
	 * Gets the task information.
	 *
	 * @param caseInstanceId the case instance id
	 * @return the task information
	 */
	List<TaskInformation> getTaskInformation(String caseInstanceId);
}
