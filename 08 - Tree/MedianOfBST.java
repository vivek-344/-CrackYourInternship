import java.util.*;

// Geeks for Geeks: Median of BST
// https://www.geeksforgeeks.org/problems/median-of-bst/1
public class MedianOfBST {

    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }

    public static float findMedian(Node root)
    {
        HashSet<Node> set = new HashSet<>();
        traverse(set, root);
        ArrayList<Integer> list = new ArrayList<>();
        for(Node node: set)
            list.add(node.data);
        Collections.sort(list);
        int n = list.size();
        if (n%2 == 1) return list.get(n/2);
        return (list.get(n/2) + list.get((n/2)-1))/2.0f;
    }
    static void traverse(HashSet<Node> set, Node root) {
        if (root == null) return;
        set.add(root);
        traverse(set, root.left);
        traverse(set, root.right);
    }
}
