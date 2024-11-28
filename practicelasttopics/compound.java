import java.util.Scanner;
public class compound{
   public static void main(String[] args) {
	   Scanner input=new Scanner(System.in);
	   
	   System.out.println("Enter the monthly saving amount : ");
	   double saving=input.nextDouble();
	   double account=0;
	   double intrestRate=0.05;
	   

	   double monthlyRate=intrestRate/12;
	   double months=6;
	   while(months>0) {
		   account+=saving;
		   account+=account*monthlyRate;
		   months--;
	   }
	   System.out.println("After the sixth month account becomes : "+account);
	   //2.15,16,17
   }
}
