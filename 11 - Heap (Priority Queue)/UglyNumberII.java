import java.util.*;

// 264. Ugly Number II
// https://leetcode.com/problems/ugly-number-ii/
public class UglyNumberII {
    public int nthUglyNumber(int num) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        HashSet<Long> set = new HashSet<>();
        pq.add(1L);
        set.add(1L);

        for (int i = num-1; i > 0; i--) {
            long n = pq.poll();
            if (set.add(n*2))
                pq.add(n*2);
            if (set.add(n*3))
                pq.add(n*3);
            if (set.add(n*5))
                pq.add(n*5);
        }

        return pq.poll().intValue();
    }
}
