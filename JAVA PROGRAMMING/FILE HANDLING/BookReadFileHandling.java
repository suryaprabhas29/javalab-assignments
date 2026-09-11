package filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class BookReadFileHandling {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("Book.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Book b=(Book) ois.readObject();
		
		System.out.println("Book Details :");
		System.out.println("Book Id : "+b.bookId);
		System.out.println("Title : "+b.title);
		System.out.println("Author : "+b.author);
		System.out.println("Price : "+b.price);
		
		if(b.price>500) {
			Float finalprice=b.price-(b.price*0.1f);
			System.out.println("Final Price : "+finalprice);
		}
		
	}

}
