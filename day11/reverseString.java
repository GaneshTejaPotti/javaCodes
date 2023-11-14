package day11;
import java.util.*;
public class reverseString {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] ch = new char[n];
        for(int i=0;i<n;i++)
        {
            ch[i] = sc.next().charAt(0);
        }
        revStr(ch);
        for(char c : ch)
        {
            System.out.print(c+" ");
        }
        sc.close();
    }

    public static void revStr(char [] ch)
    {
        int j = ch.length-1;
        for(int i=0;i<ch.length/2;i++)
        {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            j--;
        }
    }
}
