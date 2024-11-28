
public class decitohex {
   public static void main(String[] args) {
	   int no=74;
	   int x=0;
	   String str="";
	   while(no>0) {
		
		  int x1=no%16;
		  System.out.println(x1);
		  if(x1>=9) {
			  str+=((x1-10)+'A');
		  }
		  else {
			  str+=((x1)+'0');
		  }
		  no=no/16;
		  System.out.println(str);
	   }
	   
	   
   }
}
