import java.util.Scanner;

public class Warmup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

       
        System.out.print("Is it a weekday? (true/false): ");
        String weekdayInput = scanner.nextLine();
        boolean weekday = Boolean.parseBoolean(weekdayInput); 

        System.out.print("Are you on vacation? (true/false): ");
        String vacationInput = scanner.nextLine();
        boolean vacation = Boolean.parseBoolean(vacationInput); 

        Main obj = new Main();
        System.out.println("Can sleep in: " + obj.sleepIn(weekday, vacation));

        scanner.close(); 
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}
