package day5;
import java.util.*;
public class mainMethod {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        mathods m = new mathods();
        for(int i=0;i<n;i++)
        {
            int node = sc.nextInt();
            int loc = sc.nextInt();
            m.insert(node, loc);
        }
        Node h = m.head;
        m.print(h);

        // Reverse method call(i.e, reverseLinkedList())
        // Node prev = m.reverseLinkedList();
        // m.print(prev);
        

        //Remove LinkedList elements.
        // int target = sc.nextInt();
        // Node temp = m.removeLinkedListElements(h,target);
        // m.print(h);

        //Remove Duplicates from Sorted List
        // Node temp = m.removeDuplicatesInSortedList(h);
        // m.print(temp);

        //Merge Two Sorted Lists
        // Node list2 = new Node(1);
        // Node l2_1 = new Node(4);
        // Node l2_2 = new Node(6);
        // list2.next = l2_1;
        // l2_1.next = l2_2;
        // Node temp = m.mergeTwoSortedLists(h, list2);
        // m.print(temp);

        //Middle of the Linked List
        // Node temp = m.middleNode(h);
        // m.print(temp);

        //Palindrome Linked List
        // boolean temp = m.palindromeLinkedList(h);
        // System.out.println(temp);

        sc.close();
    }
}
