package day10;
import java.util.*;
public class validAnagram {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        boolean res = isAnagrams(s,t);
        System.out.println(res);
        sc.close();
    }

    public static boolean isAnagrams(String s, String t)
    {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        if(ch1.length!=ch2.length)
        {
            return false;
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0;i<ch1.length;i++)
        {
            if(ch1[i]!=ch2[i])
            {
                return false;
            }
        }
        return true;
    }
}
