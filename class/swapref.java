public class swapref {
    public static void main(String[] args){
        int[] a ={1,2};

        System.out.println("Before using the swap");
        System.out.println("array is {"+a[0]+","+a[1]+"}");
        swap(a[0],a[1]);
        System.out.println("After invoking swap");
        System.out.println("array is {"+a[0]+","+a[1]+"}");

        //swap elements using swapFirstArray Method
        System.out.println("Before invoking swapFirstTwo In Arry");
        System.out.println("array is {"+a[0]+","+a[1]+"}");
        swapFirstTwoArray(a);
        System.out.println("After invoking swapFirstTwo In Array");
        System.out.println("array is {"+a[0]+","+a[1]+"}");
        int b[]=reverse(new int[]{1,2,3,4,5});
       // System.out.println("array is {"+b[0]+","+b[1]+","+b[2]+"}");
        
        for(int i:b) System.out.println(i);
    	
    }
        /** swap two variables */
        public static void swap(int n1,int n2){
            int temp=n1;
            n1=n2;
            n2=temp;
        }
        /** swap the first two elements in the array */
        public static void swapFirstTwoArray(int[] array){
            int temp=array[0];
            array[0]=array[1];
            array[1]=temp;
        }
        //reverse 
        public static int[] reverse(int[] list){
            int[] result=new int[list.length];
            for(int i=0,j=result.length-1;i<list.length;i++,j--){
                result[j]=list[i];
            }
            return result;    
        }
}
