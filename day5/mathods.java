package day5;

public class mathods {
    Node head;
    int size;
    
    // Insertion
    public void insert(int data, int loc)
    {
        if(head==null)
        {
            createLinkedList(data);
        }
        else if(loc==0)
        {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
        else if(loc>size)
        {
            Node newNode = new Node(data);
            Node temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        else
        {
            Node newNode = new Node(data);
            Node temp = head;
            int i=0;
            while(i<loc-1)
            {
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        size++;
    }

    public void createLinkedList(int data)
    {
        Node newNode = new Node(data);
        head = newNode;
    }

    // Printing
    public void print(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    //Reverse Linked List
    public Node reverseLinkedList()
    {
        Node prev = null;
        Node curr = head;
        while(curr!=null)
        {
            Node ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
    }

    // Remove Linked List Elements
    public Node removeLinkedListElements(Node head, int target)
    {
        if(head==null)
        {
            return null;
        }
        Node temp = head;
        while(head!=null && head.data == target)
        {
            head = head.next;
            if(head==null)
            {
                return null;
            }
        }
        while(temp!=null && temp.next!=null)
        {
            if(temp.next.data==target)
            {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return head;
    }

    //Remove Duplicates from Sorted List
    public Node removeDuplicatesInSortedList(Node head)
    {
        Node temp = head;
        while(temp!=null && temp.next!=null)
        {
            if(temp.data == temp.next.data)
            {
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }

    //Merge Two Sorted Lists
    public Node mergeTwoSortedLists(Node head1, Node head2)
    {
        Node dummy = new Node(0);
        Node temp = dummy;
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.data < temp2.data)
            {
                temp.next = temp1;
                temp1 = temp1.next;
                temp = temp.next;
            }
            else{
                temp.next = temp2;
                temp2 = temp2.next;
                temp = temp.next;
            }
        }
        if(temp1!=null)
        {
            temp.next = temp1;
        }
        if(temp2!=null)
        {
            temp.next = temp2;
        }
        return dummy.next;
    }

    //Middle of the Linked List
    public Node middleNode(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //Palindrome Linked List
    public boolean palindromeLinkedList(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node curr = slow.next;
        slow.next = null;
        while(curr!=null)
        {
            Node ahead = curr.next;
            curr.next = slow;
            slow = curr;
            curr = ahead;
        }
        fast = head;
        while(slow!=null)
        {
            if(slow.data!=fast.data)
            {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
    
}
