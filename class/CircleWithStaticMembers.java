public class CircleWithStaticMembers {
    //The radius of the circle
    private double radius;
    /**The number of objects created */
    static int numberOfObjects = 0;

    //construct a circle with radius 1
    CircleWithStaticMembers(){
        radius = 1.0;
        numberOfObjects++;
    }

    //circle with specified radius 
    CircleWithStaticMembers(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius){
        radius = (newRadius >= 0) ? newRadius : 0;
    }
    
     static int getNumberOfObjects(){
        return numberOfObjects;
     }
     double getArea(){
        return radius * radius * Math.PI;
     }


    }
