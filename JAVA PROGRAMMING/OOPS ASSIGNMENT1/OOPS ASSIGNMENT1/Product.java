package oops.com;

public class Product {
	int productId;
	String productName;
	double price;
	int quantity;
	
	Product(int pid,String pname,double pri,int quan){
		productId=pid;
		productName=pname;
		price=pri;
		quantity=quan;
	}
	
	void display() {
		System.out.println("Product ID : "+productId);
		System.out.println("Product Name : "+productName);
		System.out.println("Price : "+price);
		System.out.println("Quantity : "+quantity);
	}
	
	void calculateBill() {
		double total;
		double discount;
		double Final;
		total=price*quantity;
		
		if(total>=10000) {
			discount=total*0.1;
		}else {
			discount=total*0;
		}
		System.out.println("Total price : "+total);
		System.out.println("Discount price : "+discount);
		Final =total-discount;
		System.out.println("Final price after Discount : "+Final);
	}
}
