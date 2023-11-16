package day13;
import java.util.*;
public class plusOne {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digits[] = new int[n];
        for(int i=0;i<n;i++)
        {
            digits[i] = sc.nextInt();
        }
        int ans[] = plusOneNum(digits);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]);
        }
        sc.close();
    }

    public static int[] plusOneNum(int[] digits)
    {
        int i = digits.length-1;
        while(i>=0)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
            i--;
        }
        int ans[] = new int[digits.length+1];
        ans[0] = 1;
        return ans;
    }
}
