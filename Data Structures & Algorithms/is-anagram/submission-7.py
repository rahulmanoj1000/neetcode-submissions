class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        if len(s) != len(t):
            return False

        deck = {}
        for letter in s:
            if letter in deck:
                deck[letter] += 1
            else:
                deck[letter] = 1
                
        for letter in t:
            if letter not in deck:
                return False
            
            deck[letter] -= 1 

            if deck[letter] < 0:
                return False
        
        return True
