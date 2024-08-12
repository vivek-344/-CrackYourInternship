import java.util.Arrays;

// 435. Non-overlapping Intervals
// https://leetcode.com/problems/non-overlapping-intervals/
class NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int count = 0;
        int prev = intervals[0][1];
        for (int i = 1; i < n; i++)
            if (prev > intervals[i][0]) count++;
            else prev = intervals[i][1];
        return count;
    }
}