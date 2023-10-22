package day1;
import java.util.*;
public class _05_squaresOfSortedArray {
    public static void main(String [] args)
    {
        // Input: nums = [-4,-1,0,3,10]
        // Output: [0,1,9,16,100]
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int ans[] = squares(arr);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
        sc.close();
    }

    public static int[] squares(int [] arr)
    {
        int ans[] = new int[arr.length];
        int i=0,j=arr.length-1;
        for(int k=arr.length-1;k>=0;k--)
        {
            if(Math.abs(arr[i])>Math.abs(arr[j]))
            {
                ans[k] = arr[i]*arr[i];
                i++;
            }
            else{
                ans[k] = arr[j]*arr[j];
                j--;
            }
        }
        return ans;
    }
}
