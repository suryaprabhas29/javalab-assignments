package collections;

import java.util.LinkedList;
import java.util.Scanner;

public class TrainPassengerLinkedList {
	
    public static void main(String[] args) {

        LinkedList<String> passengers = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Train Passenger Management ---");
            System.out.println("1. Add Passenger at Beginning");
            System.out.println("2. Add Passenger at End");
            System.out.println("3. Remove First Passenger");
            System.out.println("4. Remove Last Passenger");
            System.out.println("5. Search Passenger");
            System.out.println("6. Display Passengers");
            System.out.println("7. Exit");
            
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

            case 1:
                System.out.print("Enter passenger name: ");
                String name1 = sc.nextLine();

                passengers.addFirst(name1);

                System.out.println("Passenger added at beginning.");
                break;

            case 2:
                System.out.print("Enter passenger name: ");
                String name2 = sc.nextLine();

                passengers.addLast(name2);

                System.out.println("Passenger added at end.");
                break;

            case 3:
                if (!passengers.isEmpty()) {
                    System.out.println("Removed: " + passengers.removeFirst());
                } else {
                    System.out.println("No passengers.");
                }
                break;

            case 4:
                if (!passengers.isEmpty()) {
                    System.out.println("Removed: " + passengers.removeLast());
                } else {
                    System.out.println("No passengers.");
                }
                break;

            case 5:
                System.out.print("Enter passenger name to search: ");
                String search = sc.nextLine();

                if (passengers.contains(search)) {
                    System.out.println("Passenger found.");
                } else {
                    System.out.println("Passenger not found.");
                }
                break;

            case 6:
                if (!passengers.isEmpty()) {
                    System.out.println("Passengers: " + passengers);
                } else {
                    System.out.println("No passengers.");
                }
                break;

            case 7:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice.");
            }

        } while (choice != 7);

        sc.close();
    }
}
	


