package inheritance;

class BankAccount{
	int accountNo;
	String customerName;
	float balance;
	static String bankName="SBI"; 
	BankAccount(int accountNo,String customerName,float balance){
		this.accountNo=accountNo;
		this.customerName=customerName;
		this.balance=balance;
	}
	void displayBankAccount() {
		System.out.println("Account No : "+accountNo);
		System.out.println("Customer Name : "+customerName);
		System.out.println("Balance : "+balance);
	}
}

class SavingsAccount extends BankAccount{
	float interestRate;
	
	SavingsAccount(int accountNo, String customerName, float balance, float interestRate) {
		super(accountNo, customerName, balance);
		this.interestRate = interestRate;
	}
	
	void displaySavingsAccount() {
		super.displayBankAccount();
		System.out.println("Interest Rate : "+interestRate);
		calculateInterest();
	}

	void calculateInterest() {
		float interest;
		interest=balance*interestRate;
		System.out.println("Interest Amount : "+interest);
	}
}

class CurrentAccount extends BankAccount{
	float minBalance;
	
	CurrentAccount(int accountNo, String customerName, float balance, float minBalance) {
		super(accountNo, customerName, balance);
		this.minBalance = minBalance;
	}
	
	void displayCurrentAccount() {
		super.displayBankAccount();
		System.out.println("Minimum Balance : "+minBalance);
		checkMinBalance();
	}

	void checkMinBalance() {
		if(balance<=1000) {
			System.out.println("Account has Low Balance");
		}else {
			System.out.println("Account has Minimum Balance");
		}
	}
}
public class BankHierarchicalInheritance {

	public static void main(String[] args) {
		SavingsAccount sa1=new SavingsAccount(1001,"Surya",25000.25f,0.05f);
		SavingsAccount sa2=new SavingsAccount(1002,"Harsha",75000,0.15f);
		
		CurrentAccount ca1=new CurrentAccount(1001,"Surya",500.25f,1000.0f);
		CurrentAccount ca2=new CurrentAccount(1002,"Harsha",75000,1000.0f);

		sa1.displaySavingsAccount();
		sa2.displaySavingsAccount();
		
		ca1.displayCurrentAccount();
		ca2.displayCurrentAccount();
	}

}






