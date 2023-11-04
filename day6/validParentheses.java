package day6;
import java.util.*;
class day6{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean v = valid(str);
        System.out.println(v);
        sc.close();
    }

    public static boolean valid(String str)
    {
        Stack<Character> st = new Stack<>();
        char [] ch = str.toCharArray();
        for(char c : ch)
        {
            if(c=='(')
            {
                st.push(')');
            }
            else if(c=='[')
            {
                st.push(']');
            }
            else if(c=='{')
            {
                st.push('}');
            }
            else if(st.isEmpty() || st.pop()!=c){
                return false;
            }
        }
        return st.isEmpty();
    }
}