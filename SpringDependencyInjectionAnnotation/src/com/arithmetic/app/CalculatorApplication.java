package com.arithmetic.app;

import javax.xml.ws.BindingType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.arithmetic.service.CalculatorService;

@Component
@Qualifier("calculatorApp")
@ComponentScan("com.arithmetic.app")
public class CalculatorApplication {
	
	private CalculatorService calculatorService;
	
	@Autowired
	@Qualifier("calculatorService")
	public void setCalculatorService(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}
	

	public Float addNumbers(Float a, Float b) {
		return calculatorService.sum(a, b);
	}
	
}
