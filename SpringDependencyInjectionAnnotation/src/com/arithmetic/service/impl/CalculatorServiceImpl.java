package com.arithmetic.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.arithmetic.service.CalculatorService;

@Service
@Qualifier("calculatorService")
@ComponentScan("com.arithmetic.service.impl")
public class CalculatorServiceImpl implements CalculatorService {

	public Float sum(Float num1, Float num2) {
		
		return num1 + num2;
	}

}
