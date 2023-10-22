package day2;
import java.util.*;
public class _03_findAllNumbersDisappeared {
    public static void main(String [] args)
    {
        //Input: nums = [4,3,2,7,8,2,3,1]
        // Output: [5,6]
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> ans = findNumbers(arr);
        for(int i : ans)
        {
            System.out.print(i+" ");
        }
        sc.close();
    }

    public static ArrayList<Integer> findNumbers(int [] arr)
    {
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i : arr)
        {
            hs.add(i);
        }
        for(int i=1;i<=arr.length;i++)
        {
            if(!hs.contains(i))
            {
                ans.add(i);
            }
        }
        return ans;
    }
}

