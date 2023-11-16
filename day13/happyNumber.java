package day13;
import java.util.*;
public class happyNumber {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isHappy(n);
        System.out.println(ans);
        sc.close();
    }

    public static boolean isHappy(int n)
    {
        HashSet<Integer> hs = new HashSet<>();
        while(hs.add(n))
        {
            int tot=0;
            while(n>0)
            {
                tot = tot+(n%10)*(n%10);
                n=n/10;
            }
            if(tot==1)
            {
                return true;
            }
            else{
                n=tot;
            }
        }
        return false;
    }
}
