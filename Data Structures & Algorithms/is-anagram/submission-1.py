class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        stack = {};
        for l in s:
            if l in stack:
                stack[l] += 1
            else:
                stack[l] = 1
        
        stack_2 = {};
        for l in t:
            if l in stack_2:
                stack_2[l] += 1
            else:
                stack_2[l] = 1   

        if stack == stack_2:
            return True
        else:
            return False 