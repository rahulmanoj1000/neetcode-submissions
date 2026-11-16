class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        deck = {}
        for word in strs:
            s_word = "".join(sorted(word))
            if s_word in deck:
                deck[s_word].append(word)
            else:
                deck[s_word] = [word]
        
        op = []
        for i in deck.values():
            op.append(i)
        
        return op