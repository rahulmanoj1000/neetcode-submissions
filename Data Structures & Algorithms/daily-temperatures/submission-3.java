class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<List<Integer>> s = new Stack();
        int size = temperatures.length;
        int[] op = new int[size];
        for(int i = 0; i < size; i++) {
            int curTemp = temperatures[i];
            while(!s.empty() && curTemp > s.peek().get(0)) {
                List<Integer> deckVal = s.peek();
                op[deckVal.get(1)] = i - deckVal.get(1);
                s.pop();
            }
            s.push(Arrays.asList(temperatures[i], i));
        }
        return op;
    }
}
