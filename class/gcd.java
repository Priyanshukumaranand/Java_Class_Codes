import java.util.*;
public class gcd {
	public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the First number : ");
		int a=input.nextInt();
	System.out.println("Enter the Second number : ");
		int b=input.nextInt();
	int no;
	if(a>b)
		no=b;
	else
		no=a;
	while(a%no!=0 || b%no!=0) {
		no--;
	}
	System.out.println(no);
    }
}
