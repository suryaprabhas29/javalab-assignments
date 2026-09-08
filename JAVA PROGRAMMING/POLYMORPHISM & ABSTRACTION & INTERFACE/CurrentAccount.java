package asspoly.com;

public class CurrentAccount extends BankAccount {
	double overdraftFacility;
	
	public CurrentAccount(long accNo, String custName, float balance,double overdraftFacility) {
		super(accNo, custName, balance);
		this.overdraftFacility=overdraftFacility;
	}
	
	public void calculateWithdrawalLimit() {
		double withdrawalLimit=balance+overdraftFacility;
		System.out.println("Withdrawal Limit : "+withdrawalLimit);
	}
	
	
	
}
