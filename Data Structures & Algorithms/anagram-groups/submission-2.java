class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> deck = new HashMap<>();
        for(String word: strs){
            char[] word_array = word.toCharArray();
            Arrays.sort(word_array);
            String sorted_word = new String(word_array);
            List<String> word_stack;
            if(deck.containsKey(sorted_word)) {
                word_stack = deck.get(sorted_word);
            } else {
                word_stack = new ArrayList<>();
            }
                word_stack.add(word);
                deck.put(sorted_word, word_stack);
        }
        return new ArrayList<>(deck.values());
    }
}
