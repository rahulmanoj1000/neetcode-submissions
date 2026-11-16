class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> deck = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            int requiredNumber = target - currentNumber; 
            
        if (deck.containsKey(requiredNumber)) {
                return new int[]{deck.get(requiredNumber), i};
            }

            deck.put(currentNumber, i);
        }
        return new int[]{0,0};
    }
}
