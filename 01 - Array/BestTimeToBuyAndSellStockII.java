// 122. Best Time to Buy and Sell Stock II
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] > prices[i + 1]) {
                profit += prices[i] - buy;
                buy = prices[i+1];
            }
        }
        return profit + prices[prices.length - 1] - buy;
    }
}
