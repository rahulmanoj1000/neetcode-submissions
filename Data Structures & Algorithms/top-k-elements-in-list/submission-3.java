class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> deck = new HashMap<>();
        for(int num : nums) {
            deck.put(num, deck.getOrDefault(num, 0) + 1);
        }
        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : deck.entrySet()) {
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }
        arr.sort((a, b) -> Integer.compare(b[0], a[0]));
        int i = 0;
        int[] op = new int[k];
        for(; i<k; i++) {
            op[i] = arr.get(i)[1];
        }
        return op;

    }
}
