// 121. Best Time to Buy and Sell Stock
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int max = 0, low = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < low) {
                low = prices[i];
            } else {
                max = Math.max(max, prices[i] - low);
            }
        }
        return max;
    }
}

/*
// Brute Force (TLE)
class Solution {
    public int maxProfit(int[] prices) {
        int start = 0, end = 0;
        int max = 0;
        while (end < prices.length) {
            int last = end;
            while(last < prices.length) {
                max= Math.max(max, (prices[last] - prices[start]));
                start++;
                last++;
            }
            start = 0;
            end++;
        }
        return max;
    }
}
 */
