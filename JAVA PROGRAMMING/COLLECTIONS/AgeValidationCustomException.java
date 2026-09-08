package collections;

import java.util.Scanner;

public class AgeValidationCustomException {

    static void validateAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above for event registration.");
        }

        System.out.println("Age is valid. Registration successful.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            validateAge(age);
        }
        catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
