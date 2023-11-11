package day10;
import java.util.*;
public class firstUniqueCharacter {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int res = firstUniqChar(s);
        System.out.println(res);
        sc.close();
    }

    public static int firstUniqChar(String s)
    {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++)
        {
            if(hm.get(s.charAt(i))==1)
            {
                return i;
            }
        }
        return -1;
    }
}
