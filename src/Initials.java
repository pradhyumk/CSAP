import java.io.*;
import java.util.*;


public class Initials {

	public static void main(String[] args) throws FileNotFoundException {

		int num;

		Scanner reader = new Scanner(new File ("/Users/2022231/Google Drive/2018-2019/CSAP/Eclipse/MyPrograms_2k18-2k19/src/Input.txt"));

		PrintWriter writer = new PrintWriter (new File ("/Users/2022231/Google Drive/2018-2019/CSAP/Eclipse/MyPrograms_2k18-2k19/src/Output.txt"));

		System.out.println(reader.hasNext());



		while (reader.hasNext()) {

			num = reader.nextInt();


			if (num > 0) {

				for (int k = 1; k <= num; k++ ) {
					writer.print("*");
				}
			}

			else if (num < 0) {

				for (int k = num; k < 0; k++) {
					writer.print(" ");
				}
			}

			else if (num == 0) {
				writer.println();
			}

		}
		 writer.close();

	}

}
