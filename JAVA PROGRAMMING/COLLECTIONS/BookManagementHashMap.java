package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookManagementHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer,Book> hm=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("1.add books");
			System.out.println("2.display all books");
			System.out.println("3.search book by id");
			System.out.println("4.update book");
			System.out.println("5.delete book");
			System.out.println("6.exit");
			
			System.out.println("Enter your choice :");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("book Id :");
				int bookid=sc.nextInt();
				sc.nextLine();
				System.out.println("title :");
				String title=sc.nextLine();
				System.out.println("author :");
				String author=sc.nextLine();
				System.out.println("price :");
				double price=sc.nextDouble();
				
				Book b=new Book(bookid,title,author,price);
				hm.put(bookid, b);
				break;
			}
			case 2:{
				for(Map.Entry<Integer,Book> obj:hm.entrySet()) {
					Book b=obj.getValue();
					System.out.println("Book Id : "+b.bookid);
					System.out.println("Title : "+b.title);
					System.out.println("Author : "+b.author);
					System.out.println("Price : "+b.price);
				}
				break;
			}
			case 3:{
				System.out.println("Enter bookid to search :");
				int id=sc.nextInt();
				Book b=hm.get(id);
				if(b!=null) {
					System.out.println(b.bookid+" "+b.title+" "+b.author+" "+b.price);
				}else {
					System.out.println("Book not found");
				}
				break;
			}
			case 4:{
				System.out.println("Enter book id for update :");
				int id=sc.nextInt();
				Book b=hm.get(id);
				if(b!=null) {
					b.price=b.price+200;
					System.out.println(b.bookid+" "+b.title+" "+b.author+" "+b.price);
				}else {
					System.out.println("Book not Found");
				}
				break;
			}
			case 5:{
				System.out.println("Enter bookid to delete :");
				int id=sc.nextInt();
				Book b=hm.get(id);
				if(b!=null) {
					hm.remove(id);
					System.out.println("Book with Id "+id+" deleted successfully");
				}else {
					System.out.println("Book not found");
				}
				break;
			}
			case 6:{
				System.out.println("Exited from the program");
				System.out.println("--------------------------------");
				System.exit(0);
				break;
			}
			default:{
				System.out.println("Enter correct choice :");
			}
			}
		}

	}

}
