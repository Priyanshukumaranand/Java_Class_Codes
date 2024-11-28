public class InvalidRadiusException extends Exception{
    private double radius;

    public InvalidRadiusException(double radius){
        super("Invalid radius "+ radius);
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public static void main(String[] args){
        InvalidRadiusException ex = new InvalidRadiusException(5);
        System.out.println(ex.getRadius());
    }
}
