import java.util.*;
public class snallestno {
    public static void recur(int i,int [] arr){
      if(i>=arr.length-1)
      {
        for(int x:arr){
            System.out.println(x);
        }
        return;
      }
        int mini=Integer.MAX_VALUE;
        int ind=0;
        for(int s=i;s<arr.length;s++){
            if(mini>arr[s]){
                mini=arr[s];
                ind=s;
            }
        //   mini=math.min(mini,arr[i]);
      }
      int temp=arr[i];
      arr[i]=mini;
      arr[ind]=temp;

      recur(i+1,arr);

    }
    public static void main(String[] args){
        int arr[]={3,6,9,5,1,0};
       recur(0,arr);
    }
}
