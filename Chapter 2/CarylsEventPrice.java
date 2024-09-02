import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args) {
        // Display the company motto with decorative border
        System.out.println("******************************************");
        System.out.println("* Carly's makes the food that makes      *");
        System.out.println("*             it a party.                *");
        System.out.println("******************************************");

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of guests: ");
        int guests = scan.nextInt();

        int totalPrice = guests * 35;

        // Use printf for formatted output
        System.out.printf("Guests: %d%n", guests);
        System.out.printf("Total price: $%d%n", totalPrice);
        System.out.printf("Large event: %b%n", guests >= 50);
    }
}
