package filehandling;

import java.io.Serializable;

public class Book implements Serializable{
	int bookId;
	String title;
	String author;
	float price;
	
	public Book(int bookId, String title, String author, float price) {
		
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
}
