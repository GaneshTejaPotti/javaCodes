package day11;
import java.util.*;
public class removeAdjacentDuplicatesInString {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = removeDuplicates(s);
        System.out.println(ans);
        sc.close();
    }

    public static String removeDuplicates(String s)
    {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(!st.isEmpty() && st.peek()==s.charAt(i))
            {
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        String ans = "";
        for(char c : st)
        {
            ans+=c;
        }
        return ans;
    }
}
