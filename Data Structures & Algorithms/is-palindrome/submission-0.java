class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = (s.replaceAll("[^a-zA-Z0-9]", "")).toLowerCase();
        StringBuilder sb = new StringBuilder(cleaned);
        System.out.println(cleaned);
        String reversed = sb.reverse().toString();
        System.out.println(reversed);
        return cleaned.equals(reversed);

    }
}
