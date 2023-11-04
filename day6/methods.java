package day6;

public class methods {
    Node head;
    int size;

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
        else{
            Node newNode = new Node(data);
            Node temp = head;
            for(int i=0;i<loc-1;i++)
            {
                temp = temp.next;
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

    public void print(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public int intersection(Node headA, Node headB)
    {
        Node a = headA;
        Node b = headB;
        while(a!=b)
        {
            if(a!=null)
            {
                a = a.next;
            }
            else{
                a = headB;
            }
            if(b!=null)
            {
                b = b.next;
            }
            else{
                b = headA;
            }
        }
        return a.data;
    }

    public boolean cycle(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }

}
