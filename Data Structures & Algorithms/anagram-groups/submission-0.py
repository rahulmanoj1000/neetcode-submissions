class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        op = []
        deck = {}
        for i in strs:
            sorted_i = "".join(sorted(i))  
            if sorted_i in deck:
                deck[sorted_i].append(i)
            else:
                deck[sorted_i] = [i]
        for j in deck:
            op.append(deck[j])
        return op