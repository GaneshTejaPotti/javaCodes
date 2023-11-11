package day10;
import java.util.*;
public class longestCommonPrefix {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String strs[] = new String[n];
        for(int i=0;i<n;i++)
        {
            strs[i] = sc.next();
        }
        String res = longCommonPrefix(strs);
        System.out.println(res);
        sc.close();
    }

    public static String longCommonPrefix(String [] strs)
    {
        if(strs == null || strs.length==0)
        {
            return "";
        }
        String res = strs[0];
        for(String s : strs)
        {
            while(s.indexOf(res)!=0)
            {
                res = res.substring(0, res.length()-1);
            }
        }
        return res;
    }
}
