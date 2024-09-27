public class Circle {

  
    private static double radius;
    private static double diameter;
    private static double area;

   
    public Circle() {
        radius = 1;
        diameter = 2 * radius;
        area = Math.PI * radius * radius;
    }

      public static void setRadius(double rad) {
        radius = rad;
        diameter = 2 * radius;
        area = Math.PI * radius * radius;
    }

   
    public static double getRadius() {
        return radius;
    }

    public static double getDiameter() {
        return diameter;
    }

    
    public static double getArea() {
        return area;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();

        System.out.println("Initial radius: " + getRadius());
        System.out.println("Initial diameter: " + getDiameter());
        System.out.println("Initial area: " + getArea());

        setRadius(5.0);

        System.out.println("Updated radius: " + getRadius());
        System.out.println("Updated diameter: " + getDiameter());
        System.out.println("Updated area: " + getArea());
    }
}



