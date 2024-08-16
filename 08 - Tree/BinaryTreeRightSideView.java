import java.util.ArrayList;
import java.util.List;

// 199. Binary Tree Right Side View
// https://leetcode.com/problems/binary-tree-right-side-view/
class BinaryTreeRightSideView {

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

    ArrayList<Integer> list = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        traverse(root, 0);
        return list;
    }
    void traverse(TreeNode node, int level) {
        if (node == null) return;

        if (list.size() == level) list.add(0);
        list.set(level, node.val);

        traverse(node.left, level + 1);
        traverse(node.right, level + 1);
    }
}