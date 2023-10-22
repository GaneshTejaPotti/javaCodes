package day2;
import java.util.*;
public class _01_removeDuplicates1 {
    public static void main(String [] args)
    {
        // Input: nums = [0,0,1,1,1,2,2,3,3,4]
        // Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int len = lengthAfterRemoval(arr);
        System.out.println(len);
        sc.close();
    }

    public static int lengthAfterRemoval(int [] arr)
    {
        int j=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[j])
            {
                j++;
                arr[j] = arr[i];
            }
        }
        return j+1;
    }
}
