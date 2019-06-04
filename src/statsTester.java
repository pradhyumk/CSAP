
public class statsTester {

	public static void main(String[] args) {

		
		
		
		
		
		
		
		
		
		stats test = new stats();

		System.out.println("Calculate Avg: ");

		System.out.println(test.calcAvg() + "\n");

		System.out.println("Get Max: ");

		System.out.println(test.getMax() + "\n");

		System.out.println("Get Min: ");

		System.out.println(test.getMin() + "\n");

		System.out.println("Calculuate Standard Deviation:");

		System.out.println(test.calcStdDev() + "\n");
		
		System.out.println("Histogram (On the left is the Number and to the right is the frequency:");
		
		test.displayHistogram();

		System.out.println();

		System.out.println(test);

	}

}
