class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> deck = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            deck.add(nums[i]);
        }
        int op = 0;
        for(int i=0; i<nums.length; i++) {
            int currentNum = nums[i];
            int tempOP = 1;
            while(deck.contains(currentNum+1)) {
                tempOP +=1;
                currentNum+=1;
            }
            op = Math.max(op, tempOP);
        }
        return op;
    }
}
