package Ch6FunnyFraction;

public class funnyFraction_Tester {
	public static void main(String[] args) {
	
	funnyFraction f1 = new funnyFraction(3,4);
	funnyFraction f2 = new funnyFraction(5,6);

	System.out.println (f1.funnyAdd(f2));
	System.out.println (f1.funnySubtract(f2));
	System.out.println (f1.funnyMult(f2));
	System.out.println (f1.funnyDivide(f2));
	
	
	}
}
