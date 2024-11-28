import java.util.*;
public class arrayvar {
public static void main(String[] args){
    	int myList[]=new int[100];
        Scanner input= new Scanner(System.in);
        
        // for(int i=0;i<myList.length;i++){
        //     myList[i]=input.nextInt();
        // }
        
        Random rand = new Random();
        
        //assign random nos
        for(int i=0; i<myList.length; i++) {
          myList[i] = rand.nextInt(100);
        }
        
        //printing
        int average=0;
        for(int i=0;i<myList.length;i++){
        	average+=myList[i];
          System.out.print(myList[i]+" ");
        }
        System.out.println();
        average/=100;
}
}
