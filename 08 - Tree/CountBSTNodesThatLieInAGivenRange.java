import java.util.HashSet;

// Geeks for Geeks: Count BST nodes that lie in a given range
// https://www.geeksforgeeks.org/problems/count-bst-nodes-that-lie-in-a-given-range/1
public class CountBSTNodesThatLieInAGivenRange {
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
    int getCount(Node root,int l, int h)
    {
        HashSet<Node> set = new HashSet<>();
        return traverse (set, 0, root, l , h);
    }
    int traverse(HashSet<Node> set, int count, Node root, int l, int h) {
        if (root == null) return count;
        if (set.add(root) && root.data >= l && root.data <= h) count++;
        count = traverse(set, count, root.left, l, h);
        count = traverse(set, count, root.right, l, h);
        return count;
    }
}
