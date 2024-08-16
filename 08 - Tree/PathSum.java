import java.util.HashSet;

// 112. Path Sum
// https://leetcode.com/problems/path-sum/
class PathSum {
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

    HashSet<Integer> set = new HashSet<>();
    int sum = 0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        traverse (root);
        return set.contains(targetSum);
    }
    void traverse (TreeNode node) {
        if (node == null) return;

        sum += node.val;
        if (node.left == null && node.right == null) set.add(sum);

        traverse(node.left);
        traverse(node.right);

        sum -= node.val;
    }
}