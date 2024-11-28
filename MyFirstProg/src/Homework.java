
import java.util.Scanner;
public class Homework{
public static void main(String[] args) {
	//2.5
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the subtotal and a gratuity rate:");
	double subtotal=input.nextDouble();
	double gratuitypercentage=input.nextDouble();
	double gratuity=subtotal*gratuitypercentage/100;
	double total=gratuity+subtotal;
	System.out.println("The gratuity is $"+gratuity+" and total is $"+total);
	
	
	//2.6
	System.out.println("Enter a number between 0 and 1000:");
	int no=input.nextInt();
	int sum=0;
	while(no>0) {
		sum+=no%10;
		no/=10;
	}
	System.out.println("The sum of the digits is "+sum);
	
	
	//2.7
	System.out.print("Enter the number of minutes:");
	int minutes=input.nextInt();
	int days=minutes/(60*24);
	int years=days/365;
	System.out.print(minutes+" minutes is approximately "+years+" years and "+(days-years*365)+" days");
  }
}