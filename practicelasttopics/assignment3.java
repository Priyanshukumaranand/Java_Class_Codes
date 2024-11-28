import java.util.*;
public class assignment3 {
public static void main(String[] args) {
	
	Scanner input= new Scanner(System.in);
	
	//4.21
	System.out.println("Enter a SSN:" );
	String SSN=input.next();
    String regex = "\\d{3}-\\d{2}-\\d{4}";
	if(SSN.matches(regex))
		System.out.print(SSN +" is a valid social security number");
	else 
		System.out.print(SSN +" is a invalid social security number");
	
	
	//4.22
	System.out.print("Enter string s1:");
	String s1=input.nextLine();
	System.out.print("Enter string s2:");
	String s2=input.nextLine();
	if(s1.contains(s2)) {
		System.out.println(s2+" is a substring of "+s1);
	}
	else {
		System.out.println(s2+" is not a substring of "+s1);	
	}
	
	//4.24
	ArrayList<String> cities = new ArrayList<>();
	System.out.print("Enter the first city: ");
	String city1=input.nextLine();
	System.out.print("Enter the second city: ");
	String city2=input.nextLine();
	System.out.print("Enter the third city: ");
	String city3=input.nextLine();
	
	cities.add(city1);
    cities.add(city2);
    cities.add(city3);
    Collections.sort(cities);
    System.out.println("The three cities in alphabetical order are " + cities);
     
	//4.25
	Random random = new Random();
    StringBuilder plateNumber = new StringBuilder();
    for (int i = 0; i < 3; i++) {
        char letter = (char) ('A' + random.nextInt(26));
        plateNumber.append(letter);
    }
    for (int i = 0; i < 4; i++) {
        int digit = random.nextInt(10);
        plateNumber.append(digit);
    }
    System.out.println("Generated Vehicle Plate Number: " + plateNumber);
	
  }
}
