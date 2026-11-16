class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        deck = {}
        for i, n in enumerate(nums):
            leftover = target - n
            if (leftover in deck):
                return [deck[leftover], i]
            else:
                deck[n] = i
           
        
