package basic;
/*  Company : Oracle
  Description : An array of size n and zeta , Omega is taken as input
 and compute the following and print the final answer.
 Compute :
  find three highest and three lowest numbers in the given array
 * find median of the array (array must be in ascending order)
 * Tidemax = ( 1st max + 2nd max + 3rd max )
 * Tidemin = ( 1st min + 2nd min + 3rd min)/3
 * Zetafield = Tidemax - zeta
 * Omegawave = Omega - Tidemin
 * final answer = ( Zetafield * Omegawave ) + median
 * Sample Input :
 * arr=[ 10,5,20,1,8,15,3]
 * zeta = 30
 * omega = 50
 * Sample Output :
 * 713
 * 
 * 
 */
// Approach -1 using Sorting 
/* Sorting takes O(n log n) time complexity which is very slower (this approach is not-recomended) */
import java.util.Scanner;
import java.util.Arrays;
public class MaxMinOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int in=0;
        for(int i=0;i<n;i++){
            System.out.println("enter the "+in+"element");
            in++;
            arr[i] = sc.nextInt();
        }
        int zeta = sc.nextInt();
        int omega = sc.nextInt();
        Arrays.sort(arr);
        int min1=arr[0];
        int min2=arr[1];
        int min3=arr[2];
        int max1=arr[n-1];
        int max2=arr[n-2];
        int max3=arr[n-3];
        int Tidemax = max1+max2+max3;
       double Tidemin = (min1+min2+min3)/3.0;
       double Zetafield = Tidemax-zeta;
       double Omegawave = omega-Tidemin;
       double median=0.0;
       if (n%2!=0){
        median=arr[n/2];
       }
       else {
        median=(arr[n/2]+arr[n/2-1])/2.0;
       }
       double result = (Zetafield*Omegawave) + median;
       System.out.println(result);



    }
}