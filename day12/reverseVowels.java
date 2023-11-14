package day12;
import java.util.*;
public class reverseVowels {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = revVowels(s);
        System.out.println(ans);
        sc.close();
    }

    public static String revVowels(String s)
    {
        HashSet<Character> hs = new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        hs.add('A');
        hs.add('E');
        hs.add('I');
        hs.add('O');
        hs.add('U');
        int i=0, j=s.length()-1;
        char ch[] = s.toCharArray();
        while(i<j)
        {
            if(i<j && !hs.contains(ch[i]))
            {
                i++;
            }
            if(i<j && !hs.contains(ch[j]))
            {
                j--;
            }
            if(i<j && hs.contains(ch[i]) && hs.contains(ch[j]))
            {
                char c = ch[i];
                ch[i] = ch[j];
                ch[j] = c;
                i++;
                j--;
            }
        }
        return new String(ch);
    }
}
