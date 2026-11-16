class Solution:

    def encode(self, strs: List[str]) -> str:
        op = ""
        for word in strs:
            wordLength = len(word)
            op += str(wordLength) + '#' + word
        return op
            
    def decode(self, s: str) -> List[str]:
        op = []
        
        i = 0
        while(i < len(s)):
            j = i
            num = ""
            while(s[j].isdigit()):
                num += s[j]
                j+=1

            start = j + 1
            end = start + int(num)
            word = s[start : end]
            op.append(word)
            i = end

        return op