class Solution:
    def trap(self, height: List[int]) -> int:
        maxLeft = height[0]
        maxRight = height[-1]

        l, r = 1, len(height) - 2
        totalWater = 0
        while(l <= r):
            maxLeft = max(height[l], maxLeft)
            maxRight = max(height[r], maxRight)
            if(maxLeft < maxRight):
                water = min(maxLeft, maxRight) - height[l]
                l+=1
            else:
                water = min(maxLeft, maxRight) - height[r]
                r -= 1
            if(water > 0):
                totalWater += water

        return totalWater
