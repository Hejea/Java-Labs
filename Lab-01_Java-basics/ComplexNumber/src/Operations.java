
public class Operations {

	public static ComplexNumber sumComplexNumber(ComplexNumber number1, ComplexNumber number2) {
		
		ComplexNumber sumOfComplexNumber = new ComplexNumber();
		
		sumOfComplexNumber.setRe(number1.getRe() + number2.getRe());
		sumOfComplexNumber.setIm(number1.getIm() + number2.getIm());
		
		return sumOfComplexNumber;
		
	}
	public static ComplexNumber multiplyComplexNumber(ComplexNumber number1, ComplexNumber number2) {
		
		//      z1     *     z2       =
		// (re1 + im1*i)(re2 + im2*i) = (re1*re2 - im1*im2) + (re1*im2 + re2*im1)*i
		
		ComplexNumber multOfComplexNumber = new ComplexNumber();
		
		multOfComplexNumber.setRe(number1.getRe()*number2.getRe() - number1.getIm()*number2.getIm());
		multOfComplexNumber.setIm(number1.getRe()*number2.getIm() + number2.getRe()*number1.getIm());
		
		return multOfComplexNumber;
		
	}
}
