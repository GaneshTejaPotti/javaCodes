package day2;
import java.util.*;
public class _05_intersectionOfTwoArrays2 {
    public static void main(String [] args)
    {
        // Input: nums1 = [1,2,2,1], nums2 = [2,2]
        // Output: [2,2] (with Duplicity)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr1 = new int[n];
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

    public static int[] intersection(int [] arr1, int [] arr2)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : arr1)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int i : arr2)
        {
            if(hm.containsKey(i) && hm.get(i)>0)
            {
                al.add(i);
                hm.put(i,hm.get(i)-1);
            }
        }
        int index = 0;
        int ans [] = new int[al.size()];
        for(int i : al)
        {
            ans[index] = i;
            index++; 
        }
        return ans;
    }
}
