class Solution {
    public int maxProfit(int[] prices) {
        int op = 0;
        int j = 0;
        for(int i = 0; i < prices.length; i++) {
            int buy = prices[j];
            int sell = prices[i];
            if (buy < sell) {
                op = Math.max(op, sell - buy);
            } else {
                j = i;
            }
        }
        return op;
    }
}
