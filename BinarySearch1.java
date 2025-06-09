// Binary Search
public class BinarySearch1{
    public static void main(String[] args){
       int[] arr={2,4,6,8,10,12};
       int target=8;
       int mid=(low+high)/2;
      int low=0,high=arr.length-1;
      while (low<=high){
        mid=(low+high)/2;
       if (arr[mid]==target){
        System.out.println("Element found at index "+mid);
        break;}
      else if (target>arr[mid])
      low=mid+1;
       else 
      high=mid-1;
     }
   }
}
