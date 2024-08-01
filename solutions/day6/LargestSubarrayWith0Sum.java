package solutions.day6;

import java.util.HashMap;

// Geeks for Geeks: Largest Subarray With 0 Sum
// https://www.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1
public class LargestSubarrayWith0Sum {
    int maxLen(int arr[], int n)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0, max = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if(map.containsKey(sum))
                max = Math.max(max, i-map.get(sum));
            else
                map.put(sum, i);
        }
        return max;
    }
}
