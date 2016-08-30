package org.processapp.utilities.exceptions;

public class CaseInstanceNotValidException extends Exception {

	private static final long serialVersionUID = 1L;

	public CaseInstanceNotValidException(String caseInstanceId) {
		super("Case Instance " + caseInstanceId + " is invalid!");
	}

}
