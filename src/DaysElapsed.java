import java.util.*;

public class DaysElapsed {

	public static void main(String[] args) {

		System.out.println("This program calculates the number of days elapsed between two dates within the same year\n\n");
		
		int[] daysInMonth = { 29, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		Scanner input = new Scanner(System.in);

		int iday, imo, iyear, emo, eday;
		iday = imo = iyear = emo = eday = 0;
		int elapsed = 0;
		
		boolean error = true;
		
		while (error == true) {
		
		
		
		System.out.print("Enter\n  year: ");
		iyear = input.nextInt();
		
		if ((iyear%4)==0 && (iyear%100)!=0 || (iyear%400)==0 && (iyear%100)!=0) {
			iyear = 0;			// if statement makes iyear zero if year is a leap yr
		}
		
		
		System.out.print("  start month: ");
		imo = input.nextInt();
		System.out.print("  start day: ");
		
		iday = input.nextInt();
		while (iday >= daysInMonth[imo]) {
			System.out.print("  Invalid Date! Enter a new date: ");
			iday = input.nextInt();
		}
		
		System.out.print("  end month: ");
		emo = input.nextInt();
		System.out.print("  end day: ");
		
		eday = input.nextInt();
		while (eday >= daysInMonth[emo]) {
			System.out.print("  Invalid Date! Enter a new date: ");
			iday = input.nextInt();
		}
		
		
		
		if ((emo-imo) == 0) {				// if difference in months == 0 
			elapsed = (eday-iday)+1;
			System.out.print("Elapsed days:  " + elapsed);
			error = false;
		}
		
		else if ((emo-imo) == 1) {			// if difference in months == 1 
			
			elapsed = (((daysInMonth[imo]-iday)+1)+eday);
			
			System.out.println("Elapsed days:  " + elapsed);
			error = false;
		}
		
		else if ((emo-imo) >= 2) {
			elapsed = ((daysInMonth[imo]-iday)+1);
			
			for (int k = imo+1; k <= emo-1; k++) {
				
				elapsed += daysInMonth[k];
			
			}
			
			elapsed += eday;
			
			System.out.println("Elapsed days:  " + elapsed);
			
			error = false;
		}
		
		else {
						
			error = true;
			
			System.out.println("Elapsed days:  error\n\nPlease enter the following again!\n");

		
		
		}
		
		}

	}

}

//Output

/*
This program calculates the number of days elapsed between two dates within the same year


Enter
  year: 2016
  start month: 3
  start day: 3
  end month: 5
  end day: 25
Elapsed days:  84

*/
