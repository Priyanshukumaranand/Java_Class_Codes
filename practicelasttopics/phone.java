import java.util.*;
public class phone {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 String str=sc.next();
	 str=str.toLowerCase();
	 int arr[]= {2,3,4,5,6,7,8,9};
	 for(int i=0;i<str.length();i++) {
		 if(str.charAt(i)<'s')
		 System.out.print(arr[(str.charAt(i)-'a')/3]);
		 else if(str.charAt(i)<'y') {	 	 
			 System.out.print(arr[(str.charAt(i)-'a'-1)/3]);
		 }
		 else {
			 System.out.print(9);
		 }
	 }
	 
 }
}
