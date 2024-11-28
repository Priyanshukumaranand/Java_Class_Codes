import java.util.*;
public class class27 {
   public static void main(String[] args) {
	  // Scanner input= new Scanner(System.in);
	   //1st
	   String s1="Welcome".toLowerCase();
	   String s7="Welcome".toUpperCase();
	   String s2="Welcome".trim();
	   String s3="Welcome".replace('e','A');
	   String s4="Welcome".replaceFirst("e","AB");
	   String s5="Welcome".replaceAll("e","AB");
	   String s6="Welcome".replaceAll("el","AB");
	   
	   
	   //2nd
	   String[]tokens="JAVA#HTML#Perl".split("#",0);
	   for(int i=0;i<tokens.length;i++) {
		    System.out.print(tokens[i]+" ");
	   }
       //3rd
	   System.out.println("Java is cool".matches("Java.*"));
       
	   //4th
	   String s="a+b$#c".replaceAll("[$+#]"," ");
	   System.out.println(s);
	   
	   //5th
	   System.out.println("Welcome to Java".lastIndexOf('a'));
	   System.out.println("Welcome to Java".indexOf('o',5));
	   
	   //6th
	   char[] chars="Java".toCharArray();
	   System.out.println(chars);
	   String str=new String(new char[] {'J','a','v','a'});
	   System.out.println(str);
	   str= String.valueOf(new char[] {'J','a','v','a'});
	   System.out.println(str);
	   
	   //7th
	   
	   
   }
}
