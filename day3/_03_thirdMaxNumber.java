package day3;
import java.util.*;
public class _03_thirdMaxNumber {
    public static void main(String [] args)
    {
        // Input: nums = [2,2,3,1]
        // Output: 1
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int third = thirdMax(arr);
        System.out.print(third);
        sc.close();
    }

    public static int thirdMax(int [] arr)
    {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for(int i : arr)
        {
            if(i>max)
            {
                thirdMax = secondMax;
                secondMax = max;
                max = i;
            }
            else if(i<max && i>secondMax)
            {
                thirdMax = secondMax;
                secondMax = i;
            }
            else if(i<secondMax && i>thirdMax)
            {
                thirdMax = i;
            }
        }
        int res = (thirdMax==Integer.MIN_VALUE) ? max : thirdMax;
        return res;
    }
}