package Ch6Library;

public class Library {

	public static void main(String[] args) {
		
	Patron p1 = new Patron ("Jim");
	Book b1 = new Book("The Lightning Thief", "Rick Riordan");
	Book b2 = new Book("The Heroes of Olympus", "Rick Riordan");
	Book b3 = new Book("Harry Potter and the Goblet of Fire", "JK Rowling");
	Book b4 = new Book("The Deathly Hallows", "JK Rowling");
	
	System.out.println(p1.borrowBook(b1)); //Should return true
	System.out.println(p1.borrowBook(b2)); //Should return true
	System.out.println(p1.borrowBook(b3)); //Should return true
	System.out.println(p1.borrowBook(b4)); //Should return false
	
	System.out.println();
	
	System.out.println(p1.returnBook(b2)); //Should print msg and return true
	
	System.out.println();
	
	System.out.println(p1); //Calls the toString method
	
	System.out.println();
	
	System.out.println(p1.hasBook(b1)); //Should return true and msg
	System.out.println(p1.hasBook(b4)); //Should return false
	
	System.out.println();
	
	System.out.println(p1.returnBook(b4)); //Should return false and msg
	
	System.out.println();
	
	System.out.println(p1.borrowBook(b4)); //Should return true and msg
	
	System.out.println();
	
	System.out.println(p1.canBorrow()); //Should return false
	
	System.out.println();
		
	}

}

/*

You have borrowed The Lightning Thief by Rick Riordan
true
You have borrowed The Heroes of Olympus by Rick Riordan
true
You have borrowed Harry Potter and the Goblet of Fire by JK Rowling
true
false

Thank you for returning The Heroes of Olympus by Rick Riordan
true

John P Stevens High School Library
Name: Jim
Books checked out: 
	The Lightning Thief by Rick Riordan
	Harry Potter and the Goblet of Fire by JK Rowling
	

Jim has The Lightning Thief by Rick Riordan
true
false

Oh dear! You didn't borrow that book!
false

You have borrowed The Deathly Hallows by JK Rowling
true

false

*/
