class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        op = {}
        res = []
        for word in strs:
            sorted_word = "".join(sorted(word))
            if sorted_word in op:
                op[sorted_word].append(word)
            else:
                op[sorted_word] = [word]
        for j in op:
            res.append(op[j])
        return res
            