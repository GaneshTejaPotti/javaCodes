package day17;
import java.util.*;
public class jewelAndStone {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String st1 = sc.nextLine();
        String st2 = sc.nextLine();
        int res = numJewelInStones(st1,st2);
        System.out.println(res);
        sc.close();
    }

    public static int numJewelInStones(String st1, String st2)
    {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<st2.length();i++)
        {
            hm.put(st2.charAt(i),hm.getOrDefault(st2.charAt(i),0)+1);
        }
        int res = 0;
        for(int i=0;i<st1.length();i++)
        {
            if(hm.containsKey(st1.charAt(i)))
            {
                res = res+hm.get(st1.charAt(i));
                hm.put(st1.charAt(i),0);
            }
        }
        return res;
    }
}
