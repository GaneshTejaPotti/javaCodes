package day10;
import java.util.*;
public class validPalindrome {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();
        boolean res = isPalindrome(ans);
        System.out.println(res);
        sc.close();
    }

    public static boolean isPalindrome(String s)
    {
        String res = "";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                res+=s.charAt(i);
            }
        }
        res = res.toLowerCase();
        System.out.println(res);
        int j=res.length()-1;
        for(int i=0;i<res.length()/2;i++)
        {
            if(res.charAt(i)!=res.charAt(j))
            {
                return false;
            }
            else{
                j--;
            }
        }
        return true;
    }
}
