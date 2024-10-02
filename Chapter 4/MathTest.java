public class MathTest {
    public static void main(String[] args) {
       
        double num = 37.0;
        double sinValue = -1.5708; 
        double cosValue = 1.5708;  
        int num1 = 71;
        int num2 = 68;

       
        System.out.println("SQRT: " + Math.sqrt(num));             
        System.out.println("SIN: " + Math.sin(sinValue));          
        System.out.println("COS: " + Math.cos(cosValue));          
        System.out.println("FLOOR: " + Math.floor(num));           
        System.out.println("CEIL: " + Math.ceil(num));             
        System.out.println("ROUND: " + Math.round(num));           
        System.out.println("MAX: " + Math.max(num1, num2));        
        System.out.println("MIN: " + Math.min(num1, num2));        
        System.out.println("RANDOM: " + (Math.random() * 100));    
    }
}
