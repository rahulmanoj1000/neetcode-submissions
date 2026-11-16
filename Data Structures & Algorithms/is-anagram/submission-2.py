class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        deck_set = {}
        deck_tet = {}
        if len(s) != len(t):
            return False
        for i in s:
            if i in deck_set:
                deck_set[i] += 1
            else:
                deck_set[i] = 1
        for i in t:
            if i in deck_tet:
                deck_tet[i] += 1
            else:
                deck_tet[i] = 1
        return deck_set == deck_tet
