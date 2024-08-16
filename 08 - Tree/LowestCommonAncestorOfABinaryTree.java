import java.util.*;

// 236. Lowest Common Ancestor of a Binary Tree
// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
class LowestCommonAncestorOfABinaryTree {
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
    Deque<TreeNode> list = new ArrayDeque<>();
    Deque<TreeNode> l1 = new ArrayDeque<>();
    Deque<TreeNode> l2 = new ArrayDeque<>();
    int p, q;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.p = p.val;
        this.q = q.val;
        traverse(root);

        while (true) {
            TreeNode node = l1.removeFirst();
            l2.removeFirst();

            if (l1.peekFirst() != l2.peekFirst()) return node;
        }
    }
    void traverse(TreeNode node) {
        if (node == null) return;

        list.addLast(node);
        if (node.val == p) l1 = new ArrayDeque<>(list);
        if (node.val == q) l2 = new ArrayDeque<>(list);

        traverse(node.left);
        traverse(node.right);

        list.removeLast();
    }
}