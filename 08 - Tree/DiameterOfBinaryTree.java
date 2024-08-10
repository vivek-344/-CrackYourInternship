// 543. Diameter of Binary Tree
// https://leetcode.com/problems/diameter-of-binary-tree/
public class DiameterOfBinaryTree {

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

    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        countDiameter(root);
        return diameter;
    }
    int countDiameter(TreeNode node) {
        if(node == null) return 0;

        int leftHeight = countDiameter(node.left);
        int rightHeight = countDiameter(node.right);

        diameter = Math.max(diameter, leftHeight + rightHeight);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
