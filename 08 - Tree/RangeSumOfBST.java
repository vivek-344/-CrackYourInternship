// 938. Range Sum of BST
// https://leetcode.com/problems/range-sum-of-bst/
public class RangeSumOfBST {

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
    int l, h;
    public int rangeSumBST(TreeNode root, int low, int high) {
        this.l = low;
        this.h = high;
        traverse(root);
        return sum;
    }
    void traverse(TreeNode node) {
        if (node == null) return;

        if (node.val >= l && node.val <= h) sum += node.val;

        traverse(node.left);
        traverse(node.right);
    }
}
