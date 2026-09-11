package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class BookWriteObjectArrayList {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("Book.csv");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter no.of books : ");
		int num=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<num;i++) {
			System.out.println("Enter Book"+(i+1)+" Details :");
			System.out.print("Book Id :");
			int bookId=sc.nextInt();
			sc.nextLine();
			System.out.print("Title :");
			String title=sc.nextLine();
			System.out.print("Author :");
			String author=sc.nextLine();
			System.out.print("Price :");
			float price=sc.nextFloat();
			
			Book b=new Book(bookId,title,author,price);
			oos.writeObject(b);
			
		}
		
		sc.close();	
		oos.close();
		fos.close();
		
	
	}

}
