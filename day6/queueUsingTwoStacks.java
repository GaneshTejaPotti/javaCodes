package day6;
import java.util.*;
public class queueUsingTwoStacks {
    static Stack<Integer> st1;
    static Stack<Integer> st2;
    public queueUsingTwoStacks()
    {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    public void insert(int data)
    {
        if(st1.isEmpty())
        {
            st1.push(data);
            return;
        }
        while(!st1.isEmpty())
        {
            st2.push(st1.pop());
        }
        st1.push(data);
        while(!st2.isEmpty())
        {
            st1.push(st2.pop());
        }
    }

    public int pop()
    {
        return st1.pop();
    }

    public int peek()
    {
        return st1.peek();
    }

    public boolean Empty()
    {
        return st1.isEmpty() && st2.isEmpty();
    }
}
