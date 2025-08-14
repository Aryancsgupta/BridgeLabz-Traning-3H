import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of the triangle (in inches): ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle (in inches): ");
        double height = input.nextDouble();

        // Area formula: 1/2 * base * height
        double areaInInches = 0.5 * base * height;

        // Convert to cm² (1 inch = 2.54 cm)
        double areaInCm = areaInInches * 2.54 * 2.54;

        System.out.println("The area of the triangle is " + areaInInches + " square inches and " 
                           + areaInCm + " square centimeters");

       
    }
}
