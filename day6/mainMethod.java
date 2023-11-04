package day6;
import java.util.*;
public class mainMethod {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        methods m = new methods();
        for(int i=0;i<n;i++)
        {
            int node = sc.nextInt();
            int loc = sc.nextInt();
            m.insert(node,loc);
        }
        Node h = m.head;
        m.print(h);

        //Intersection of Two Linked Lists (0->1->2->4->6->7 && 3->5->4->cont...)

        // Node newList1 = new Node(0);
        // newList1.next = new Node(1);
        // newList1.next.next = new Node(2);
        // newList1.next.next.next = new Node(4);
        // newList1.next.next.next.next = new Node(6);
        // newList1.next.next.next.next.next = new Node(7);   

        // Node newList2 = new Node(3);
        // newList2.next = new Node(5);
        // newList2.next.next = newList1.next.next.next;

        // int pt = m.intersection(newList1, newList2);
        // System.out.println(pt);


        // Linked List Cycle
        // Node newList1 = new Node(0);
        // newList1.next = new Node(1);
        // newList1.next.next = new Node(2);
        // newList1.next.next.next = new Node(4);
        // newList1.next.next.next.next = new Node(6);
        // newList1.next.next.next.next.next = new Node(7); 
        // newList1.next.next.next.next.next.next  = newList1.next.next;

        // boolean stat = m.cycle(newList1);
        // System.out.print(stat);

        sc.close();
    }
}
