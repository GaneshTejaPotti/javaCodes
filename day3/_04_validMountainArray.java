package day3;
import java.util.*;
public class _04_validMountainArray {
    public static void main(String [] args)
    {
        // Input: arr = [0,3,2,1]
        // Output: true
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        boolean valid = validMountain(arr);
        System.out.print(valid);
        sc.close();
    }

    public static boolean validMountain(int [] arr)
    {
        if(arr.length<3)
        {
            return false;
        }
        int n = arr.length, i=0;
        while(i<n-1 && arr[i]<arr[i+1])
        {
            i++;
        }
        if(i==0 || i==n-1)
        {
            return false;
        }
        while(i<n-1 && arr[i]>arr[i+1])
        {
            i++;
        }
        return i==n-1;
    }
}
