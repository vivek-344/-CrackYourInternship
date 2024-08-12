// 303. Range Sum Query - Immutable
// https://leetcode.com/problems/range-sum-query-immutable/
public class RangeSumQueryImmutable {
    class NumArray {

        int[] arr;

        public NumArray(int[] nums) {
            int n = nums.length;
            arr = new int[n+1];
            arr[0] = 0;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += nums[i];
                arr[i+1] = sum;
            }
        }

        public int sumRange(int left, int right) {
            return (arr[right+1] - arr[left]);
        }
    }
}
