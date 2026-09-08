package collections;

public class Account {

    int accountNumber;
    String accountHolderName;
    double balance;

    Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void withdraw(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }

        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance.");
        }

        balance = balance - amount;

        System.out.println("Withdrawal successful.");
        System.out.println("Amount Withdrawn: " + amount);
        System.out.println("Remaining Balance: " + balance);
    }
}
