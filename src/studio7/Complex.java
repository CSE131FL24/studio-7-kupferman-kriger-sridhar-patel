package studio7;

public class Complex {
	private double real;
	private double imaginary; 
	
	public Complex(double a, double b) {
		real = a;
		imaginary = b;
	}
	
	public double getReal() {
		return real;
	}
	
	public double getImaginary() {
		return imaginary;
	}
	public Complex sum(Complex c) {
		return new Complex(real + c.getReal(), imaginary + c.getImaginary());
		
	}
	public Complex product(Complex c) {
		double tempReal = ((real * c.getReal()) - (imaginary * c.getImaginary()));
		double tempImaginary = ((real * c.getImaginary()) + (imaginary * c.getReal()));
		return new Complex(tempReal, tempImaginary);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
