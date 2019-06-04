package Ch6FunnyFraction;

public class funnyFraction {
	
	private int numerator, denominator;
	
	public funnyFraction (int n, int d) {
		
		numerator = n;
		denominator = d;
		
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	
	public funnyFraction funnyAdd (funnyFraction f) {
		
		int fn = (numerator + f.getNumerator() + denominator + f.getDenominator());
		int fd = ((numerator + f.getNumerator()) * (denominator + f.getDenominator()));
		
		funnyFraction fnd = new funnyFraction(fn,fd);
		
		return fnd;
	}
	
	public funnyFraction funnySubtract (funnyFraction f) {
		
		int fn = f.getDenominator()-denominator-f.getNumerator()-numerator;
		int fd = (f.getDenominator()-denominator) * (f.getNumerator()-numerator);
		
		funnyFraction fnd = new funnyFraction(fn,fd);
		
		return fnd;
	}
	
	public funnyFraction funnyMult (funnyFraction f) {
		
		int fn = (int)(Math.sqrt(Math.pow((numerator-f.getNumerator()), 2)+denominator));
		int fd = (int) ((Math.pow((denominator-f.getDenominator()), 2))-f.getNumerator());
		
		funnyFraction fnd = new funnyFraction(fn,fd);
		
		return fnd;
	}
	
	public funnyFraction funnyDivide (funnyFraction f) {
		
		int fn =  (numerator * f.getDenominator());
		int fd = (denominator * f. getNumerator());
		
		funnyFraction fnd = new funnyFraction(fn,fd);
		
		
		return fnd;
	}
	
	
	public String toString() {
		
		String ret = numerator +"/" + denominator;
		return ret;
	
	}

}

//Output

/*
18/80
-6/4
2/-1
18/20
*/

