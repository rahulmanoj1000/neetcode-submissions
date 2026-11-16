class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> deck = new Stack<>();
        for(String s: tokens) {
            if("/+*-".contains(s)) {
                int val1 = Integer.parseInt(deck.pop());
                int val2 = Integer.parseInt(deck.pop());
                String op = this.magic(val1, val2, s);
                deck.push(op);
            } else {
                deck.push(s);
            }
        }
        return Integer.parseInt(deck.pop());
    }

    public String magic(int val1, int val2, String symbol) {
        int op;
        if(symbol.equals("+")) {
            op = val1 + val2;
        } else if(symbol.equals("-")) {
            op = val2 - val1;
        } else if(symbol.equals("/")) {
            op = val2 / val1;
        } else {
            op = val2 * val1;
        }
        return Integer.toString(op);
    }
}
