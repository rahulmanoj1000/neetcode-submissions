class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        deck = {}
        for i, n in enumerate(nums):
            if(target - n in deck):
                return [deck[target - n], i]
            else:
                deck[n] = i
        
