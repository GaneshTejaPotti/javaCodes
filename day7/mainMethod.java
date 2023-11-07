package day7;
import java.util.*;
public class mainMethod {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        methods m = new methods();
        TreeNode root = m.insert();
        //Binary Tree Levelorder Traversal
        m.printLevelOrder(root);

        //Binary Tree Inorder Traversal
        m.printInorder(root);
        System.out.println();

        //Binary Tree Preorder Traversal
        m.printPreorder(root);
        System.out.println();

        // Binary Tree Postorder Traversal
        m.printPostOrder(root);
        System.out.println();

        //Maximum Depth of Binary Tree
        int depth = m.maxDepth(root);
        System.out.println(depth);

        //Symmetric Tree
        boolean ans = m.isSymmetric(root);
        System.out.println(ans);

        //Invert Binary Tree
        TreeNode ans1 = m.invert(root);
        m.printLevelOrder(ans1);
        sc.close();
    }
}
