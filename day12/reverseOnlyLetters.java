package day12;
import java.util.*;
public class reverseOnlyLetters {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = revOnlyLetters(s);
        System.out.println(ans);
        sc.close();
    }

    public static String revOnlyLetters(String s)
    {
        int i=0,j=s.length()-1;
        char ch[] = s.toCharArray();
        while(i<j)
        {
            if(Character.isLetter(ch[i]) && Character.isLetter(ch[j]))
            {
                char c = ch[i];
                ch[i] = ch[j];
                ch[j] = c;
                i++;
                j--;
            }
            if(!Character.isLetter(ch[i]))
            {
                i++;
            }
            if(!Character.isLetter(ch[j]))
            {
                j--;
            }
        }
        return new String(ch);
    }
}
