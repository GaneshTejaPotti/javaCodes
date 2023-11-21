package day16;
import java.util.*;
public class kthLargestNumberInArray {
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
        System.out.println(kthLargest(arr,k));
        sc.close();
    }

    public static int kthLargest(int [] arr, int k)
    {
        Arrays.sort(arr);
        return arr[arr.length-k];
    }
}
