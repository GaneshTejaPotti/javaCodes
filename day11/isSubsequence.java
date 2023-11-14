package day11;
import java.util.*;
public class isSubsequence {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        boolean res = isSubseq(s,t);
        System.out.println(res);
        sc.close();
    }
    public static boolean isSubseq(String s, String t)
    {
        int i=0, j=0;
        while(i<s.length() && j<t.length())
        {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
            }
            j++;
        }
        return i==s.length();
    }
}
