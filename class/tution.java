import java.util.*;
public class tution {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int fee=10000;
		double incrate=1.07;
		int year=1;
		int principle=10000;
		while(fee<principle*2) {
			fee*=incrate;
			year++;
		}		
		System.out.println(year);
	
	}

}
