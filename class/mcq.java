import java.util.*;
public class mcq {
    public static void main(String [] args){

     double [][] arr={{-1,3},{-1,-1},{1,1},{2,0.5},{2,-1},{3,3},{4,2},{4,-0.5}};
     FindNearestPoints(arr);
        // char[] key={'D','B','D','C','C','D','A','E','A','D'};
        // char[][] answers={{'A','B','A','C','C','D','E','E','A','D'},
        // {'D','B','A','B','C','A','E','E','A','D'},
        // {'E','D','D','A','C','B','E','E','A','D'},
        // {'C','B','A','E','D','C','E','E','A','D'},
        // {'A','B','D','C','C','D','E','E','A','D'},
        // {'B','B','E','C','C','D','E','E','A','D'},
        // {'B','B','A','C','C','D','E','E','A','D'},  
        // {'E','B','E','C','C','D','E','E','A','D'},
        // };
        // check(key,answers);

    }
    // public static void check(char []key,char [][] answers ){
    //     for(int i=0;i<answers.length;i++){
    //         int score=0;
    //         for(int j=0;j<answers[0].length;j++){
    //           if(key[j]==answers[i][j]){
    //             score++;
    //           }
    //         }
    //         System.out.println("Student "+i+"'s score is "+score);
    //     }
    // }
    public static void FindNearestPoints(double [][] arr){
        double min=Integer.MAX_VALUE;
        int x1=0;
        int x2=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i!=j){
                    double d=(arr[i][0]-arr[j][0])*(arr[i][0]-arr[j][0])+(arr[i][1]-arr[j][1])*(arr[i][1]-arr[j][1]);
                   if(min>d){
                    min=d;
                    x1=i;
                    x2=j;
                   }
                }
            }
        }
        System.out.println("Smallest distance is between points "+arr[x1][0]+", "+arr[x1][1]+" and  "+arr[x2][0]+", "+arr[x2][1]);
    }
}
