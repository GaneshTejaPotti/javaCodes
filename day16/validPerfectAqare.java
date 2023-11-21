package day16;
import java.util.*;
public class validPerfectAqare {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(isValidPerfectsquare(num));
        sc.close();
    }

    public static boolean isValidPerfectsquare(int num)
    {
        if(num==1)
        {
            return true;
        }
        int i=2, j=num;
        while(i<j)
        {
            int mid = i+(j-i)/2;
            if(mid*mid==num)
            {
                return true;
            }
            else if(mid*mid>num)
            {
                j = mid;
            }
            else{
                i = mid+1;
            }
        }
        return false;
    }
}
