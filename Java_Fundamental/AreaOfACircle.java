import java.util.Scanner;
public class AreaOfACircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.printf("Area of the circle with radius %.2f is: %.2f%n", radius, area);
    }
}
