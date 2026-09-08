package collections;

import java.util.Scanner;

public class BankWithdrawalExceptionHandling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        Account acc = new Account(accountNumber, name, balance);

        System.out.print("Enter Withdrawal Amount: ");
        double amount = sc.nextDouble();

        try {
            acc.withdraw(amount);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Transaction completed.");
        }

        sc.close();
    }
}
