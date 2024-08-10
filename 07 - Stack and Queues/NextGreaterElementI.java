import java.util.*;

// 496. Next Greater Element I
// https://leetcode.com/problems/next-greater-element-i/
public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int num: nums2) {
            if (stack.isEmpty() || stack.peek() > num)
                stack.push(num);
            else {
                while (!stack.isEmpty() && stack.peek() < num)
                    map.put(stack.pop(), num);
                stack.push(num);
            }
        }
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = map.getOrDefault(nums1[i], -1);
        }
        return res;
    }
}
