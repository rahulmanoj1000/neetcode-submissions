class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> deck = new HashSet<>();
        for(int n : nums) {
            if(deck.contains(n)){
                return true;
            } else {
                deck.add(n);
            }
        }
        return false;
    }
}
