package assignment;

public class Circle2DTest {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);

        // Display area and perimeter
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());

        // Test contains method with a point
        System.out.println("c1.contains(3, 3): " + c1.contains(3, 3));

        // Test contains method with another circle
        Circle2D c2 = new Circle2D(4, 5, 10.5);
        System.out.println("c1.contains(new Circle2D(4, 5, 10.5)): " + c1.contains(c2));

        // Test overlaps method with another circle
        Circle2D c3 = new Circle2D(3, 5, 2.3);
        System.out.println("c1.overlaps(new Circle2D(3, 5, 2.3)): " + c1.overlaps(c3));
    }
}