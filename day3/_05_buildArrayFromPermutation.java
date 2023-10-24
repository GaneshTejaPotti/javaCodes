package day3;
import java.util.*;
public class _05_buildArrayFromPermutation {
    public static void main(String [] args)
    {
        //  Condition: ans[i] = nums[nums[i]]
        // Input: nums = [0,2,1,5,3,4]
        // Output: [0,1,2,4,5,3]
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int ans [] = buildArray(arr);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
        sc.close();
    }

    public static int[] buildArray(int [] arr)
    {
        int ans[] = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            ans[i] = arr[arr[i]];
        }
        return ans;
    }
}
