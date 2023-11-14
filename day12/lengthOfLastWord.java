package day12;
import java.util.*;
public class lengthOfLastWord {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = lenOfLastWord(s);
        System.out.println(len);
        sc.close();
    }

    public static int lenOfLastWord(String s)
    {
        int len=0;
        s = s.trim();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
                return len;
            }
            len++;
        }
        return len;
    }
}
