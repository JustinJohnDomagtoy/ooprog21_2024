import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for user input

        // Prompt the user for input
        System.out.print("Is it a weekday? (true/false): ");
        String weekdayInput = scanner.nextLine();
        boolean weekday = Boolean.parseBoolean(weekdayInput); // Parse input as boolean

        System.out.print("Are you on vacation? (true/false): ");
        String vacationInput = scanner.nextLine();
        boolean vacation = Boolean.parseBoolean(vacationInput); // Parse input as boolean

        // Call the sleepIn method and print the result
        Main obj = new Main();
        System.out.println("Can sleep in: " + obj.sleepIn(weekday, vacation));

        scanner.close();  // Close the scanner to prevent resource leak
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}
