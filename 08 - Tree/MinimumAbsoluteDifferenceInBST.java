import java.util.ArrayList;
import java.util.Collections;

// 530. Minimum Absolute Difference in BST
// https://leetcode.com/problems/minimum-absolute-difference-in-bst/
public class MinimumAbsoluteDifferenceInBST {
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
    ArrayList<Integer> list;
    public int getMinimumDifference(TreeNode root) {
        list = new ArrayList<>();
        traverse(root);
        Collections.sort(list);
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < list.size(); i++) {
            min = Math.min(min, list.get(i) - list.get(i-1));
        }
        return min;
    }

    void traverse(TreeNode node) {
        if (node == null) return;

        list.add(node.val);

        traverse(node.left);
        traverse(node.right);
    }
}
