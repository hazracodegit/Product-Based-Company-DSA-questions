// Binary Search 
public class BinarySearch1{
    public static void main(String[] args){
     int[] arr= {1,3,5,7,9};
     int target= 4;
    int low =0,high= arr.length-1;
     while (low<=high){
    int  mid =(low+high)/2;
        if (arr[mid]==target)
         System.out.println("Found");
        else if (target>arr[mid])
          low=mid+1;
         else
          high=mid-1;
        }
   System.out.println("Not found");
    }
}
