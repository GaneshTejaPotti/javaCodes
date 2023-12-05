package day17;
import java.util.*;
public class containDuplicates {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(containsDuplicates(arr));
        sc.close();
    }

    public static boolean containsDuplicates(int [] arr)
    {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!hs.contains(arr[i]))
            {
                hs.add(arr[i]);
            }
            else{
                return true;
            }
        }
        return false;
    }
}
