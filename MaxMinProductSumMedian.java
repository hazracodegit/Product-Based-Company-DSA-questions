/*
 * Company : Oracle
 * Problem :
 * Description : 
 * You are given an array of size 18 and two integers K and P.
 * find the maximum and minimum from the array and
 * - Compute :
 * median of the array
 * lambda= maximum * K
 * echo = P/minimum
 * nova = lambda * echo
 * final answer = median + nova
 * 
 * Input :
 * arr=[1,3,2,5,4,7,6,8,9,10,14,13,12,18,17,16,15,11]
 * p=2 , p=4
 * Output :
 * 153.5
 */
import java.util.Scanner;
import java.util.Arrays;
public class MaxMinProductSumMedian {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int p=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max)
            max=arr[i];
            if (arr[i]<min)
            min=arr[i];

        }
        int lambda=max*k;
        float echo=(float)p/min;
        float nova=lambda*echo;
        Arrays.sort(arr);
        double median=0.0;
        if (n%2!=0){
            median=arr[n/2];
        }
        else{
            median = ((arr[(n/2) -1] + arr[n/2] )/ 2.0) ;
        }
        System.out.println(median+nova);


    }
}