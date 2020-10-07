package com.co.gyf.dto;

public class ResponseDTO {

	private SuccessDTO success;
	private ErrorDTO error;

	public SuccessDTO getSuccess() {
		return success;
	}

	public void setSuccess(SuccessDTO success) {
		this.success = success;
	}

	public ErrorDTO getError() {
		return error;
	}

	public void setError(ErrorDTO error) {
		this.error = error;
	}

}
