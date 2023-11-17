package day14;
import java.util.*;
public class rectangleOverlap {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int rec1[] = new int[4];
        int rec2[] = new int[4];
        // [x1,y1,x2,y2]
        for(int i=0;i<rec1.length;i++)
        {
            rec1[i] = sc.nextInt();
        }
        for(int i=0;i<rec2.length;i++)
        {
            rec2[i] = sc.nextInt();
        }
        System.out.println(isRectangleOverlap(rec1,rec2));
        sc.close();
    }

    public static boolean isRectangleOverlap(int [] rec1, int [] rec2)
    {
        return rec1[0]<rec2[2] && rec1[1]<rec2[3] && rec1[2]>rec2[0] && rec1[3]>rec2[1];
    }
}

/*
Example 1:

Input: rec1 = [0,0,2,2], rec2 = [1,1,3,3]
Output: true
Example 2:

Input: rec1 = [0,0,1,1], rec2 = [1,0,2,1]
Output: false
 */
