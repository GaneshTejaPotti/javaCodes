package day2;
import java.util.*;
public class _02_removeDuplicates2 {
    public static void mainh(String [] args)
    {
        // Input: nums = [0,0,1,1,1,1,2,3,3]
        // Output: 7, nums = [0,0,1,1,2,3,3,_,_]
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        // But Every Element can have 1 duplicate(2 times)
        int len = cntLength(arr);
        System.out.println(len);
        sc.close();
    }

    public static int cntLength(int [] arr)
    {
        if(arr.length<2)
        {
            return arr.length;
        }
        int index=2;
        for(int i=2;i<arr.length;i++)
        {
            if(arr[i]!=arr[index-2])
            {
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }
}
