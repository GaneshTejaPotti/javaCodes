package day14;
import java.util.*;
public class maxProductOfThreeNumbers {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxProduct(arr));
        sc.close();
    }

    public static int maxProduct(int [] arr)
    {
        Arrays.sort(arr);
        // 2 negative 1 positive Numbers
        int case1 = arr[0]*arr[1]*arr[arr.length-1];
        // 3 positive Numbers
        int case2 = arr[arr.length-3]*arr[arr.length-2]*arr[arr.length-1];
        return Math.max(case1,case2);
    }
}
