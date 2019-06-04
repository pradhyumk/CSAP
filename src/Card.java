public class Card {
	String suite, face;

	public Card(String f, String s) {
		suite = s;
		face = f;
	}

	public String getSuit() {

		return suite;
	}

	public String getFace() {

		return face;
	}

	public String toString() {
		return suite + " " + face;
	}
}
