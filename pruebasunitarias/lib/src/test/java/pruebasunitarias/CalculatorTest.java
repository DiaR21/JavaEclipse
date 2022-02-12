package pruebasunitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	private final Calculator calculator=new Calculator();
	

	@Test
	void addition() {
		assertEquals(8, calculator.addNumbers(5, 3));
	}
	
	@Test
	void substraction() {
		assertEquals(2, calculator.subtractNumbers(5, 3));
	}
	@Test
	void addition() {
		assertEquals(5, calculator.divideNumbers(10, 2));
	}
	@Test
	void addition() {
		assertEquals(8, calculator.multiplyNumbers(4, 2));
	}
	
	
	
}
