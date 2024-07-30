package solutions.day5;

import java.util.*;

// 347. Top K Frequent Elements
// https://leetcode.com/problems/top-k-frequent-elements/
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        ArrayList<Integer>[] arr = new ArrayList[nums.length+1];

        for (int i = 0; i < arr.length; i++)
            arr[i] = new ArrayList<>();

        for (Integer key: map.keySet())
            arr[map.get(key)].add(key);

        int[] res = new int[k--];

        for (int i = nums.length; i > 0; i--) {
            for (Integer ele: arr[i]) {
                res[k] = ele;
                k--;
                if(k < 0) break;
            }
            if(k < 0) break;
        }

        return res;
    }
}
