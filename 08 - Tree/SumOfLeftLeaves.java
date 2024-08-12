// 404. Sum of Left Leaves
// https://leetcode.com/problems/sum-of-left-leaves/
public class SumOfLeftLeaves {

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

    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        traverse(root);
        return sum;
    }

    void traverse(TreeNode node) {
        if (node == null) return;

        sum += node != null ? node.left != null && node.left.left == null && node.left.right == null ? node.left.val : 0 : 0;

        traverse(node.left);
        traverse(node.right);
    }
}
