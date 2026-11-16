class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        deck = set()
        for n in nums:
            if n in deck:
                return True
            else:
                deck.add(n)
        return False 