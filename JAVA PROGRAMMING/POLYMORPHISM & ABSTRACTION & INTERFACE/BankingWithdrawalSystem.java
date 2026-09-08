package asspoly.com;

public class BankingWithdrawalSystem {

	public static void main(String[] args) {
		
		System.out.println("-----Savings Account Details-----");
		SavingsAccount s=new SavingsAccount(12345678,"Harsha",90000);
		s.deposit(8000);
		s.displayBankAccountDetails();
		s.calculateWithdrawalLimit();
		
		System.out.println("-----Current Account Details-----");
		CurrentAccount c=new CurrentAccount(95029866,"Vardhan",50000,10000);
		c.deposit(8000);
		c.displayBankAccountDetails();
		c.calculateWithdrawalLimit();

	}

}
