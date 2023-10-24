package day3;
import java.util.*;
public class _02_removeElement {
    public static void main(String [] args)
    {
        // Input: nums = [0,1,2,2,3,0,4,2], val = 2
        // Output: 5, nums = [0,1,4,0,3,_,_,_]
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int len = lenAfterRemoval(arr,target);
        System.out.println(len);
        sc.close();
    }

    public static int lenAfterRemoval(int [] arr,int target)
    {
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] != target)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return j;
    }
}
