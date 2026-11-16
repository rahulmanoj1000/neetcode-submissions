class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> deck = new HashMap<>();

        for(int i = 0; i < numbers.length; i++) {
            int required = target - numbers[i];
            if(deck.containsKey(required)) {
                return new int [] {deck.get(required) + 1, i + 1};
            } else {
                deck.put(numbers[i], i);
            }
        }
        return new int [] {};
    }
}