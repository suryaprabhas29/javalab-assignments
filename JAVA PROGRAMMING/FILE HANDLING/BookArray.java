package filehandling;

import java.io.Serializable;

public class BookArray implements Serializable{
	int bookId;
	String title;
	String author;
	float price;
	
	public BookArray(int bookId, String title, String author, float price) {
		
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String toString() {
		return "BookId : "+bookId+", Title : "+title+", Author : "+author+", Price : "+price;
	}
}

