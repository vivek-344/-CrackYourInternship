package solutions.day2;

import java.util.*;

// 1. Two Sum
// https://leetcode.com/problems/two-sum/
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]))
                return new int[]{i, map.get(target - nums[i])};
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
