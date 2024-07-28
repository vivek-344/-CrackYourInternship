package solutions.day4;

import java.util.Arrays;

// 462. Minimum Moves to Equal Array Elements II
// https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/
public class MinimumMovesToEqualArrayElementsII {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median = nums[nums.length / 2];

        int count = 0;
        for (int num : nums)
            count += Math.abs(num - median);

        return count;
    }
}
