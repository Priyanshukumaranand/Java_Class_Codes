public class binarysearch {
    public static Boolean bin(int ele,int l,int r,int arr[]){
        int mid=(l+r)/2;
        if(arr[mid]==ele)
        return true;
        else if(arr[mid]>ele){
        bin(ele,l,mid-1,arr);
        }
        else{
            bin(ele,mid+1,r,arr);
        }
        return false;

    }
}
