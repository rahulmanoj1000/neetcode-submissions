class Solution:
    def trap(self, height: List[int]) -> int:
        leftMax = 0
        rightMax = 0

        left, right = 0, len(height) - 1
        totalWater = 0
        while(left < right):
            leftMax = max(leftMax, height[left])
            rightMax = max(rightMax, height[right])

            if(height[left] < height[right]):
                water = leftMax - height[left]
                if water > 0:
                    totalWater = totalWater + water
                left+= 1
            else:
                water = rightMax - height[right]
                if water > 0:
                    totalWater = totalWater + water
                right-= 1
        return totalWater