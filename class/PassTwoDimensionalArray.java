import java.util.*;
public class PassTwoDimensionalArray {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        //Enter array values
        int[][] m=new int[3][4];
        System.out.println("Enter "+m.length+" rows and "+m[0].length + " columns:");
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                m[i][j]=input.nextInt();
            
                //Display result
            }
        }
                System.out.println("\nSum of all elements is " + sum(m));


    }
    public static int sum(int [][] m){
        int total=0;
        for(int row=0;row<m.length;row++){
            for(int column=0;column<m[row].length;column++){
                total +=m[row][column];
            }
        }
        return total;
    }
    public static int sumdiag(int [][]m){
        int sum=0;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length();j++){
                    if(i==j && j==k){
                        sum+=m[i][j];
                    }
                    else if((i+j)==m.length()-1){
                        sum+=m[i][j];
                    }
            }
        }
       return sum;
    }
}
