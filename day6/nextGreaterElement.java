package day6;
import java.util.*;
public class nextGreaterElement {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);    
        int n1 = sc.nextInt();
        int nums1[] = new int[n1];
        int n2 = sc.nextInt();
        int nums2[] = new int[n2];
        for(int i=0;i<n1;i++)
        {
            nums1[i] = sc.nextInt();
        }
        for(int i=0;i<n2;i++)
        {
            nums2[i] = sc.nextInt();
        }
        int ans[] = nextGreater(nums1,nums2);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
        sc.close();
    }

    public static int[] nextGreater(int [] nums1, int [] nums2)
    {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : nums2)
        {
            while(!st.isEmpty() && st.peek()<i)
            {
                hm.put(st.pop(),i);
            }
            st.push(i);
        }
        for(int i=0;i<nums1.length;i++)
        {
            nums1[i] = hm.containsKey(nums1[i]) ? hm.get(nums1[i]) : -1;
        }
        return nums1;
    } 
}
