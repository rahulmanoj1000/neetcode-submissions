class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq = [[] for i in range(len(nums) + 1)]
        deck = {}
        for n in nums:
            deck[n] = deck.get(n, 0) + 1
        
        for n, c in deck.items():
            freq[c].append(n)
        
        op = []
        for i in range(len(nums), 0, -1):
            box = freq[i]
            for j in box:
                op.append(j)
                if(len(op) == k):
                    return op
        return []

