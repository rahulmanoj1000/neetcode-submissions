class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<List<Integer>> deck = new Stack();
        int size = temperatures.length;
        int[] op = new int[size];

        for(int i = 0; i < size; i++) {
            int curTemp = temperatures[i];
            while(!deck.empty()&& curTemp > deck.peek().get(0)) {
                List<Integer> topVal = deck.peek();
                if(topVal.get(0) < curTemp) {
                    deck.pop();
                    op[topVal.get(1)] = i - topVal.get(1);
                } else if(topVal.get(0) > curTemp) {
                    break;
                }
            }
            deck.push(Arrays.asList(temperatures[i], i));
        }
        return op;
    }
}
