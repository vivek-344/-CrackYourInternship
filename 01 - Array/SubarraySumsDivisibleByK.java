import java.util.*;

// 974. Subarray Sums Divisible by K
// https://leetcode.com/problems/subarray-sums-divisible-by-k/
public class SubarraySumsDivisibleByK {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int total = 0, count = 0;
        for (int num: nums) {
            total += num;
            int remainder = total % k;
            if (remainder < 0)
                remainder += k;
            count += map.getOrDefault(remainder, 0);
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }
        return count;
    }
}
