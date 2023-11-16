package day13;
import java.util.*;
public class powerOfTwo {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPowerOfTwo(n));
        sc.close();
    }

    public static boolean isPowerOfTwo(int n)
    {
        while(n>=2)
        {
            if(n%2!=0)
            {
                return false;
            }
            n=n/2;
        }
        return n==1;
    }
}
