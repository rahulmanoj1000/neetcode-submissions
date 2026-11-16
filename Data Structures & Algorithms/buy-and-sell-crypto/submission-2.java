class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int j = 0;
        for(int i = 1; i < prices.length; i++) {
            int buy = prices[j];
            int sell = prices[i];
            if (buy < sell) {
                profit = Math.max(profit, (sell-buy));
            } else {
                j = i;
            }
        }
        return profit;
    }
}
