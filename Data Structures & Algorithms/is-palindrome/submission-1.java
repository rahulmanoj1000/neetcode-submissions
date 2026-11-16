class Solution {
    public boolean isPalindrome(String s) {
        String cleanString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(cleanString);
        String reversed = sb.reverse().toString();
        return cleanString.equals(reversed);
    }
}
