class Solution:
    def maxArea(self, heights: List[int]) -> int:
        maxWater = 0
        l = 0
        r = len(heights) - 1

        while(l < r):
            if heights[l] > heights[r]:
                water = (r - l) * heights[r]
            else:
                water = (r - l) * heights[l]

            maxWater = max(water, maxWater)
            if heights[l] > heights[r]:
                r-=1
            else:
                l+=1
        
        return maxWater