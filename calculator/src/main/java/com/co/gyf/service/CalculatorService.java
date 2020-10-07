package com.co.gyf.service;

import com.co.gyf.dto.CalculatorDTO;
import com.co.gyf.dto.ResponseDTO;
import com.co.gyf.util.exception.ServiceException;

public interface CalculatorService {

	public Double sum(Double num1, Double num2) throws ServiceException;

	public Double subtraction(Double num1, Double num2) throws ServiceException;

	public Double division(Double num1, Double num2) throws ServiceException;

	public Double multiplication(Double num1, Double num2) throws ServiceException;

}
