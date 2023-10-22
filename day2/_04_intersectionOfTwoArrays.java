package day2;
import java.util.*;
public class _04_intersectionOfTwoArrays {
    public static void main(String [] args)
    {
        //Input: nums1 = [1,2,2,1], nums2 = [2,2]
        // Output: [2] (without Duplicity)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr1 = new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int [] arr2 = new int[m];
        for(int i=0;i<m;i++)
        {
            arr2[i] = sc.nextInt();
        }
        int ans[] = intersection(arr1, arr2);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
        sc.close();
    }

    public static int[] intersection(int[] arr1, int arr2[]){
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for(int i : arr1)
        {
            hs1.add(i);
        }
        for(int i : arr2)
        {
            if(hs1.contains(i))
            {
                hs2.add(i);
            }
        }
        int ans[] = new int[hs2.size()];
        int index = 0;
        for(int i : hs2)
        {
            ans[index] = i;
        }
        return ans;
    }
}
