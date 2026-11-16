class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        deck = set()
        l = 0
        op = 0

        for r in range(len(s)):
            while(s[r] in deck):
                deck.remove(s[l])
                l += 1
            deck.add(s[r])
            op = max(op, (r - l) + 1)
        return op