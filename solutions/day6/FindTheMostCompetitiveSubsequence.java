package solutions.day6;

import java.util.Stack;

// 1673. Find the Most Competitive Subsequence
// https://leetcode.com/problems/find-the-most-competitive-subsequence/
public class FindTheMostCompetitiveSubsequence {
    public int[] mostCompetitive(int[] nums, int k) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++) {

            while(!stack.isEmpty() && nums[i] < stack.peek() && nums.length - i > k - stack.size())
                stack.pop();

            if (stack.size() < k)
                stack.push(nums[i]);
        }

        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--)
            res[i] = stack.pop();

        return res;
    }
}
