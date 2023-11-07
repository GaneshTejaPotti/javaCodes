package day7;
import java.util.*;
public class methods {
     
    public TreeNode insert()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root data: ");
        int rootData = sc.nextInt();
        if(rootData==-1)
        {
            sc.close();
            return null;
        }
        TreeNode root = new TreeNode(rootData);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode temp = q.poll();
            System.out.println("Enter left data: ");
            int l = sc.nextInt();
            if(l!=-1)
            {
                TreeNode le = new TreeNode(l);
                temp.left = le;
                q.add(le);
            }
            System.out.println("Enter right data: ");
            int r = sc.nextInt();
            if(r!=-1)
            {
                TreeNode ri = new TreeNode(r);
                temp.right = ri;
                q.add(ri);
            }
        }
        sc.close();
        return root;
    }

    public void printLevelOrder(TreeNode root)
    {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode temp = q.poll();
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
                System.out.print(temp.data+" ");
            }
            System.out.println();
        }
    }

    public void printInorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        printInorder(root.left);
        System.out.print(root.data+" ");
        printInorder(root.right);
    }

    public void printPreorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    public void printPostOrder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.data+" ");
    }

    public int maxDepth(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right)+1;
    }

    public boolean isSymmetric(TreeNode root)
    {
        if(root==null)
        {
            return true;
        }
        boolean ans = helperSymmetric(root.left,root.right);
        return ans;
    }

    public boolean helperSymmetric(TreeNode node1, TreeNode node2)
    {
        if(node1==null && node2==null)
        {
            return true;
        }
        if(node1==null || node2==null || node1.data!=node2.data)
        {
            return false;
        }
        return helperSymmetric(node1.left, node2.right) && helperSymmetric(node1.right, node2.left);
    }

    public TreeNode invert(TreeNode root)
    {
        helperInvert(root);
        return root;
    }

    public void helperInvert(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        helperInvert(root.left);
        helperInvert(root.right);
    }



}
