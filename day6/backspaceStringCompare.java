package day6;
import java.util.*;
public class backspaceStringCompare {

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String st1 = sc.nextLine();
        String st2 = sc.nextLine();
        boolean stat = compare(st1,st2);
        System.out.println(stat);
        sc.close();
    }
    public static boolean compare(String str1, String str2)
    {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        for(char ch  : ch1)
        {
            if(ch=='#')
            {
                if(!st1.isEmpty())
                {
                    st1.pop();
                }
                continue;
            }
            st1.push(ch);
        }

        for(char ch : ch2)
        {
            if(ch=='#')
            {
                if(!st2.isEmpty())
                {
                    st2.pop();
                }
                continue;
            }
            st2.push(ch);
        }

        String res1 = "";
        String res2 = "";
        while(!st1.isEmpty())
        {
            res1+=st1.pop();
        }
        while(!st2.isEmpty())
        {
            res2+=st2.pop();
        }
        return res1.equals(res2);
    }
}
