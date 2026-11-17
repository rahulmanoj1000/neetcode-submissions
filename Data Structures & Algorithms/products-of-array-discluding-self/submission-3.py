class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        forward = []
        backward = []

        for i, n in enumerate(nums):
            if(i == 0):
                forward.append(1)
            else:
                val = forward[i - 1] * nums[i - 1]
                forward.append(val)
        
        nums_rev = nums[::-1]

        for i, n in enumerate(nums):
            if(i == 0):
                backward.append(1)
            else:
                val = backward[i - 1] * nums_rev[i - 1]
                backward.append(val)
        
        backward = backward[::-1]
        
        op = []
        for i in range(len(nums)):
            op.append(forward[i] * backward[i])
        
        return op