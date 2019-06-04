
public class stats {

	private int[] input = new int[1000];

	public stats() {

		for (int k = 0; k < 1000; k++) {

			input[k] = ((int) ((Math.random() * 6) + 1)) + ((int) ((Math.random() * 6) + 1))
					+ ((int) ((Math.random() * 6) + 1));
		}

	}

	public double calcAvg() {

		double sum = 0;

		for (int k = 0; k < input.length; k++) {
			sum += input[k];
		}
		return (sum / (input.length));
	}

	public int getMax() {

		int max = input[0];

		for (int k = 1; k < input.length; k++) {
			if (input[k] > max) {
				max = input[k];
			}
		}
		return max;
	}

	public int getMin() {

		int min = input[0];

		for (int k = 1; k < input.length; k++) {
			if (input[k] < min) {
				min = input[k];
			}
		}
		return min;
	}

	public double calcStdDev() {
		double avg = calcAvg();
		double numerator = 0;

		for (int k = 0; k < input.length; k++) {
			numerator += Math.pow((input[k] - avg), 2);
		}
		return Math.sqrt(numerator / (input.length - 1));
	}

	public void displayHistogram() {

		int[] freq = new int[19];

		for (int k = 1; k <= input.length - 1; k++)
			freq[input[k]]++;

		for (int k = 3; k < 19; k++)
			System.out.println(k + "=" + freq[k]);

		for (int k = 3; k <= freq.length - 1; k++) {

			System.out.print(k + "  |  ");

			for (int y = 0; y < (freq[k] / 5); y++)
				System.out.print("*");

			if ((freq[k] % 5) != 0)
				System.out.print("*");

			System.out.println();
		}

	}

	public String toString() {
		int c = 0;
		String ret = "";
		for (int k = 0; k < 40; k++) {

			for (int y = 0; y < 25; y++) {

				ret += " | " + input[c];

				c++;
			}

			ret += "\n";
		}

		return ret;
	}

}
