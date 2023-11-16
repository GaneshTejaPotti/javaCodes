package day13;
import java.util.*;
public class palindromeNumber {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPalindrome(n);
        System.out.println(ans);
        sc.close();
    }

    public static boolean isPalindrome(int n)
    {
        if(n<0)
        {
            return false;
        }
        int x = n,sum=0;
        while(x>0)
        {
            int rem = x%10;
            sum = sum*10+rem;
            x = x/10; 
        }
        return sum==n;
    }
}
