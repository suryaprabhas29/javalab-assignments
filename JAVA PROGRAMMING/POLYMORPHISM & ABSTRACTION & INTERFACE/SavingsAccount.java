package asspoly.com;

public class SavingsAccount extends BankAccount{
	
	public SavingsAccount(long accNo, String custName, float balance) {
		super(accNo, custName, balance);
	}

	void calculateWithdrawalLimit() {
		double withdrawalLimit=balance*0.2;
		System.out.println("Withdrawal Limit : "+withdrawalLimit);
	}
	
}
