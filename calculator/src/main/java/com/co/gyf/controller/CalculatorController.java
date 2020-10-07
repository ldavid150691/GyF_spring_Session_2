package com.co.gyf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.gyf.dto.CalculatorDTO;
import com.co.gyf.mapper.CalculatorMapper;
import com.co.gyf.service.CalculatorService;
import com.co.gyf.util.exception.ServiceException;

@RestController
@RequestMapping("/api/calculator")
@CrossOrigin(origins = "*")
public class CalculatorController {

	@Autowired
	private CalculatorService calculatorService;

	@GetMapping("/test")
	public ResponseEntity<?> test() {
		return ResponseEntity.ok().body("ok");

	}

	@PostMapping("/sum")
	public ResponseEntity<?> sum(@RequestBody CalculatorDTO request) {

		try {
			return ResponseEntity.ok()
					.body(CalculatorMapper.successMapper(calculatorService.sum(request.getNum1(), request.getNum2())));
		} catch (ServiceException e) {

			return ResponseEntity.badRequest().body(CalculatorMapper.errorMapper(e));

		} catch (Exception e) {

			return ResponseEntity.badRequest().body(CalculatorMapper.controllerErrorMapper(e));
		}

	}

	@PostMapping("/subtraction")
	public ResponseEntity<?> subtraction(@RequestBody CalculatorDTO request) {
		try {
			return ResponseEntity.ok().body(CalculatorMapper
					.successMapper(calculatorService.subtraction(request.getNum1(), request.getNum2())));
		} catch (ServiceException e) {

			return ResponseEntity.badRequest().body(CalculatorMapper.errorMapper(e));

		} catch (Exception e) {

			return ResponseEntity.badRequest().body(CalculatorMapper.controllerErrorMapper(e));
		}

	}

	@PostMapping("/division")
	public ResponseEntity<?> division(@RequestBody CalculatorDTO request) {
		try {
			return ResponseEntity.ok().body(
					CalculatorMapper.successMapper(calculatorService.division(request.getNum1(), request.getNum2())));
		} catch (ServiceException e) {

			return ResponseEntity.badRequest().body(CalculatorMapper.errorMapper(e));

		} catch (Exception e) {

			return ResponseEntity.badRequest().body(CalculatorMapper.controllerErrorMapper(e));
		}
	}

	@PostMapping("/multiplication")
	public ResponseEntity<?> multiplication(@RequestBody CalculatorDTO request) {
		try {
			return ResponseEntity.ok().body(CalculatorMapper
					.successMapper(calculatorService.multiplication(request.getNum1(), request.getNum2())));
		} catch (ServiceException e) {

			return ResponseEntity.badRequest().body(CalculatorMapper.errorMapper(e));

		} catch (Exception e) {

			return ResponseEntity.badRequest().body(CalculatorMapper.controllerErrorMapper(e));
		}

	}
}
