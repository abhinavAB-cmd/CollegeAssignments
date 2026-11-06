import java.util.*;
public class Circle {
    public static void main(String[] args) {
        final double PI = 3.14159; // Constant value for Pi
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        System.out.println("Area: " + area);
        System.out.println("Circumference(Perimeter of Circle): " + circumference);
        sc.close();
    }
}
