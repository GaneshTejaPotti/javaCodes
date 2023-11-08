package day8;
import java.util.*;
public class methods {
    
    public TreeNode insert()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root Data: ");
        int rootNode = sc.nextInt();
        TreeNode root = new TreeNode(rootNode);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode temp = q.poll();
            System.out.println("Enter left node of "+temp.data+": ");
            int l = sc.nextInt();
            if(l!=-1)
            {
                TreeNode le = new TreeNode(l);
                temp.left = le;
                q.add(le);
            }
            System.out.println("Enter right node of "+temp.data+": ");
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

    // Subtree of Another Tree
    public boolean subTree(TreeNode root, TreeNode subroot)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==subroot.data)
        {
            if(isIdentical(root,subroot))
            {
                return true;
            }
        }
        return subTree(root.left, subroot) || subTree(root.right,subroot);
    }

    public boolean isIdentical(TreeNode root, TreeNode subroot)
    {
        if(root==null && subroot==null)
        {
            return true;
        }
        else if(root==null || subroot==null || root.data!=subroot.data)
        {
            return false;
        }
        if(!isIdentical(root.left, subroot.left))
        {
            return false;
        }
        if(!isIdentical(root.right, subroot.right))
        {
            return false;
        }
        return true;
    }

    //Diameter of Binary Tree
    public int diameter(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);
        int diameter = Math.max(leftDiameter,Math.max(rightDiameter,leftHeight+rightHeight));
        return diameter;
    }

    public int height(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left,right)+1;
    }

    //Balanced Binary Tree
    public boolean isBalanced(TreeNode root)
    {
        int left = height(root.left);
        int right = height(root.right);
        if(!(Math.abs(right-left)<=1))
        {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    //Merge Two Binary Trees
    public TreeNode mergeBinaryTrees(TreeNode root1, TreeNode root2)
    {
        if(root1==null && root2==null)
        {
            return null;
        }
        if(root1==null)
        {
            return root2;
        }
        if(root2==null)
        {
            return root1;
        }
        TreeNode sum = new TreeNode(root1.data+root2.data);
        sum.left = mergeBinaryTrees(root1.left, root2.left);
        sum.right = mergeBinaryTrees(root1.right, root2.right);
        return sum;
    }

    //Same Tree
    public boolean isSameTree(TreeNode node1, TreeNode node2)
    {
        if(node1==null && node2==null)
        {
            return true;
        }
        if(node1==null || node2==null || node1.data!=node2.data)
        {
            return false;
        }
        return isSameTree(node1.left,node2.left) && isSameTree(node1.right,node2.right);
    }



}
