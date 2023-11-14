package day12;
import java.util.*;
public class addStrings {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        String ans = addString(s,t);
        System.out.println(ans);
        sc.close();
    }

    public static String addString(String s, String t)
    {
        StringBuilder sb = new StringBuilder();
        int carry=0, sum=0;
        int i = s.length()-1, j = t.length()-1;
        while(i>=0 || j>=0 || carry>0)
        {
            int dig1=0, dig2=0;
            if(i>=0)
            {
                dig1 = s.charAt(i)-'0';
            }
            if(j>=0)
            {
                dig2 = t.charAt(j)-'0';
            }
            sum = dig1+dig2+carry;
            sb.append(sum%10);
            carry = sum/10;
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}
