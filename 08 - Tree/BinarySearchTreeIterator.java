import java.util.LinkedList;
import java.util.Queue;

// 173. Binary Search Tree Iterator
// https://leetcode.com/problems/binary-search-tree-iterator/
public class BinarySearchTreeIterator {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    Queue<Integer> queue = new LinkedList<>();

    public BinarySearchTreeIterator(TreeNode root) {
        traverse(root);
    }

    void traverse(TreeNode node) {
        if (node == null) return;

        traverse(node.left);
        queue.add(node.val);
        traverse(node.right);
    }

    public int next() {
        return queue.remove();
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }
}
