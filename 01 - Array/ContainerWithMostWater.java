// 11. Container With Most Water
// https://leetcode.com/problems/container-with-most-water/
public class ContainerWithMostWater {
    public int maxArea(int[] h) {
        int start = 0, end = h.length - 1, max = 0;
        while (start < end) {
            max = Math.max(max, Math.min(h[start], h[end])*(end-start));
            if(h[start] > h[end]) end--;
            else start++;
        }
        return max;
    }
}
