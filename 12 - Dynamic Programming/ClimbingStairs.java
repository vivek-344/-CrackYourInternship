import java.util.HashMap;

// 70. Climbing Stairs
// https://leetcode.com/problems/climbing-stairs/
public class ClimbingStairs {
    public int climbStairs(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return climb(n, map);
    }
    int climb(int n, HashMap<Integer, Integer> memo) {
        if (n == 0 || n == 1) return 1;
        if (!memo.containsKey(n))
            memo.put(n, climb(n-1, memo) + climb(n-2, memo));
        return memo.get(n);
    }
}
