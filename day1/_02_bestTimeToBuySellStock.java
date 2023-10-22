package day1;
import java.util.*;
public class _02_bestTimeToBuySellStock {
    public static void main(String [] args)
    {
        // input: prices = [7,1,5,3,6,4]
        // Output: 5

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int maxPrice = bestTime(arr);
        System.out.println(maxPrice);
        sc.close();
    }

    public static int bestTime(int [] arr)
    {
        int maxPrice=Integer.MIN_VALUE;
        int mini = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            int curr = arr[i]-mini;
            maxPrice = Math.max(maxPrice,curr);
            mini = Math.min(mini,arr[i]);
        }
        return maxPrice;
    }
}