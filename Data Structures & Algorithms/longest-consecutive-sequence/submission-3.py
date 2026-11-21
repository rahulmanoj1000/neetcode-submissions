class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        deck = set(nums)

        op = 0

        for n in nums:
            if(n - 1 in deck):
                continue
            curNum = n
            curLen = 1
            while(curNum + 1 in deck):
                curLen += 1
                curNum += 1
            op = max(op, curLen)
        
        return op