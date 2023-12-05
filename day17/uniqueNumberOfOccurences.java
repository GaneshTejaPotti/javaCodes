package day17;
import java.util.*;
public class uniqueNumberOfOccurences {
    public static void main(String [] args)
    {
        /*
        Example 1:

        Input: arr = [1,2,2,1,1,3]
        Output: true
        Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
        
        Example 2:

        Input: arr = [1,2]
        Output: false

         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(uniqueOccurences(arr));
        sc.close();
    }

    public static boolean uniqueOccurences(int [] arr)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> mp : hm.entrySet())
        {
            if(!hs.contains(mp.getValue()))
            {
                hs.add(mp.getValue());
            }
            else{
                return false;
            }
        }
        return true;
    }
}
