package day16;
import java.util.*;
public class insertPosition {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(searchInsert(arr,target));
        sc.close();
    }

    public static int searchInsert(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while(i<=j)
        {
            int mid = (i+j)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }
        return i;
    }
}
