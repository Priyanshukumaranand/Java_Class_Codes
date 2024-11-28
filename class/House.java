public class House implements Clonable,Comparable<House>{
    private int id;
    private double area;
    private java.util.Date whenBuilt;

    public House(int id, double area){
        this.id = id;
        this.area = area;
        whenBuilt = new java.util.Date();
    }

    public int getId(){
        return id;
    }

    public double getArea(){
        return area;
    }

    public java.util.Date getWhenBuilt(){
        return whenBuilt;
    }

    @Override
    public Object clone(){
        //perform a shallow copy
        House houseClone= new House(id,area);
        //deep copy on whenbuilt
        houseClone.whenBuilt=new java.util.Date();
        houseClone.getWhenBuilt().setTime(whenBuilt.getTime());
        return houseClone;
    }

    @Override //Implement the compareTo method defined in Comparable
    public int compareTo(House o){
        if(area>o.area)
        return 1;
        else if(area<o.area)
        return -1;
        else
        return 0;
    }

    public static void main(String[] args){
          House h1=new House(1,22);
          System.out.println(h1.getId());

    }
}
