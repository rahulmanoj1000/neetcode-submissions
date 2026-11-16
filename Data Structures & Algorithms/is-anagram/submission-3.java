class Solution {
    public boolean isAnagram(String s, String t) {
        char arrayS[] = s.toCharArray();
        Arrays.sort(arrayS);
        String sortedArrayS = new String(arrayS);
        
        char arrayT[] = t.toCharArray();
        Arrays.sort(arrayT);
        String sortedArrayT = new String(arrayT);

        return sortedArrayT.equals(sortedArrayS);
    }
}
