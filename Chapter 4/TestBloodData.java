import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Blood Type: ");
        String bloodType = scanner.nextLine();

        System.out.print("Enter Rh Factor: ");
        String rhFactor = scanner.nextLine();

        BloodData patient = new BloodData(bloodType, rhFactor);
        patient.displayBloodInfo();

        scanner.close();
    }
}
