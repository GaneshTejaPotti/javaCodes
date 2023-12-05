package day17;
import java.util.*;
public class containDuplicates2 {
    public static void main(String [] args)
    {
        /*
        Given an integer array nums and an integer k, return true if there are two 
        distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

        Example 1:

        Input: nums = [1,2,3,1], k = 3
        Output: true
        Example 2:

        Input: nums = [1,0,1,1], k = 1
        Output: true
        Example 3:

        Input: nums = [1,2,3,1,2,3], k = 2
        Output: false

         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(containsNearByDuplicates(arr,k));
        sc.close();
    }

    public static boolean containsNearByDuplicates(int [] arr, int k)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i]) && i-hm.get(arr[i])<=k)
            {
                return true;
            }
            hm.put(arr[i],i);
        }
        return false;
    }
}
