public class BlendMaker extends ConsonantBlends {

	String blend;

	public BlendMaker(char a, char b) {
		blend = "" + a + b;
	}

	public void getNextBlend() {
		boolean test = false;
		for (int k = 0; k < theBlends.length - 1; k++) {
			if (blend.compareTo(theBlends[k]) == 0) {
				blend = theBlends[k + 1];
				test = true;
				break;
			}
		}

		if (theBlends[theBlends.length - 1].equals(blend) == true) {
			blend = null;
		}

		if (test == false)
			blend = null;

	}

	public String toString() {

		return blend;

	}

}