class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        deck = {}
        freq = [[] for i in range(len(nums) + 1)]
        for i in nums:
            deck[i] = 1 + deck.get(i, 0)

        for i, n in deck.items():
            freq[n].append(i)
        
        op = []
        for j in range(len(freq) - 1, 0 , -1):
            for i in freq[j]:
                op.append(i)
                if len(op) == k:
                    return op
        return op