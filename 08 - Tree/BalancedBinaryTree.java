// 110. Balanced Binary Tree
// https://leetcode.com/problems/balanced-binary-tree/
class BalancedBinaryTree {
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

    boolean isBal = true;
    public boolean isBalanced(TreeNode root) {
        traverse(root);
        return isBal;
    }
    int traverse(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = traverse(node.left);
        int rightHeight = traverse(node.right);

        if (Math.abs(leftHeight - rightHeight) > 1) isBal = false;

        return Math.max(leftHeight, rightHeight) + 1;
    }
}