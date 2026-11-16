class Solution:

    def encode(self, strs: List[str]) -> str:
        op = ""
        for word in strs:
            length = len(word)
            op += str(length) + '#' + word
        
        return op


    def decode(self, s: str) -> List[str]:
        op = []
        while len(s) > 0:
            i = s.index('#')
            length = int(s[:i])
            s = s[i + 1:]
            word = s[:length]
            op.append(word)
            s = s[length:]

        return op