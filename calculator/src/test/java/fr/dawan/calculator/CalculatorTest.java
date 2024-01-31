package fr.dawan.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	
	private Calculator calculator;
	
	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}

	
	@Test
	void testSum() {
		double expectedValue = 5;
		double actualValue = calculator.sum(2, 3);
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void testSubstract() {
		double expectedValue = 2;
		double actualValue = calculator.substract(9, 7);
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void testMultiply() {
		double expectedValue = 81;
		double actualValue = calculator.multiply(9, 9);
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void testDivide() {
		double expectedValue = 5;
		double actualValue = calculator.divide(15, 3);
		assertEquals(expectedValue, actualValue);
	}

}
