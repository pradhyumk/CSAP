public class MagicSquare {
	int[][] array;

	public MagicSquare(int[][] arr) {
		array = arr;
	}

	public boolean isMagic() {
		if (valuesCheck()) {
			for (int k = 0; k < array.length && k < array[0].length; k++) {
				if ((rowSum(k) != colSum(k)) || (rowSum(k) != diag1() || rowSum(k) != diag2())) {
					return false;
				}
			}

			return true;
		}

		return false;
	}

	public boolean isA4x4Durer() {
		boolean cornSum, centreSum, tbcc, lrcc, cw, is4by4 = array.length == 4 && array[0].length == 4;

		if (isMagic() && is4by4) {

			for (int k = 0; k < array.length && k < array[0].length; k++) {

				if (cornerSum() == rowSum(k)) {
					cornSum = true;
				} else
					cornSum = false;
				if (centerSum() == rowSum(k)) {
					centreSum = true;
				} else
					centreSum = false;
				if (topBottomCenterColSum() == rowSum(k)) {
					tbcc = true;
				} else
					tbcc = false;
				if (leftRightCenterRowSum() == rowSum(k)) {
					lrcc = true;
				} else
					lrcc = false;
				if (clockwiseSum() == rowSum(k)) {
					cw = true;
				} else
					cw = false;
				if (cornSum == false || centreSum == false || tbcc == false || lrcc == false || cw == false) {
					return false;
				} else if ((k == array.length - 1) && (k == array[0].length - 1)) {
					return true;
				}
			}
		}
		return false;

	}

	private int cornerSum() {
		return (array[0][0] + array[0][3] + array[3][3] + array[3][0]);
	}

	private int centerSum() {
		return (array[1][1] + array[1][2] + array[2][1] + array[2][2]);
	}

	private int colSum(int c) {

		int sum = 0;
		for (int r = 0; r < array[0].length; r++)
			sum += array[r][c];

		return sum;
	}

	private int rowSum(int r) {
		int sum = 0;
		for (int c = 0; c < array.length; c++)
			sum += array[r][c];

		return sum;
	}

	private int diag1() {
		int c = 0, sum = 0;

		for (int r = 0; r < array.length; r++) {
			sum += array[r][c];
			c++;
		}

		return sum;
	}

	private int diag2() {
		int c = 0, sum = 0;

		for (int r = array.length - 1; r >= 0; r--) {
			sum += array[r][c];
			c++;
		}

		return sum;
	}

	private boolean valuesCheck() {
		int[] verify = new int[(int) Math.pow(array.length, 2)];

		for (int r = 0; r < array.length; r++) {
			for (int c = 0; c < array[0].length; c++) {
				if (array[r][c] > Math.pow(array.length, 2) || array[r][c] < 1) {
					return false;
				}
				verify[array[r][c] - 1]++;
				if (verify[array[r][c] - 1] > 1) {
					return false;
				}
			}
		}

		return true;
	}

	private int topBottomCenterColSum() {
		return (array[0][1] + array[0][2] + array[3][1] + array[3][2]);
	}

	private int leftRightCenterRowSum() {
		return (array[1][0] + array[1][3] + array[2][0] + array[2][3]);
	}

	private int clockwiseSum() {
		int a = (array[0][1] + array[1][3] + array[3][2] + array[2][0]);
		int b = (array[0][2] + array[2][3] + array[3][1] + array[1][0]);

		if (a == b)
			return a;
		else
			return -1;
	}

	public String toString() {
		String ret = "";

		for (int r = 0; r < array.length; r++) {
			for (int c = 0; c < array[0].length; c++) {
				ret += "\t" + array[r][c];
			}

			ret += "\n";

		}

		return ret;

	}

}