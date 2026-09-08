package oops.com;

public class BankAccount {
	long accountNo;
	String customerName;
	float balance;
	
	BankAccount(long accNo,String custName,float bal){
		accountNo=accNo;
		customerName=custName;
		balance=bal;
	}
	
	void display() {
		System.out.println("Account No : "+accountNo);
		System.out.println("Customer Name :"+customerName);
		
	}
	
	void checkBalance() {
		System.out.println("Balance :"+balance);
	}
	
	void calculateInterest() {
		double interest;
		if(balance>=100000) {
			interest=balance*0.07f;
		}else if(balance>=50000) {
			interest=balance*0.06f;
		}else {
			interest=balance*0.05f;
		}
		System.out.println("Interest : "+interest);
	}
}
