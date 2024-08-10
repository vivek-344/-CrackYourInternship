import java.util.ArrayList;

// Predecessor and Successor
// https://www.geeksforgeeks.org/problems/predecessor-and-successor/1
public class PredecessorAndSuccessor {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static ArrayList<Node> list;
    public static void findPreSuc(Node root, Node[] pre, Node[] suc, int key) {
        // code here.
        // update pre[0] with the predecessor of the key
        // update suc[0] with the successor of the key
        list = new ArrayList<>();
        traverse(root);
        list.sort((n1, n2) -> Integer.compare(n1.data, n2.data));
        int n = list.size();
        int i = 0;
        while(i < n && list.get(i).data < key) i++;
        if (i == n && i-1 >= 0) pre[0] = list.get(i-1);
        else if (list.get(i).data == key) {
            if (i-1 >= 0) pre[0] = list.get(i-1);
            if (i+1 < n) suc[0] = list.get(i+1);
        } else {
            if (i-1 >= 0) pre[0] = list.get(i-1);
            suc[0] = list.get(i);
        }
    }

    static void traverse(Node node) {
        if (node == null) return;

        traverse(node.left);
        list.add(node);
        traverse(node.right);
    }
}
