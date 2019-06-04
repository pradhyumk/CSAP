package Ch6Library;

public class Patron {
	
	private String patronName;
	private Book Book1;
	private Book Book2; 
	private Book Book3;	
	
	public Patron (String name) {
		patronName = name;
	}
	
	
	public boolean canBorrow() {
		
		if ((Book1.equals(null)) || (Book1.equals(null)) || (Book1.equals(null))) {
			return true;
		}
		
		else
			return false;
		
	}
	
	public boolean returnBook(Book b) {
		if (b == Book1) {
			System.out.println("Thank you for returning " + Book1.getTitle() + " by " + Book1.getAuthor());
			Book1 = null;
			return true;
		}
		else if (b == Book2) {
			System.out.println("Thank you for returning " + Book2.getTitle() + " by " + Book2.getAuthor());
			Book2 = null;
			return true;
		}
		else if (b == Book3) {
			System.out.println("Thank you for returning " + Book3.getTitle() + " by " + Book3.getAuthor());
			Book3 = null;
			return true;
		}
		else
			System.out.println("Oh dear! You didn't borrow that book!");
			return false;
	}
	
	public boolean borrowBook (Book b) {
		
		if (Book1 == null) {
			Book1 = b;
			System.out.println("You have borrowed " + Book1.getTitle() + " by " + Book1.getAuthor());
			return true;
		}
		else if (Book2 == null) {
			Book2 = b;
			System.out.println("You have borrowed " + Book2.getTitle() + " by " + Book2.getAuthor());
			return true;
		}
		else if (Book3 == null) {
			Book3 = b;
			System.out.println("You have borrowed " + Book3.getTitle() + " by " + Book3.getAuthor());
			return true;
		}
		else
			return false; 
	}
	
	public boolean hasBook(Book b) {
		
		if (b == Book1) {
			System.out.println(patronName + " has " + Book1.getTitle() + " by " + Book1.getAuthor());
			return true;
		}
		else if (b == Book2) {
			System.out.println(patronName + " has " + Book2.getTitle() + " by " + Book2.getAuthor());
			return true;
		}
		else if (b == Book3) {
			System.out.println(patronName + " has " + Book3.getTitle() + " by " + Book3.getAuthor());
			return true;
		}
		else
			return false;	
	}
	
	public String toString() {
		
		String ret = "John P Stevens High School Library\nName: "+patronName+"\nBooks checked out: \n\t";
		
		if (Book1 != null)
			ret += (Book1.getTitle() + " by " + Book1.getAuthor()) +"\n\t";
		if (Book2 != null)
			ret += (Book2.getTitle() + " by " + Book2.getAuthor()) +"\n\t";
		if (Book3 != null)
			ret += (Book3.getTitle() + " by " + Book3.getAuthor()) +"\n\t";
		
		return ret;
		
	}
	
	
	
}
