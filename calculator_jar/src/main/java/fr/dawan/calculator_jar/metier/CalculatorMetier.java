package fr.dawan.calculator_jar.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.dawan.calculator.Calculator;

@Service 
public class CalculatorMetier {
	
	@Autowired
	private Calculator calculator;
	
	public CalculatorMetier() {
	}

	public CalculatorMetier(Calculator calculator) {
		super();
		this.calculator = calculator;
	}
	
	public double calculate(double num1, double num2, String operation) {
		double result = 0.0;
		
		switch(operation) {
		case "add": 
			result = calculator.sum(num1, num2);
			break;
		case "substract": 
			result = calculator.substract(num1, num2);
			break;
		case "multiply": 
			result = calculator.multiply(num1, num2);
			break;
		case "divide": 
			result = calculator.divide(num1, num2);
			break;			
		}
		
		return result;
	}

}
