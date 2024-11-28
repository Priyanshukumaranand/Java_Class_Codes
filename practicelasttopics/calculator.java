import java.util.*;
public class calculator {
	 public static void main(String[] args) {
		   Scanner input= new Scanner(System.in);
		   String calculation=input.nextLine();
		   
		   String[]tokens=calculation.split(" ",0);
		   for(int i=0;i<tokens.length;i++) {
			    System.out.println(tokens[i]+" ");
		   }
		   
		   //teacher logic
		   double operand1=Double.parseDouble(args[0]);
		   char operator=args[1].charAt(0);
		   double operand2=Double.parseDouble(args[2]);
	 }
	 
}
