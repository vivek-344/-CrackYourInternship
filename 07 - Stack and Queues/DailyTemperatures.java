import java.util.*;

// 739. Daily Temperatures
// https://leetcode.com/problems/daily-temperatures/
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] t) {
        int n = t.length;
        int[] res = new int[n];
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty() || stack.peek()[0] > t[i]) stack.push(new int[]{t[i], i});
            else {
                while (!stack.isEmpty() && stack.peek()[0] < t[i]) {
                    int[] curr = stack.pop();
                    res[curr[1]] = i - curr[1];
                }
                stack.push(new int[]{t[i], i});
            }
        }
        return res;
    }
}
