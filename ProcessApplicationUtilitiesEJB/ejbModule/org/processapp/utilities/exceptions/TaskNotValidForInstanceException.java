package org.processapp.utilities.exceptions;

public class TaskNotValidForInstanceException extends Exception {

	private static final long serialVersionUID = 1L;

	public TaskNotValidForInstanceException(String taskRef, String caseInstanceId) {
		super("The Task with reference " + taskRef + " for case Instance " + caseInstanceId + " could not be found!");
	}
}
