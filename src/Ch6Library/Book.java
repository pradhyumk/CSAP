package Ch6Library;

public class Book {
	 private String bookName;
	 private String authName;
	
	public Book(String bk, String auth) {
		bookName = bk;
		authName = auth;
	}
	public String getAuthor() {
		return authName;
	}
	
	public String getTitle() {	
		return bookName;
	}
	
	public String toString() {
		
		return (bookName + " by " + authName);
		
		
	}
	
}
