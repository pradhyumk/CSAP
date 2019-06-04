

public class recursiveProblems {

	int number;

	public recursiveProblems() {

	}

	public int problem1(int n) {

		if (n > 1) {

			return problem1(n - 1) + n;
		}

		else if (n == 1) {

			return n - 2;

		}

		return 0;

	}

	public int problem2(int n) {

		if (n > 1) {
			return problem2(problem2(n - 2)) + 1;
		} else if (n == 1) {
			return 2;
		} else if (n == 0)
			return 1;
		else
			return 0;
	}

	public int problem3(int n) {

		if (n < 0) {
			return 2 * problem3(n + 2) + problem3(n + 1) + 1;
		} else if (n == 0) {
			return 1;
		} else
			return 0;

	}

}
