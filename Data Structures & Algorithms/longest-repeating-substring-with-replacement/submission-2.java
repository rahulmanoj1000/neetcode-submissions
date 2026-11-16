class Solution {
    public int characterReplacement(String s, int k) {
        int result = 0;
        Map<Character, Integer> deck = new HashMap<>();
        int l = 0;
        int r = 0;
        for(int i = 0; i < s.length(); i++) {
            r = i;
            int size = r - l + 1;
            char letter = s.charAt(r);
            if(deck.containsKey(letter)) {
                int count = deck.get(letter) + 1;
                deck.put(letter, count);
            } else {
                deck.put(letter, 1);
            }
            int maxChar = Collections.max(deck.values());
            System.out.println(l + " " + size + " " + maxChar);

            if ((size - maxChar) > k) {
                int count = deck.get(s.charAt(l)) - 1;
                deck.put(s.charAt(l), count);
                l+=1;
            }
            maxChar = Collections.max(deck.values());
            result = Math.max(maxChar, result);
        }
        int leftOver = s.length() - result;
        
        return result + Math.min(leftOver, k);
    }
}
