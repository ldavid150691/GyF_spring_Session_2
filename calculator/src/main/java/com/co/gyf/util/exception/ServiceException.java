package com.co.gyf.util.exception;

public class ServiceException extends Exception {

	private final ExceptionModel errorModel;

	public ServiceException(String codeMessage, String descriptionMessage, String level, Exception e) {
		super();
		errorModel = new ExceptionModel();
		errorModel.setCodeMessage(codeMessage);
		errorModel.setDescriptionMessage(descriptionMessage);
		errorModel.setLevel(level);
		errorModel.setErrorDescription(e.getMessage());
	}

	public ServiceException(String codeMessage, String descriptionMessage, String level) {
		super();
		errorModel = new ExceptionModel();
		errorModel.setCodeMessage(codeMessage);
		errorModel.setDescriptionMessage(descriptionMessage);
		errorModel.setLevel(level);
		errorModel.setErrorDescription(null);
	}

	public ExceptionModel getServiceException() {
		return errorModel;
	}

}
