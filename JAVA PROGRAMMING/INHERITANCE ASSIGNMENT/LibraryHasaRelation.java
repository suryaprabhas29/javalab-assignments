package inheritance;


public class LibraryHasaRelation {

	public static void main(String[] args) {
		
		Book b1=new Book(001,"Atomic Habits","James",599.0f);
		Library l1=new Library("Harsha Library", "E-City",b1);
		l1.displayLibrary();
		
		Book b2=new Book(002,"Panchatantra","Vishnu Sharma",999.0f);
		Library l2=new Library("Harsha Library", "E-City",b2);
		l2.displayLibrary();
		
		Book b3=new Book(003,"Winga of Fire","Abdul Kalam",799.0f);
		Library l3=new Library("Harsha Library", "E-City",b3);
		l3.displayLibrary();
	}
	

}
