public class TestCircleWithCustomException {
    public static void main(String[] args){
        try{
            new CircleWithException(5);
            new CircleWithException(-5);
            new CircleWithException(0);

        }
        catch(InvalidRadiusException ex){
            System.out.println(ex);

        }
        System.out.println("Number of objects created: " + CircleWithException.getNumberOfObjects());

    }
}
class CircleWithCustomException {
    private double radius;
    private static int numberOfObjects = 0;

    public CircleWithCustomException() throws InvalidRadiusException {
        this(1.0);
    }
    public CircleWithCustomException(double newRadius) throws InvalidRadiusException {
        setRadius(newRadius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) throws InvalidRadiusException {
        if (newRadius >= 0)
            radius = newRadius;
        else
            throw new InvalidRadiusException(newRadius);
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double findArea() {
        return radius * radius * 3.14159;
    }

    public static void main(String[] args) {
        try {
            CircleWithCustomException c1 = new CircleWithCustomException(5);
            CircleWithCustomException c2 = new CircleWithCustomException(-5);
            CircleWithCustomException c3 = new CircleWithCustomException(0);
        } catch (InvalidRadiusException ex) {
            System.out.println(ex);
        }
        System.out.println("Number of objects created: " + CircleWithCustomException.getNumberOfObjects());
    }


}  
