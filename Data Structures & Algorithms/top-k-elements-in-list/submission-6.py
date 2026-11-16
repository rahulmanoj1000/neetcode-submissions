class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        deck = {}
        freq = [[] for i in range(len(nums) + 1)]

        for i in nums:
            deck[i] = 1 + deck.get(i, 0)
        
        for num, count in deck.items():
            freq[count].append(num)
        
        op = []
        for i in range(len(freq) - 1, 0, -1):
            for j in freq[i]:
                op.append(j)
                if len(op) == k:
                    return op
        
        return op