package oops.com;


public class FoodOrder {
	void calculateBill(double foodPrice) {
		System.out.println("Food Price : "+foodPrice);
	}
	
	void calculateBill(double foodPrice,int quantity) {
		double totalBill;
		totalBill=foodPrice*quantity;
		
		System.out.println("Food Price : "+foodPrice);
		System.out.println("Quantity : "+quantity);
		System.out.println("Total Bill : "+totalBill);
	}
	
	void calculateBill(double foodPrice,int quantity,double deliveryCharge) {
		double totalBill;
		totalBill=(foodPrice*quantity)+deliveryCharge;
		
		System.out.println("Food Price : "+foodPrice);
		System.out.println("Quantity : "+quantity);
		System.out.println("Delivery Charge : "+deliveryCharge);
		System.out.println("Total Bill : "+totalBill);
	}
	
	
	
	
	public static void main(String[] args) {
		FoodOrder f=new FoodOrder();
		
		f.calculateBill(200);
		f.calculateBill(150,2);
		f.calculateBill(260, 1, 50);
		
	}
}

