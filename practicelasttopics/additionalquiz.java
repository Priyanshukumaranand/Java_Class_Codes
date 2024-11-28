import java.util.Scanner;
import java.util.Random;
public class additionalquiz {
   public static void main(String[] args ) {
	   int n1=(int)(System.currentTimeMillis()%100);
	   int n2=(int)(System.currentTimeMillis()*7%100);
	   
	   Scanner input=new Scanner(System.in);
	   System.out.print("What is "+n1+ " + "+n2+" ? ");
	   int ans=input.nextInt();
	   System.out.println(n1+"+"+n2+"="+ans+" is "+(n1+n2==ans));	  
	   
   }
}
