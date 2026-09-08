package oops.com;

public class ProductDemo {

	public static void main(String[] args) {
		Product p1=new Product(101,"Laptop",45000,1);
		p1.display();
		p1.calculateBill();
		
		Product p2=new Product(102,"Mobile",28000,2);
		p2.display();
		p2.calculateBill();
		
		Product p3=new Product(103,"TV",8000,1);
		p3.display();
		p3.calculateBill();
	}

}
