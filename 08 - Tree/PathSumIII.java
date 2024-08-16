import java.util.HashMap;

// 437. Path Sum III
// https://leetcode.com/problems/path-sum-iii/
class PathSumIII {
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

    HashMap<Long, Integer> map = new HashMap<>();
    int count = 0, t;
    long sum = 0;

    public int pathSum(TreeNode root, int targetSum) {
        map.put(0L, 1);
        t = targetSum;
        traverse(root);
        return count;
    }

    void traverse(TreeNode node) {
        if (node == null) return;

        sum += node.val;
        count += map.getOrDefault(sum - t, 0);
        map.put(sum, map.getOrDefault(sum, 0) + 1);

        traverse(node.left);
        traverse(node.right);

        map.put(sum, map.get(sum) - 1);
        sum -= node.val;
    }
}