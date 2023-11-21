package day16;
import java.util.*;
public class kthMissingNumber {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(kthMissingNo(arr,k));
        sc.close();
    }

    public static int kthMissingNo(int [] arr, int k)
    {
        for(int num : arr)
        {
            if(num<=k)
            {
                k++;
            }
            else{
                break;
            }
        }
        return k;
    }
}
