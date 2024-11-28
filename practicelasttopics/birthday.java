import java.util.*;
public class birthday {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	boolean f1=false,f2=false,f3=false,f4=false,f5=false;
	int sum=0;
    int arr1[]= {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31};
    for(int i=0;i<arr1.length;i++) {
    	System.out.print(arr1[i]);
    	if(i%4==0) {
    		System.out.println();
    	}
    }
    f1=input.nextBoolean();
    if(f1) {
    	sum+=arr1[0];
    }
    int arr2[]= {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31};
    for(int i=0;i<arr1.length;i++) {
    	System.out.print(arr2[i]);
    	if(i%4==0) {
    		System.out.println();
    	}
    }
    f2=input.nextBoolean();
    if(f2) {
    	sum+=arr2[0];
    }
    int arr3[]= {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31};
    for(int i=0;i<arr1.length;i++) {
    	System.out.print(arr3[i]);
    	if(i%4==0) {
    		System.out.println();
    	}
    }
    f1=input.nextBoolean();
    if(f1) {
    	sum+=arr3[0];
    }
    int arr3[]= {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31};
    for(int i=0;i<arr1.length;i++) {
    	System.out.print(arr1[i]);
    }
    f1=input.nextBoolean();
    if(f1) {
    	sum+=arr3[0];
    }
    int arr4[]= {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31};
    for(int i=0;i<arr1.length;i++) {
    	System.out.print(arr4[i]);
    	if(i%4==0) {
    		System.out.println();
    	}
    }
    f1=input.nextBoolean();
    if(f1) {
    	sum+=arr4[0];
    }
    int arr5[]= {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31};
    for(int i=0;i<arr1.length;i++) {
    	System.out.print(arr5[i]);
    	if(i%4==0) {
    		System.out.println();
    	}
    }
    f1=input.nextBoolean();
    if(f1) {
    	sum+=arr5[0];
    }
	System.out.print(sum);
	
}
}
