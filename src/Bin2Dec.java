//Pradhyum Krishnan 2018
//Output Format Credits: Mrs. Florene Quan



import java.util.*;

public class Bin2Dec {

	public static void main(String[] args) {

		int question = 1;

		int prompt = 0;

		while (question == 1) {

			String binary = new String();
			binary = "";
			String bindec = new String();

			Scanner input = new Scanner(System.in);
			System.out.println("Binary to Decimal Converter \n1. Binary to Decimal\n2. Decimal to Binary\nEnter 1 or 2");

			prompt = input.nextInt();

			if (prompt == 1) {

				System.out.println("You chose Binary to Decimal\nEnter your binary number");
				bindec = input.next();

				System.out.println(bindec + " binary  =  " + (Integer.parseInt(bindec, 2)) + " decimal");

			}

			else {
				System.out.println("You chose Decimal to Binary\nEnter your decimal number");
				int rem = 0;
				int decimal, dec = 0;
				decimal = dec = input.nextInt();

				while (decimal > 0) {
					rem = decimal % 2;
					decimal = (decimal / 2);
					binary = rem + "" + binary + "";

				}
				System.out.println(dec + " decimal  =  " + binary + " binary");
			}

			System.out.println("Do you wish to continue? 1 = yes, 0 = no");

			question = input.nextInt();

		}

		System.out.println("Program terminated");

		/*
		Binary to Decimal Converter 
		1. Binary to Decimal
		2. Decimal to Binary
		Enter 1 or 2
		1
		You chose Binary to Decimal
		Enter your binary number
		01011110
		01011110 binary  =  94 decimal
		Do you wish to continue? 1 = yes, 0 = no
		1
		Binary to Decimal Converter 
		1. Binary to Decimal
		2. Decimal to Binary
		Enter 1 or 2
		2
		You chose Decimal to Binary
		Enter your decimal number
		126
		126 decimal  =  1111110 binary
		Do you wish to continue? 1 = yes, 0 = no
		0
		Program terminated
		*/

	}

}
