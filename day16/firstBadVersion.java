package day16;
import java.util.*;
public class firstBadVersion {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] ans = new boolean[n];
        for(int i=0;i<n;i++)
        {
            ans[i] = sc.nextBoolean();
        }
        System.out.println(firstBadVer(n,ans));
        sc.close();
    }

    public static int firstBadVer(int n, boolean[] ans)
    {
        int i=1,j=n;
        while(i<=j)
        {
            int mid = i+(j-i)/2;
            if(ans[mid])
            {
                j = mid-1;
            }
            else{
                i = mid+1;
            }
        }
        return i;
    }
}
