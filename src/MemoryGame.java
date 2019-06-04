import java.util.Scanner;

public class MemoryGame {

	public static void main(String[] args) {
		createDeck();
		playGame();
	}

	public static Card[] createDeck() {
		Card[] myDeckOfCards = { new Card("A", "Spades"), new Card("2", "Spades"), new Card("3", "Spades"),
				new Card("4", "Spades"), new Card("5", "Spades"), new Card("6", "Spades"), new Card("7", "Spades"),
				new Card("8", "Spades"), new Card("9", "Spades"), new Card("10", "Spades"), new Card("J", "Spades"),
				new Card("K", "Spades"), new Card("Q", "Spades"),

				new Card("A", "Clubs"), new Card("2", "Clubs"), new Card("3", "Clubs"), new Card("4", "Clubs"),
				new Card("5", "Clubs"), new Card("6", "Clubs"), new Card("7", "Clubs"), new Card("8", "Clubs"),
				new Card("9", "Clubs"), new Card("10", "Clubs"), new Card("J", "Clubs"), new Card("K", "Clubs"),
				new Card("Q", "Clubs"),

				new Card("A", "Diamonds"), new Card("2", "Diamonds"), new Card("3", "Diamonds"),
				new Card("4", "Diamonds"), new Card("5", "Diamonds"), new Card("6", "Diamonds"),
				new Card("7", "Diamonds"), new Card("8", "Diamonds"), new Card("9", "Diamonds"),
				new Card("10", "Diamonds"), new Card("J", "Diamonds"), new Card("K", "Diamonds"),
				new Card("Q", "Diamonds"),

				new Card("A", "Hearts"), new Card("2", "Hearts"), new Card("3", "Hearts"), new Card("4", "Hearts"),
				new Card("5", "Hearts"), new Card("6", "Hearts"), new Card("7", "Hearts"), new Card("8", "Hearts"),
				new Card("9", "Hearts"), new Card("10", "Hearts"), new Card("J", "Hearts"), new Card("K", "Hearts"),
				new Card("Q", "Hearts") };

		return myDeckOfCards;
	}

	public static void shuffle(Card[] deck) {
		Card tmp;
		int rand, j;
		for (int i = deck.length - 1; i > 0; i--) {
			j = i - 1;
			rand = (int) (Math.random() * j) + 1;
			tmp = deck[j];
			deck[j] = deck[rand];
			deck[rand] = tmp;

		}

	}

	public static void playGame() {
		int counter = 0, lc = 0, turner = 0;
		boolean loop = true;
		Card[] set = createDeck();
		shuffle(set);
		int row1, row2, col1, col2;
		Scanner sc = new Scanner(System.in);

		Card[][] deck2d = new Card[4][13];

		for (int r = 0; r < deck2d.length; r++) {
			for (int c = 0; c < deck2d[0].length; c++) {
				deck2d[r][c] = set[counter];
				counter++;
			}
		}

		System.out.println(
				"Let's play a Memory Game! There are 52 cards laid out. Pick two cards and see if they match \n");

		System.out.println("Answer Key: \n");
		for (int r1 = 0; r1 < deck2d.length; r1++) {
			for (int c1 = 0; c1 < deck2d[0].length; c1++) {
				System.out.print("\t" + deck2d[r1][c1].face);
			}

			System.out.println();

		}
		System.out.println("\nHere are the cards: \n");

		display(deck2d);
		System.out.println();
		while (lc != 52) {

			System.out.println("Please enter the row # of the first card and strike [ENTER]");
			row1 = sc.nextInt() - 1;
			System.out.println("Please enter the column # of the first card and strike [ENTER]");
			col1 = sc.nextInt() - 1;
			System.out.println("Please enter the row # of the second card and strike [ENTER]");
			row2 = sc.nextInt() - 1;
			System.out.println("Please enter the column # of the second card and strike [ENTER]");
			col2 = sc.nextInt() - 1;

			if (((row1 != row2) && (col1 != col2)) & (validateInput(row1, col1, deck2d) == true)
					&& (validateInput(row2, col2, deck2d) == true)) {

				if ((deck2d[row1][col1].getFace()) == (deck2d[row2][col2].getFace())) {
					deck2d[row1][col1] = null;
					deck2d[row2][col2] = null;
					System.out.println("Nice Job! That was a match!");

					turner++;
					display(deck2d);
				} else {
					System.out.println("Oopsie! That was not a match!");
					display(deck2d);
					turner++;
				}

			}
			
			System.out.println("G a m e    O v e r    ! You completed the game in "+ turner + " chances!");
			

			for (int r = 0; r < deck2d.length; r++) {
				for (int c = 0; c < deck2d[0].length; c++) {
					if (deck2d[r][c] == null)
						lc++;
				}

			}
		}

	}

	public static boolean validateInput(int r, int c, Card[][] grid) {

		if ((r >= 0) && (c >= 0) && (r < grid.length) && (c < grid[0].length) && (grid[r][c] != null))
			return true;
		else {
			System.out.println("You have entered an invalid input");
			return false;
		}

	}

	public static void display(Card[][] grid) {

		String[][] dis = new String[4][13];

		for (int r = 0; r < dis.length; r++) {
			for (int c = 0; c < dis[0].length; c++) {
				if (grid[r][c] == null)
					dis[r][c] = "X";
				else
					dis[r][c] = "O";

			}

		}

		for (int r = 0; r < dis.length; r++) {
			for (int c = 0; c < dis[0].length; c++) {
				System.out.print("\t" + dis[r][c]);
			}

			System.out.println();

		}

	}

}



/*
Let's play a Memory Game! There are 52 cards laid out. Pick two cards and see if they match 

Answer Key: 

	6	A	3	K	2	5	3	A	Q	J	K	5	5
	2	8	10	Q	7	K	6	2	J	8	9	8	4
	10	7	3	10	9	4	10	7	4	Q	3	2	9
	6	5	6	A	4	9	J	J	8	7	K	A	Q

Here are the cards: 

	O	O	O	O	O	O	O	O	O	O	O	O	O
	O	O	O	O	O	O	O	O	O	O	O	O	O
	O	O	O	O	O	O	O	O	O	O	O	O	O
	O	O	O	O	O	O	O	O	O	O	O	O	O

Please enter the row # of the first card and strike [ENTER]
1
Please enter the column # of the first card and strike [ENTER]
2
Please enter the row # of the second card and strike [ENTER]
4
Please enter the column # of the second card and strike [ENTER]
4
Nice Job! That was a match!
	O	X	O	O	O	O	O	O	O	O	O	O	O
	O	O	O	O	O	O	O	O	O	O	O	O	O
	O	O	O	O	O	O	O	O	O	O	O	O	O
	O	O	O	X	O	O	O	O	O	O	O	O	O
Please enter the row # of the first card and strike [ENTER]
1
Please enter the column # of the first card and strike [ENTER]
2
Please enter the row # of the second card and strike [ENTER]
4
Please enter the column # of the second card and strike [ENTER]
5
You have entered an invalid input
Please enter the row # of the first card and strike [ENTER]
1
Please enter the column # of the first card and strike [ENTER]
5
Please enter the row # of the second card and strike [ENTER]
2
Please enter the column # of the second card and strike [ENTER]
13
Oopsie! That was not a match!
	O	X	O	O	O	O	O	O	O	O	O	O	O
	O	O	O	O	O	O	O	O	O	O	O	O	O
	O	O	O	O	O	O	O	O	O	O	O	O	O
	O	O	O	X	O	O	O	O	O	O	O	O	O
Please enter the row # of the first card and strike [ENTER]

 */

