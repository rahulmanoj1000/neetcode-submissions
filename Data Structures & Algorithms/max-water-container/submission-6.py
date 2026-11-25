class Solution:
    def maxArea(self, heights: List[int]) -> int:
        r = len(heights) - 1
        l = 0 

        maxWater = 0
        while(l < r):
            left = heights[l]
            right = heights[r]

            width = (r - l)

            water = min(left, right) * width
            maxWater = max(water, maxWater)
        
            if left < right:
                l+= 1
            else:
                r-= 1
        return maxWater