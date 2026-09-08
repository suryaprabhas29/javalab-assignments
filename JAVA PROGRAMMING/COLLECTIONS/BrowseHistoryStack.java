package collections;
import java.util.Stack;
import java.util.Scanner;
public class BrowseHistoryStack {

	public static void main(String[] args) {

		Stack<String> history = new Stack<>();
        Scanner sc = new Scanner(System.in);

		int choice;

        do {
            System.out.println("\n--- Browser History ---");
            System.out.println("1. Visit New Page");
            System.out.println("2. Go Back");
            System.out.println("3. View Current Page");
            System.out.println("4. Display History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
            case 1:
                System.out.print("Enter page: ");
                String page = sc.nextLine();

                history.push(page);

                System.out.println("Page visited.");
                break;

            case 2:
                if (!history.isEmpty()) {
                    history.pop();
                    System.out.println("Went back.");
                } else {
                    System.out.println("No history available.");
                }
                break;

            case 3:
                if (!history.isEmpty()) {
                    System.out.println("Current Page: " + history.peek());
                } else {
                    System.out.println("No current page.");
                }
                break;

            case 4:
                if (!history.isEmpty()) {
                    System.out.println("Browser History: " + history);
                } else {
                    System.out.println("History is empty.");
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



