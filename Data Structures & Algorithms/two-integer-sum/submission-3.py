class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        deck = {}
        for i, n in enumerate(nums):
            rmdr = target - n
            if(rmdr in deck):
                return [deck[rmdr], i]
            else:
                deck[n] = i
        return []
           
        
