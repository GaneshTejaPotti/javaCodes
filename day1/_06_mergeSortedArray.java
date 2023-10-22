package day1;
import java.util.*;
public class _06_mergeSortedArray {
    public static void main(String[] args)
    {
        // Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        // Output: [1,2,2,3,5,6]
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int arr1[] = new int[s1+s2];
        for(int i=0;i<s1;i++)
        {
            arr1[i] = sc.nextInt();
        }
        int arr2[] = new int[s2];
        for(int i=0;i<s2;i++)
        {
            arr2[i] = sc.nextInt();
        }
        merge(arr1, s1, arr2, s2);
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        sc.close();
    }

    public static void merge(int [] arr1, int s1, int [] arr2, int s2)
    {
        int i=s1-1, j=s2-1, k=arr1.length-1;
        while(j>=0)
        {
            if(arr1[i]>arr2[j])
            {
                arr1[k]=arr1[i];
                k--;
                i--;
            }
            else{
                arr1[k]=arr2[j];
                k--;
                j--;
            }
        }
    }
}
