package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int num, int den) {
		numerator = num;
		denominator = den;
	}
	
	public int getDenominator() {
		return denominator;
	}
	public int getNumerator() {
		return numerator;
	}
	public Fraction simplify() {
		int tempNumerator = numerator / gcd(numerator, denominator);
		int tempDenominator = denominator / gcd(numerator, denominator);
		return new Fraction(tempNumerator, tempDenominator);
	}
	
	public Fraction sum(Fraction f1) {
		int commonDenominator = denominator * f1.getDenominator();
		Fraction tempFraction = new Fraction(numerator * f1.getDenominator() + f1.getNumerator() * denominator, commonDenominator);
		return tempFraction.simplify();
	}
	
	public Fraction product(Fraction f1) {
		Fraction tempFraction = new Fraction(numerator * f1.getNumerator(), denominator * f1.getDenominator());
		return tempFraction.simplify();
	}
	
	public Fraction reciprocal() {
		return new Fraction(denominator, numerator);
	}
	
	public static int gcd(int p, int q) {
		if(q == 0) {
			return p;
		}
		else {
			return gcd(q, p % q);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
