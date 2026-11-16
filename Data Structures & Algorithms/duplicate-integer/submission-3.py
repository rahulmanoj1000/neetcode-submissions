class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        deck = set()
        for i in nums:
            if i in deck:
                return True
            else:
                deck.add(i)
        return False