
public class TestMax {
public static void main(String[] args) {
	int i=5;
	int j=2;
	myClass mc=new myClass();
	int k=myClass.max(i,j);
	System.out.println("The max no btw "+ i + " and " + j+" is "+k );
	
}
class myClass{
public int max(int num1,int num2) {
	int result;
	if(num1>num2) {
		result=num1;
	}
	else {
		result=num2;
	}
	return result;
}
}
}
