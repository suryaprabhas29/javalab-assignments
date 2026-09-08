package oops.com;

public class ElectricityDemo {

	public static void main(String[] args) {
		ElectricityBill eb1=new ElectricityBill(101,"Harsha",250);
		eb1.display();
		eb1.calculateBill();
		
		ElectricityBill eb2=new ElectricityBill(102,"Vardhan",126);
		eb2.display();
		eb2.calculateBill();
		
		ElectricityBill eb3=new ElectricityBill(103,"Surya",510);
		eb3.display();
		eb3.calculateBill();
		
		ElectricityBill eb4=new ElectricityBill(104,"Prabhas",85);
		eb4.display();
		eb4.calculateBill();
		
		ElectricityBill eb5=new ElectricityBill(105,"Sachin",350);
		eb5.display();
		eb5.calculateBill();
	}

}
