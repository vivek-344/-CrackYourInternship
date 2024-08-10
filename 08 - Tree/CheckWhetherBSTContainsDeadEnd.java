import java.util.*;

// Geeks for Geeks: Check whether BST contains Dead End
// https://www.geeksforgeeks.org/problems/check-whether-bst-contains-dead-end/1
public class CheckWhetherBSTContainsDeadEnd {

    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static HashSet<Integer> set;
    static HashSet<Integer> lastNode;

    public static boolean isDeadEnd(Node root)
    {
        set = new HashSet<>();
        lastNode = new HashSet<>();
        int val = root.data;
        traverse(root);
        for (Integer node: lastNode) {
            if (node == 1 && set.contains(2)) return true;
            if (set.contains(node - 1) && set.contains(node+1)) return true;
        }
        return false;
    }
    static void traverse(Node node) {
        if (node == null) return;
        if (node.left == null && node.right == null) lastNode.add(node.data);
        set.add(node.data);
        traverse(node.left);
        traverse(node.right);
    }
}
