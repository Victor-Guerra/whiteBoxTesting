package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OddAndEvenEvaluatorTest {

	OddAndEvenEvaluator eval = new OddAndEvenEvaluator();
	
	@Test
	public void givenA2B2WhenEvaluateThenCEvenDEven() {
		// Given
		double a = 2.0;
		double b = 2.0;
		// When
		String result = eval.evaluate(a, b);
		// Then
		assertEquals("C is even and D is even, c=4.0 and d=0.0", result);
	}
	
	@Test
	public void givenA1B2WhenEvaluateThenCOddDOdd() {
		// Given
		double a = 1.0;
		double b = 2.0;
		// When
		String result = eval.evaluate(a, b);
		// Then
		assertEquals("C is odd and D is odd, c=3.0 and d=-1.0", result);
	}

	@Test
	public void givenA1B1WhenEvaluateThenCEvenDEven() {
		// Given
		double a = 1.0;
		double b = 1.0;
		// When
		String result = eval.evaluate(a, b);
		// Then
		assertEquals("C is even and D is even, c=2.0 and d=0.0", result);
	}
	

}
