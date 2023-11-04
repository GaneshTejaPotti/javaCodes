package day6;

import java.util.Scanner;

public class mainMethod2 {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        queueUsingTwoStacks q = new queueUsingTwoStacks();
        for(int i=0;i<n;i++)
        {
            int data = sc.nextInt();
            q.insert(data);
        }
        System.out.println(q.pop());
        System.out.println(q.peek());
        System.out.println(q.Empty());
        sc.close();
    }
}
