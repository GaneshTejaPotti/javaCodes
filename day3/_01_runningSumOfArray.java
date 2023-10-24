package day3;
import java.util.*;
public class _01_runningSumOfArray {
    public static void main(String [] args)
    {
        // Input: nums = [1,2,3,4]
        // Output: [1,3,6,10]
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        runningSum(arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }

    public static void runningSum(int [] arr)
    {
        int sum = 0; 
        for(int i=0;i<arr.length;i++)
        {
            sum = sum+arr[i];
            arr[i] = sum;
        }
    }
}