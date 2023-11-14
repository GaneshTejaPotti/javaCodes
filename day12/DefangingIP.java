package day12;
import java.util.*;
public class DefangingIP {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = defangIPaddr(s);
        System.out.println(ans);
        sc.close();
    }

    public static String defangIPaddr(String s)
    {
        return s.replace(".","[.]");
    }
}
