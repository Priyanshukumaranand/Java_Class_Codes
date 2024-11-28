import java.util.Scanner;

public class main2 {

public static void m(int i,int n){
    for(int j=1;j<=i;j++){
        System.out.print(n+" ");
        n*=2;

    }
    System.out.println();
}
public static void main(String[] args) {

        int i=0;
        while(i<=6){
            m(i,2);
            i++;
        }
    }
}