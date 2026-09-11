package filehandling;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookReadObjectArrayList {

	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException {
		ArrayList<Book> al=new ArrayList<>();
		FileInputStream fis=new FileInputStream("Book.csv");
		ObjectInputStream ois=new ObjectInputStream(fis);
//		Adding object into array
		try {
			while(true) {
				Book b=(Book) ois.readObject();
				al.add(b);
			}
		}catch(EOFException e) {
			
		}
		ois.close();
		fis.close();
		
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("\n1.Display all books");
			System.out.println("2.Search book using BookId");
			System.out.println("3.Update price of a book");
			System.out.println("4.Delete book using bookid");
			System.out.println("5.Display books whose price greater than 500");
			System.out.println("6.Find Most expensive book");
			System.out.println("7.Sort books based on price");
			System.out.println("8.Display Book Count");
			System.out.println("9.Calculate average price");
			System.out.println("10.Save updated Data");
			
			System.out.println("\nEnter your choice :");
			choice=sc.nextInt();
			switch(choice) {
				case 1:{
				for(Book ele:al) {
					System.out.println(ele);
				}
				break;
				}
				
				case 2:{
				System.out.print("Enter id to search : ");
				int id=sc.nextInt();
				sc.nextLine();
				for(Book ele:al) {
					if(ele.bookId==id) {
						System.out.println(ele+"\n");
					}
				}
				break;
				}
				
				case 3:{
				for(Book ele:al) {
					if(ele.price<700) {
						ele.price=ele.price+500;
						System.out.println(ele);
					}
				}
				System.out.println("Price Updated\n");
				break;
				}
				
				case 4:{
				System.out.print("Enter id to delete : ");
				int bid=sc.nextInt();
				sc.nextLine();
				boolean deleted=false;
				Iterator<Book> it=al.iterator();
				while(it.hasNext()) {
					Book b=it.next();
					if(b.bookId==bid) {
						it.remove();
						deleted=true;
						System.out.println("Book Deleted");
						break;
					}
				}
				if(!deleted) {
					System.out.println("Book not found");
				}
				break;
				}
				
				case 5:{
					for(Book ele:al) {
						if(ele.price>500) {
							System.out.println(ele.bookId+" "+ele.title+" "+ele.author+" "+ele.price);
						}
					}
					break;
				}
				
				case 6:{
					float pr=0;
					String title="";
					for(Book ele:al) {
						if(ele.price>pr) {
							pr=ele.price;
							title=ele.title;
						}	
					}
					System.out.println("Most Expensive Book is : "+title);
					break;
				}
				
				case 7:{
					al.sort(Comparator.comparing(b->b.price));
					for(Book ele:al) {
						System.out.println(ele.title+" - "+ele.price);
					}
					break;
				}
				
				case 8:{
					System.out.println("Total no.o Books : "+al.size());
					break;
				}
				
				case 9:{
					float total=0;
					for(Book ele:al) {
						total+=ele.price;
					}
					float avgprice=total/al.size();
					System.out.println("Average price of books : "+avgprice);
					break;
				}
				
				case 10:{
					FileOutputStream fos=new FileOutputStream("Book.csv");
					ObjectOutputStream oos=new ObjectOutputStream(fos);
					for(Book ele:al) {
						oos.writeObject(ele);
					}
					oos.close();
					fos.close();
					System.out.println("Updated data saved");
					break;
				}
				
				case 11:{
					System.out.println("Exiting from the program.......");
					break;
				}
				
				default:{
					System.out.println("Enter your correct choice : ");
				}
				
			}
		
		}while(choice !=11);
		
		sc.close();
	}

}
