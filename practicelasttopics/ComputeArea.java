
import java.util.Scanner;

public class ComputeArea{
	public static void main(String[] args) {
		final double PI=3.14159;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the radius");
		double radius=input.nextDouble();
		double area=radius*radius*PI;
		System.out.print("the area of circle of "+radius+ " is "+area);
	}
}