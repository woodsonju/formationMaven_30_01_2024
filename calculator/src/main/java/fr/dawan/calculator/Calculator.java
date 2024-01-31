package fr.dawan.calculator;

public class Calculator {
	
	public double sum(double num1, double num2) {
		return num1 + num2;
	}
	
	public double substract(double num1, double num2) {
		return num1 - num2;
	}
	
	public double multiply(double num1, double num2) {
		return num1 * num2;
	}
	
	public double divide(double num1, double num2) {
		
		if(num2 != 0) {	
			double result = num1/num2;
			return result;
		} else {
			throw new ArithmeticException("Divide by zero is not allowed");
		}

	}

}
