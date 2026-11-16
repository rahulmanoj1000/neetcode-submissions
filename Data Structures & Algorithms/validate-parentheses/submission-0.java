class Solution {
    public boolean isValid(String s) {
        LinkedList<Character> deck = new LinkedList<>();
        Map<Character, Character> pair = new HashMap<>();
        pair.put(')', '(');
        pair.put('}', '{');
        pair.put(']', '[');
        char[] stack = s.toCharArray();
        for(int i = 0; i < stack.length; i++) {
            char bracket = stack[i];
            if(pair.containsKey(bracket)) {
                if(deck.isEmpty()) return false;
                if(pair.get(bracket) != deck.getFirst()){
                    return false;
                } else {
                    deck.removeFirst();
                }
            } else {
                deck.addFirst(bracket);
            }
        }
        return deck.isEmpty();
    }
}
