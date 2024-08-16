import java.util.ArrayList;
import java.util.List;

// 102. Binary Tree Level Order Traversal
// https://leetcode.com/problems/binary-tree-level-order-traversal/
class BinaryTreeLevelOrderTraversal {
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

    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        traverse(root, 0);
        return list;
    }
    void traverse (TreeNode node, int level) {
        if (node == null) return;

        if (list.size() == level) list.add(new ArrayList<>());
        list.get(level).add(node.val);

        traverse(node.left, level+1);
        traverse(node.right, level+1);
    }
}