import java.util.*;

// 1642. Furthest Building You Can Reach
// https://leetcode.com/problems/furthest-building-you-can-reach/
public class FurthestBuildingYouCanReach {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        if (heights.length == 1) return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int i = 0;
        while (i < heights.length-1) {
            int diff = heights[i+1] - heights[i];
            if (bricks < diff && ladders < 1) break;
            else if (diff <= 0) i++;
            else if (diff <= bricks) {
                bricks -= diff;
                pq.add(diff);
                i++;
            } else if (pq.isEmpty() && ladders > 0) {
                ladders--;
                i++;
            } else if (!pq.isEmpty() && pq.peek() <= diff && ladders > 0) {
                ladders--;
                i++;
            }
            else if (pq.isEmpty()) break;
            else {
                bricks += pq.poll();
                ladders--;
            }
        }
        return i;
    }
}
