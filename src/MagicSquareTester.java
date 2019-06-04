
public class MagicSquareTester {

	public static void main(String[] args) {
		int[][] arr1 = { { 1, 15, 14, 4 }, { 12, 6, 7, 9 }, { 8, 10, 11, 5 }, { 13, 3, 2, 16 } };

		int[][] arr2 = { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 12 }, };

		MagicSquare ms = new MagicSquare(arr1); // Durer One
		MagicSquare ms2 = new MagicSquare(arr2); // Non the durer

		if (ms.isMagic())
			System.out.println(ms + "\nis a Magic Square");
		else
			System.out.println(ms + "\nis not a Magic Square");
		System.out.println();

		if (ms2.isMagic())
			System.out.println(ms2 + "\nis a Magic Square");
		else
			System.out.println(ms2 + "\nis not a Magic Square");

	}

}
