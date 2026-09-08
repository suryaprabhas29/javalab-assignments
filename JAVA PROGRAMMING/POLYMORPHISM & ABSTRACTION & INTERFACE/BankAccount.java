package asspoly.com;

public abstract class BankAccount {
	long accNo;
	String custName;
	double balance;
	public BankAccount(long accNo, String custName, float balance) {
		
		this.accNo = accNo;
		this.custName = custName;
		this.balance = balance;
	}
	public void deposit(double amount){
		balance=balance+amount;
		System.out.println("Deposited Amount : "+amount);
		
	}
	
	public void displayBankAccountDetails() {
		System.out.println("Account No : "+accNo);
		System.out.println("Customer Name : "+custName);
		System.out.println("Balance : "+balance);
		
	}
	
	abstract void calculateWithdrawalLimit();
	
}
