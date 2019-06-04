import java.util.*;

public class MyFirstTestProgram {

	public static void main(String[] args) {
		Scanner type = new Scanner (System.in);	
		
		char again = 'y';
		
		while (again == 'y') {
		
			System.out.println("Enter your first initial");
			char firstInit = type.next().charAt(0);
		
			System.out.println("Enter your last initial");
			char lastInit = type.next().charAt(0);
		
			System.out.println("Enter month of birthday");
			int month = type.nextInt();
		
			System.out.println("Enter date of birthday");
			int day = type.nextInt();
		
		}
		
		
	}

}
