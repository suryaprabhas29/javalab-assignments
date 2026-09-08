package collections;

import java.util.ArrayList;
import java.util.Scanner;
public class BookManagementArrayList {
	public static void main(String[] args) {
		
		ArrayList<Book> al=new ArrayList<>();
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
				System.out.println("book id :");
				int bookid=sc.nextInt();
				sc.nextLine();
				System.out.println("title :");
				String title=sc.nextLine();
				System.out.println("author :");
				String author=sc.nextLine();
				System.out.println("price :");
				double price=sc.nextDouble();
				
				Book b=new Book(bookid,title,author,price);
				al.add(b);
				break;
			}
			case 2:{
				for(Book obj:al) {
					System.out.println(obj.bookid+" "+obj.title+" "+obj.author+" "+obj.price);
					
				}break;
			}
			case 3:{
				System.out.println("Enter id for search :");
				int id=sc.nextInt();
				for(Book obj:al) {
					if(obj.bookid==id) {
						System.out.println(obj.title+" "+obj.author+" "+obj.price);
					}
				}break;
			}
			case 4:{
				System.out.println("Enter bookid for update :");
				int id=sc.nextInt();
				for(Book obj:al) {
					if(obj.bookid==id) {
						obj.price=obj.price+100;
						System.out.println(obj.bookid+" "+obj.title+" "+obj.author+" "+obj.price);
					}
				}break;
			}
			case 5:{
				System.out.println("Enter id for delete book :");
				int id=sc.nextInt();
				for(int i=0;i<al.size();i++) {
					if(al.get(i).bookid==id) {
						al.remove(i);
						break;
					}
				}break;
			}
			case 6:{
				System.out.println("Exited from the program");
				System.out.println("-------------------------------------");
				System.exit(0);
				break;
			}
			default:{
				System.out.println("Enter Correct Choice");
			}
			}
		}
		
	}
}
