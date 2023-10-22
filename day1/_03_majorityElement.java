package day1;
import java.util.*;
public class _03_majorityElement {
    public static void main(String [] args)
    {
        //Input: nums = [3,2,3]
        // Output: 3 (n/2)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int majEle = findMajority(arr);
        System.out.println(majEle);
        sc.close();
    }

    public static int findMajority(int[] arr)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!hm.containsKey(arr[i]))
            {
                hm.put(arr[i],1);
            }else{
                int val = hm.get(arr[i]);
                hm.put(arr[i], val+1);
            }
        }
        int max = 0, ele=-1;
        for(Map.Entry<Integer,Integer> mp : hm.entrySet())
        {
            if(mp.getValue()>max)
            {
                max=mp.getValue();
                ele=mp.getKey();
            }
        }
        if(max>arr.length/2)
        {
            return ele;
        }else{
            return -1;
        }
    }
}