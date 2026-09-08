package inheritance;

public class Library {
	String libraryName;
	String location;
	Book b;
	public Library(String libraryName, String location, Book b) {
		
		this.libraryName = libraryName;
		this.location = location;
		this.b = b;
	}
	void displayLibrary() {
		System.out.println("Library Name : "+libraryName);
		System.out.println("Location : "+location);
		b.displayBook();
	}
	
	
}
