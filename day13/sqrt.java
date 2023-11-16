package day13;
import java.util.*;
public class sqrt {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sqrtNum(n));
        sc.close();
    }

    public static int sqrtNum(int n)
    {
        return (int)Math.sqrt(n);
    }
}
