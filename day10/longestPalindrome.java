package day10;
import java.util.*;
public class longestPalindrome {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int res = longPalindrome(s);
        System.out.println(res);
        sc.close();
    }

    public static int longPalindrome(String s)
    {
        int len = 0;
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            if(hs.contains(s.charAt(i)))
            {
                hs.remove(s.charAt(i));
                len+=2;
            }
            else{
                hs.add(s.charAt(i));
            }
        }
        return (hs.size()>0) ? len+1: len;
    }
}
