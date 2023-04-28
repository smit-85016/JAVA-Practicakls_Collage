import java.util.Scanner;

public class Practical_11 {
    public void area(float radius) {
        float area = (float) (3.14 * radius * radius);
        System.out.println("\nArea of circle: " + area);
    }

    public void area(float length, float width) {
        float area = length * width;
        System.out.println("Area of rectangle: " + area);
    }

    public static void main(String[] args) {

        System.out.println("216090307039");
        
        Practical_11 shape = new Practical_11();
        Scanner scanner = new Scanner(System.in);
        float radius;
        float length, width;

        System.out.print("Enter radius of circle: ");
        radius = scanner.nextFloat();

        System.out.print("Enter length of rectangle: ");
        length = scanner.nextFloat();
        System.out.print("Enter width of rectangle: ");
        width = scanner.nextFloat();

        shape.area(radius);

        shape.area(length, width);

        scanner.close();
    }
}