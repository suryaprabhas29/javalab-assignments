package collections;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class HospitalPatientQueue {
    public static void main(String[] args) {

        Queue<String> patients = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Hospital Patient Management ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Treat Patient");
            System.out.println("3. View Next Patient");
            System.out.println("4. Display Waiting Patients");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

            case 1:
                System.out.print("Enter patient name: ");
                String name = sc.nextLine();

                patients.offer(name);

                System.out.println("Patient added.");
                break;

            case 2:
                if (!patients.isEmpty()) {
                    System.out.println("Treated Patient: " + patients.poll());
                } else {
                    System.out.println("No patients waiting.");
                }
                break;

            case 3:
                if (!patients.isEmpty()) {
                    System.out.println("Next Patient: " + patients.peek());
                } else {
                    System.out.println("No patients waiting.");
                }
                break;

            case 4:
                if (!patients.isEmpty()) {
                    System.out.println("Waiting Patients: " + patients);
                } else {
                    System.out.println("No patients waiting.");
                }
                break;

            case 5:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
