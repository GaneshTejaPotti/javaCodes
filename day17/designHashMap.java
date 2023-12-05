package day17;
import java.util.*;
public class designHashMap {
    int[] arr;
    public designHashMap()
    {
        arr = new int[1000001];
        Arrays.fill(arr,-1);
    }
    public void insert(int key, int value)
    {
        arr[key] = value;
    }

    public int get(int key)
    {
        return arr[key];
    }

    public void remove(int key)
    {
        arr[key] = -1;
    }

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        designHashMap d = new designHashMap();
        for(int i=0;i<n;i++)
        {
            d.insert(sc.nextInt(), sc.nextInt());
        }
        System.out.println(d.get(3));
        sc.close();
    }
}
