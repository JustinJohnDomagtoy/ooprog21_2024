import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String[] args) {
        // Display the company motto with decorative border
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's makes it fun in the sun. S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of minutes rented: ");
        int minutes = scan.nextInt();

        int hours = minutes / 60;
        int extraMinutes = minutes % 60;
        int totalPrice = hours * 40 + extraMinutes;

        System.out.printf("Hours: %d, Additional minutes: %d%n", hours, extraMinutes);
        System.out.printf("Total price: $%d%n", totalPrice);
    }
}
