import java.util.*;

// 1743. Restore the Array From Adjacent Pairs
// https://leetcode.com/problems/restore-the-array-from-adjacent-pairs/
class RestoreTheArrayFromAdjacentPairs {
    public int[] restoreArray(int[][] adjacentPairs) {
        int[] res = new int[adjacentPairs.length + 1];
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int[] adj: adjacentPairs) {
            int a = adj[0], b = adj[1];
            ArrayList<Integer> l1 = map.getOrDefault(a, new ArrayList<>());
            ArrayList<Integer> l2 = map.getOrDefault(b, new ArrayList<>());
            l1.add(b);
            l2.add(a);
            map.put(a, l1);
            map.put(b, l2);
            if (!set.add(a)) set.remove(a);
            if (!set.add(b)) set.remove(b);
        }
        int start = set.iterator().next();
        set = new HashSet<>();
        set.add(start);
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        int i = 0;
        while (!q.isEmpty()) {
            int curr = q.remove();
            res[i] = curr;
            for (int num: map.get(curr)) {
                if (set.add(num)) q.add(num);
            }
            i++;
        }
        return res;
    }
}