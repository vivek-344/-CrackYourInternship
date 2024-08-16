import java.util.ArrayList;
import java.util.List;

// 257. Binary Tree Paths
// https://leetcode.com/problems/binary-tree-paths/
class BinaryTreePaths {
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
    ArrayList<String> list;
    public List<String> binaryTreePaths(TreeNode root) {
        list = new ArrayList<String>();
        StringBuilder str = new StringBuilder();
        traverse(root, str);
        return list;
    }
    void traverse(TreeNode node, StringBuilder pre) {
        if (node == null) return;

        int len = pre.length();
        if (len > 0) pre.append("->").append(node.val);
        else pre.append(node.val);
        if (node.left == null && node.right == null) list.add(pre.toString());

        traverse(node.left, pre);
        traverse(node.right, pre);

        pre.setLength(len);
    }
}