import static org.junit.Assert.*;

import org.junit.Test;

public class OperationsTest {
	// comment
	@Test
	public void testSumComplexNumber() {
		ComplexNumber outputComplexNumber = new ComplexNumber();
		ComplexNumber complexNumber1 = new ComplexNumber(3, 2);
		ComplexNumber complexNumber2 = new ComplexNumber(1, 4);
		
		outputComplexNumber = Operations.sumComplexNumber(complexNumber1, complexNumber2);
		
		float[] expected = new float[2];
		float[] actual = new float[2];
		
		expected[0] = 4;
		expected[1] = 6;
		
		actual[0] = outputComplexNumber.getRe();
		actual[1] = outputComplexNumber.getIm();
		
		assertArrayEquals(expected, actual, 0);
	}
	
	@Test
	public void testMultiplyComplexNumber() {
		ComplexNumber outputComplexNumber = new ComplexNumber();
		ComplexNumber complexNumber1 = new ComplexNumber(3, 2);
		ComplexNumber complexNumber2 = new ComplexNumber(1, 4);
		
		outputComplexNumber = Operations.multiplyComplexNumber(complexNumber1, complexNumber2);
		
		float[] expected = new float[2];
		float[] actual = new float[2];
		
		expected[0] = -5;
		expected[1] = 14;
		
		actual[0] = outputComplexNumber.getRe();
		actual[1] = outputComplexNumber.getIm();
		
		assertArrayEquals(expected, actual, 0);
	}

}
