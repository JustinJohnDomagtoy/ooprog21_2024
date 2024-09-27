public class Billing {

    public static double computeBill(double price) {
        return price * 1.08;
    }

    public static double computeBill(double price, int quantity) {
        return price * quantity * 1.08;
    }


    public static double computeBill(double price, int quantity, int couponDiscount) {
        double subtotal = price * quantity;
        double discount = subtotal * (couponDiscount / 100.0);
        return (subtotal - discount) * 1.08;
    }

    public static void main(String[] args) {
        System.out.printf("The total price for the bill is: $%.11f%n", computeBill(23.2));
        System.out.printf("The total price for the bill is: $%.11f%n", computeBill(24.4, 2));
        System.out.printf("The total price for the bill is: $%.3f%n", computeBill(41.23, 2, 14));
    }
}
