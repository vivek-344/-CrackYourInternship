import java.util.*;

// Geeks for Geeks: Chocolate Distribution Problem
// https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1
public class ChocolateDistributionProblem {
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        int start = 0, end = m - 1;
        int min = Integer.MAX_VALUE;
        while (end < n) {
            min = Math.min(min, a.get(end) - a.get(start));
            end++;
            start++;
        }
        return min;
    }
}
