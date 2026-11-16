class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxProf = 0
        l = 0
        r = 1

        while(r <= len(prices) - 1):
            if prices[l] < prices[r]:
                profit = prices[r] - prices[l]
                maxProf = max(maxProf, profit)
                r +=1
            else:
                l += 1
                if(l == r):
                    r += 1
        
        return maxProf
