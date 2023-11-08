package day8;
//import java.util.*;
public class mainMethod {
    public static void main(String [] args)
    {
        //Scanner sc = new Scanner(System.in);
        methods m = new methods();
        TreeNode root = m.insert();
        //m.printLevelOrder(root);

        //Subtree of Another Tree
        // TreeNode subroot = new TreeNode(4);
        // subroot.left = new TreeNode(1);
        // subroot.right = new TreeNode(2);
        // boolean ans = m.subTree(root, subroot);
        // System.out.println(ans);

        //Diameter of Binary Tree
        // int diameter = m.diameter(root);
        // System.out.println(diameter);

        //Balanced Binary Tree
        // boolean isBal = m.isBalanced(root);
        // System.out.println(isBal);

        // Merge Two Binary Trees
        // TreeNode root2 = new TreeNode(1);
        // root2.left = new TreeNode(2);
        // root2.right = new TreeNode(3);
        // TreeNode ans = m.mergeBinaryTrees(root, root2);
        // m.printLevelOrder(ans);

        //Same Tree
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        boolean ans = m.isSameTree(root,root2);
        System.out.println(ans);
        //sc.close();
    }
}
