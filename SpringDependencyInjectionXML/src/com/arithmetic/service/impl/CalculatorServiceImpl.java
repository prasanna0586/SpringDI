package com.arithmetic.service.impl;

import com.arithmetic.service.CalculatorService;


public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public Float sum(Float num1, Float num2) {
		
		return num1 + num2;
	}

}
