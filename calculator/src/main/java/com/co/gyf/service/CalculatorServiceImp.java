package com.co.gyf.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.co.gyf.dto.CalculatorDTO;
import com.co.gyf.dto.ResponseDTO;
import com.co.gyf.util.exception.ConstantException;
import com.co.gyf.util.exception.ServiceException;

@Scope("singleton")
@Service
public class CalculatorServiceImp implements CalculatorService {

	@Override
	public Double sum(Double num1, Double num2) throws ServiceException {

		try {
			return num1 + num2;
		} catch (Exception e) {
			throw new ServiceException(ConstantException.CODE_E01, ConstantException.MESSAGE_E01,
					ConstantException.CODE_LEVEL_SERVICE, e);
		}

	}

	@Override
	public Double subtraction(Double num1, Double num2) throws ServiceException {
		try {
			return num1 - num2;
		} catch (Exception e) {
			throw new ServiceException(ConstantException.CODE_E02, ConstantException.MESSAGE_E02,
					ConstantException.CODE_LEVEL_SERVICE, e);
		}

	}

	@Override
	public Double division(Double num1, Double num2) throws ServiceException {
		try {

			if (num2 == 0) {
				throw new ArithmeticException("Division entre cero.");
			}

			return num1 / num2;
		} catch (ArithmeticException e) {
			throw new ServiceException(ConstantException.CODE_E05, ConstantException.MESSAGE_E05,
					ConstantException.CODE_LEVEL_SERVICE, e);
		} catch (Exception e) {
			throw new ServiceException(ConstantException.CODE_E03, ConstantException.MESSAGE_E03,
					ConstantException.CODE_LEVEL_SERVICE, e);
		}

	}

	@Override
	public Double multiplication(Double num1, Double num2) throws ServiceException {
		try {
			return num1 * num2;
		} catch (Exception e) {
			throw new ServiceException(ConstantException.CODE_E04, ConstantException.MESSAGE_E04,
					ConstantException.CODE_LEVEL_SERVICE, e);
		}

	}

}
