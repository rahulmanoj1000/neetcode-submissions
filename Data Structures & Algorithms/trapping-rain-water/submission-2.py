class Solution:
    def trap(self, height: List[int]) -> int:
        leftWall = []
        rightWall = []

        maxWall = 0
        for i, n in enumerate(height):
            if i == 0:
                leftWall.append(0)
            else:
                wall = height[i - 1]
                maxWall = max(wall, maxWall)
                leftWall.append(maxWall)
        
        maxWall = 0
        revheight = list(reversed(height))
        for i, h in enumerate(revheight):
            if i == 0:
                rightWall.append(0)
            else:
                wall = revheight[i - 1]
                maxWall = max(wall, maxWall)
                rightWall.append(maxWall)
        rightWall = list(reversed(rightWall))

        minWall = []
        for i, n in enumerate(leftWall):
            minWall.append(min(leftWall[i], rightWall[i]))
        
        totalWater = 0
        for i, n in enumerate(minWall):
            water = n - height[i]
            if water > 0:
                totalWater += water
        
        return totalWater
