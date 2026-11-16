class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] op = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if(i == 0){
                op[i] = 1;
            } else {
                op[i] = op[i-1] * nums[i-1];
            }
        }
        int post = 1;
        for(int j = nums.length - 1; j >= 0; j--) {
            op[j] = op[j] * post;
            post = post * nums[j];
        }
        return op;

    }
}  
