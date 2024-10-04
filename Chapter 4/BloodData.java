public class BloodData {
    private String bloodType;
    private String rhFactor;

    public BloodData(String bloodType, String rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    public void displayBloodInfo() {
        System.out.println("Your blood type is: " + bloodType);
        System.out.println("Your Rh Factor is: " + rhFactor);
    }
}
