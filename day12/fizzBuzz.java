package day12;
import java.util.*;
public class fizzBuzz {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> ans = fizzBuzzList(n);
        System.out.println(ans);
        sc.close();
    }
    public static List<String> fizzBuzzList(int n)
    {
        List<String> ans = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                ans.add("FizzBuzz");
            }
            else if(i%3==0)
            {
                ans.add("Fizz");
            }
            else if(i%5==0)
            {
                ans.add("Buzz");
            }
            else{
                ans.add(""+i);
            }
        }
        return ans;
    }
}
