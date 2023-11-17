package day14;
import java.util.*;
public class addDigits {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(addDig(n));
        sc.close();
    }

    public static int addDig(int num)
    {
        HashSet<Integer> hs = new HashSet<>();
        while(hs.add(num))
        {
            int sum = 0;
            while(num>0)
            {
                int rem = num%10;
                sum = sum+rem;
                num = num/10;
            }
            if(sum<9)
            {
                return sum;
            }
            else{
                num = sum;
            }
        }
        return num;
    }
}
