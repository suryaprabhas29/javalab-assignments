package oops.com;

public class BankDemo {

	public static void main(String[] args) {
		BankAccount b1=new BankAccount(101,"Harsha",92000);
		b1.display();
		b1.checkBalance();
		b1.calculateInterest();
		
		BankAccount b2=new BankAccount(102,"Vardhan",115000);
		b2.display();
		b2.checkBalance();
		b2.calculateInterest();
		
		BankAccount b3=new BankAccount(103,"Surya",35000);
		b3.display();
		b3.checkBalance();
		b3.calculateInterest();

	}
}
