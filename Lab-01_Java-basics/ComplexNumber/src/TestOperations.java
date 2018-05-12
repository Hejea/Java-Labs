/*

public class TestOperations {
	// comment
	public static void main(String[] args) {
		
		// a greeting

		TestOperations.testSumComplexNumber();
		TestOperations.testMultiplyComplexNumber();
	
	}
	
	public static void testSumComplexNumber() {
		ComplexNumber complexNumber = new ComplexNumber();
		ComplexNumber complexNumber1 = new ComplexNumber(3, 2);
		ComplexNumber complexNumber2 = new ComplexNumber(1, 4);
		
		complexNumber = Operations.sumComplexNumber(complexNumber1, complexNumber2);
		
		System.out.println("Addition of z1 + z2 = z");
		System.out.print("z = (");
		System.out.print(complexNumber1.getRe() + ((complexNumber1.getIm() < 0)?(" "):(" +")) + complexNumber1.getIm() + "*i)");
		System.out.print(" + (");
		System.out.print(complexNumber2.getRe() + ((complexNumber2.getIm() < 0)?(" "):(" +")) + complexNumber2.getIm() + "*i)");
		System.out.print(" = ");
		System.out.println(complexNumber.getRe() + ((complexNumber.getIm() < 0)?(" "):(" +")) + complexNumber.getIm() + "*i");
	}
	
	public static void testMultiplyComplexNumber() {
		
		//	    z1  *   z2    =
		// (3 + 2i)(1 + 4i) = 3 + 12i + 2i + 8i*i
		// z = –5 + 14i
		
		ComplexNumber complexNumber = new ComplexNumber();
		ComplexNumber complexNumber1 = new ComplexNumber();
		ComplexNumber complexNumber2 = new ComplexNumber(1, 4);
		
		complexNumber1.setRe(3);
		complexNumber1.setIm(2);
		
		complexNumber = Operations.multiplyComplexNumber(complexNumber1, complexNumber2);
		
		System.out.println("Multiplication of z1 * z2 = z");
		System.out.print("z = (");
		System.out.print(complexNumber1.getRe() + ((complexNumber1.getIm() < 0)?(" "):(" +")) + complexNumber1.getIm() + "*i)");
		System.out.print(" * (");
		System.out.print(complexNumber2.getRe() + ((complexNumber2.getIm() < 0)?(" "):(" +")) + complexNumber2.getIm() + "*i)");
		System.out.print(" = ");
		System.out.println(complexNumber.getRe() + ((complexNumber.getIm() < 0)?(" "):(" +")) + complexNumber.getIm() + "*i");
		
	}
}
//*/
