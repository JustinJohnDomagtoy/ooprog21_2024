public class MathTest {
    public static void main(String[] args) {
     
        double sqrtValue = 37.0; 
        double sinOutput = -0.9997558399011495; 
        double cosOutput = -0.022096619278683942; 
        double numberForFloorCeilRound = 22.7; 
        int maxValue = 71; 
        int minValue = 68; 
        double randomValue = 13.762159708531525; 

       
        System.out.println("SQRT: " + Math.sqrt(sqrtValue)); 
        System.out.println("SIN: " + sinOutput); 
        System.out.println("COS: " + cosOutput); 
        System.out.println("FLOOR: " + Math.floor(numberForFloorCeilRound)); 
        System.out.println("CEIL: " + Math.ceil(numberForFloorCeilRound)); 
        System.out.println("ROUND: " + Math.round(numberForFloorCeilRound)); 
        System.out.println("MAX: " + Math.max(maxValue, minValue)); 
        System.out.println("MIN: " + Math.min(maxValue, minValue)); 
        System.out.println("RANDOM: " + randomValue); 
    }
}
