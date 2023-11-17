package day14;
import java.util.*;
public class excelSheetColumnNumber {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(excelColNum(st));
        sc.close();
    }

    public static int excelColNum(String st)
    {
        int res=0,cnt=0;
        for(int i=st.length()-1;i>=0;i--)
        {
            char ch = st.charAt(i);
            res = res+(int)Math.pow(26,cnt)*(ch-'A'+1);
            cnt++;
        }
        return res;
    }
}
