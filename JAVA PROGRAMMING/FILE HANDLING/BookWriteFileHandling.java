package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class BookWriteFileHandling {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("Book.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Book Id : ");
		int bookId=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Title : ");
		String title=sc.nextLine();
		
		System.out.println("Author :");
		String author=sc.nextLine();
		
		System.out.println("Price :");
		Float price=sc.nextFloat();
		
		Book b=new Book(bookId,title,author,price);
		
		oos.writeObject(b);
		fos.close();
		oos.close();
		System.out.println("\nBook Object written to the file Successfully");
		sc.close();
	}

}
