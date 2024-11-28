import java.util.Scanner;
public class calcnew {
	 public static void main(String[] args) {
		 
		 if(args.length!=3) {
			 System.out.println("Usage : java");
			 System.exit(0);
		 }
		 int result=0;
		 switch(args[1].charAt(0)) {
		 case '+':result=Integer.parseInt(args[0])+Integer.parseInt(args[2]);
		 break;
		 case '-':result=Integer.parseInt(args[0])-Integer.parseInt(args[2]);
		 break;
		 case '.':result=Integer.parseInt(args[0])*Integer.parseInt(args[2]);
		 break;
		 case '/':result=Integer.parseInt(args[0])/Integer.parseInt(args[2]);
		 break;
		 
		 }
		System.out.println(result);
		   
		  
	 }
	 
}
