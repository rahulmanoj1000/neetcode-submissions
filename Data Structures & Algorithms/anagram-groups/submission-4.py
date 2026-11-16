class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        deck = {}
        for word in strs:
            sortedWord = ''.join(sorted(word))
            if sortedWord in deck:
                deck[sortedWord].append(word)
            else:
                deck[sortedWord] = [word]

        op = []
        for i, v in deck.items():
            op.append(v)
        
        return op
