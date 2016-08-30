package org.processapp.utilities.beans.interfaces;

import java.util.List;

import javax.ejb.Remote;

import org.processapp.utilities.exceptions.CaseInstanceNotValidException;
import org.processapp.utilities.exceptions.TaskNotValidForInstanceException;

import wsclient.generated.prescriptiverecommender.GoalRequest;
import wsclient.generated.prescriptiverecommender.NextActionRecommendation;
import wsclient.generated.prescriptiverecommender.ObservedEffect;
import wsclient.generated.prescriptiverecommender.SequenceRecommendation;
import wsclient.generated.prescriptiverecommender.SequenceType;

// TODO: Auto-generated Javadoc
/**
 * The Interface IPrescriptiveServiceCaller.
 */
@Remote
public interface IPrescriptiveServiceCaller {

	/**
	 * Recommend next action.
	 *
	 * @param caseInstanceId the case instance id
	 * @param goals the goals
	 * @param doNothingActionAllowed the do nothing action allowed
	 * @return the next action recommendation
	 */
	NextActionRecommendation recommendNextAction(String caseInstanceId, List<GoalRequest> goals,
			boolean doNothingActionAllowed);

	/**
	 * Recommend sequence.
	 *
	 * @param caseInstanceId the case instance id
	 * @param sequenceType the sequence type
	 * @param numberOfDecisions the number of decisions
	 * @param goals the goals
	 * @param doNothingActionAllowed the do nothing action allowed
	 * @return the sequence recommendation
	 * @throws CaseInstanceNotValidException the case instance not valid exception
	 */
	SequenceRecommendation recommendSequence(String caseInstanceId, SequenceType sequenceType, int numberOfDecisions,
			List<GoalRequest> goals, boolean doNothingActionAllowed) throws CaseInstanceNotValidException;

	/**
	 * Register decision.
	 *
	 * @param caseInstanceId the case instance id
	 * @param activityId the activity id
	 * @return the string
	 * @throws TaskNotValidForInstanceException the task not valid for instance exception
	 */
	String registerDecision(String caseInstanceId, String activityId) throws TaskNotValidForInstanceException;

	/**
	 * Register effect.
	 *
	 * @param caseIntanceId the case intance id
	 * @param activityId the activity id
	 * @param goalFigure the goal figure
	 * @param observedEffect the observed effect
	 * @return the string
	 * @throws TaskNotValidForInstanceException the task not valid for instance exception
	 */
	String registerEffect(String caseIntanceId, String activityId, String goalFigure, ObservedEffect observedEffect)
			throws TaskNotValidForInstanceException;

}
