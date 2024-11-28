//10.4
public class MyPoint {
    private double x;
    private double y;

    // No-arg constructor that creates a point (0, 0)
    public MyPoint() {
        this(0, 0);
    }

    // Constructor that constructs a point with specified coordinates
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter methods for x and y
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Method that returns the distance from this point to a specified point of the MyPoint type
    public double distance(MyPoint point) {
        return distance(point.getX(), point.getY());
    }

    // Method that returns the distance from this point to another point with specified x- and y-coordinates
    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 30.5);
        System.out.println("Distance between point1 and point2: " + point1.distance(point2));
    }
}
