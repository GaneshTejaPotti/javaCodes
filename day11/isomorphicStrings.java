package day11;
import java.util.*;
public class isomorphicStrings {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        boolean ans = isIsomorphic(s,t);
        System.out.println(ans);
        sc.close();
    }

    public static boolean isIsomorphic(String s, String t)
    {
        HashMap<Character,Integer> hm1 = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(hm1.put(s.charAt(i),i)!=hm2.put(t.charAt(i),i))
            {
                return false;
            }
        }
        return true;
    }
}
