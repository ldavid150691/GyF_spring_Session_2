package com.co.gyf.mapper;

import com.co.gyf.dto.ErrorDTO;
import com.co.gyf.dto.ResponseDTO;
import com.co.gyf.dto.SuccessDTO;
import com.co.gyf.util.exception.ConstantException;
import com.co.gyf.util.exception.ServiceException;

public class CalculatorMapper {

	public static ResponseDTO successMapper(double result) {

		ResponseDTO response = new ResponseDTO();
		SuccessDTO dto = new SuccessDTO();
		dto.setResult(result);
		response.setSuccess(dto);
		return response;
	}

	public static ResponseDTO errorMapper(ServiceException exception) {
		ResponseDTO response = new ResponseDTO();
		ErrorDTO dto = new ErrorDTO();
		dto.setCodeMessage(exception.getServiceException().getCodeMessage());
		dto.setDescriptionMessage(exception.getServiceException().getDescriptionMessage());
		response.setError(dto);
		return response;

	}

	public static ResponseDTO controllerErrorMapper(Exception exception) {
		ResponseDTO response = new ResponseDTO();
		ErrorDTO dto = new ErrorDTO();
		dto.setCodeMessage(ConstantException.CODE_E00);
		dto.setDescriptionMessage(exception.toString());
		response.setError(dto);
		return response;

	}

}
