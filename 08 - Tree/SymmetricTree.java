// 101. Symmetric Tree
// https://leetcode.com/problems/symmetric-tree/
public class SymmetricTree {
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

    public boolean isSymmetric(TreeNode root) {
        return traverse(root.left, root.right);
    }
    boolean traverse (TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        else if (left == null || right == null) return false;
        if (left.val != right.val) return false;

        return traverse(left.left, right.right) && traverse(left.right, right.left);
    }
}
