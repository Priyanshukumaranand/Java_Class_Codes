import java.util.Scanner;
public class Exercise {
   public static void main(String[] args) {
	   Scanner input=new Scanner(System.in);
	   
	   System.out.println("Enter amount of water in kg : ");
	   double M=input.nextDouble();
	   
	   System.out.println("Enter the initial temp : ");
	   double initialTemperature=input.nextDouble();
	   
	   System.out.println("Enter the final temp : ");
	   double finalTemperature=input.nextDouble();
	   
	   double Q=M*(finalTemperature-initialTemperature)*4184;
	   System.out.println("The energy needed is : "+Q);
	   
   }
}
