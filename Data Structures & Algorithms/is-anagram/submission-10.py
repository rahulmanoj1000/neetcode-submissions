class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        deck = {}
        for l in s:
            deck[l] = deck.get(l, 0) + 1
        
        for l in t:
            if l not in deck or deck[l] == 0:
                return False
            else:
                deck[l] = deck[l] - 1
                
        for val in deck.values():
            if val > 0:
                return False
        return True
