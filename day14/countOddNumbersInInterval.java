package day14;
import java.util.*;
public class countOddNumbersInInterval {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int ans = countOdds(n1,n2);
        System.out.println(ans);
        sc.close();
    }

    public static int countOdds(int n1, int n2)
    {
        if(n1%2==0 && n2%2==0)
        {
            return (n2-n1)/2;
        }
        else{
            return (n2-n1)/2+1;
        }
    }
}