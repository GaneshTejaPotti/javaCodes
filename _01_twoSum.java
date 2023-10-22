package day1;
import java.util.*;
public class _01_twoSum{
    public static void main(String [] args)
    {
        //Input: nums = [2,7,11,15], target = 9
        //Output: [0,1] Indexes

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int ans[] = twoSumArr(arr,target);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
        sc.close();
    }
    
    public static int[] twoSumArr(int [] arr, int target)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int ans[] = new int[2];
        for(int i=0;i<arr.length;i++)
        {
            int curr = target-arr[i];
            if(!hm.containsKey(curr))
            {
                hm.put(arr[i],i);
            }
            else{
                ans[0] = hm.get(curr);
                ans[1] = i; 
            }
        }
        return ans;
    }
}
