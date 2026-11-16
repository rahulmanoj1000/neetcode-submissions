class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        forward = [1] * len(nums)
        backward = [1] * len(nums)

        val = 1
        for i, n in enumerate(nums):
            if(i == 0):
                forward[i] = 1
            else:
                val = val * nums[i - 1]
                forward[i] = val
        

        rev_nums = nums[::-1]

        val = 1
        for i, n in enumerate(rev_nums):
            if(i == 0):
                backward[i] = 1
            else:
                val = val * rev_nums[i - 1]
                backward[i] = val

        backward = backward[::-1]
        
        op = [1] * len(nums)
        for i in range(len(nums)):
            op[i] = forward[i] * backward[i]


        return op