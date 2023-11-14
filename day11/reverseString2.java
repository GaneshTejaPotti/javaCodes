package day11;
import java.util.*;
public class reverseString2 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        String ans = revStr2(s,k);
        System.out.println(ans);
        sc.close();
    }

    public static String revStr2(String s, int k)
    {
        char ch[] = s.toCharArray();
        int i=0;
        while(i<s.length())
        {
            int j = Math.min(i+k-1,s.length()-1);
            reverse(ch,i,j);
            i = i+2*k;
        }
        String ans = new String(ch);
        return ans;
    }

    public static void reverse(char[] ch, int i, int j)
    {
        while(i<j)
        {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
    }
}
