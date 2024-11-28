import java.util.*;
public class casestudy2 {
     public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    	 String str=input.nextLine();
    	 String str1="";
    	 for(int i=str.length();i>-1;i++) {
    		 str1+=str.charAt(i);
    	 }
    	 System.out.println(str.equals(str1));
     }
}
