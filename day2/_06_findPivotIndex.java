package day2;
import java.util.*;
public class _06_findPivotIndex {
    public static void main(String [] args)
    {
        // Input: nums = [1,7,3,6,5,6]
        // Output: 3 (leftSum==rightSum)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int pivot = findPivot(arr);
        System.out.print(pivot);
        sc.close();
    }

    public static int findPivot(int [] arr)
    {
        int ls=0, ts=0;
        for(int i : arr)
        {
            ts+=i;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(ts-ls-arr[i]==ls)
            {
                return i;
            }
            ls+=arr[i];
        }
        return -1;
    }
}
