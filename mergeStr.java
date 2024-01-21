You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n1 = word1.length(), n2 = word2.length();
        int idx = 0;
        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (idx % 2 == 0) 
                sb.append(word1.charAt(i++));
            else 
                sb.append(word2.charAt(j++));
            idx++;
        }

        if (i < n1) sb.append(word1.substring(i, n1));
        if (j < n2) sb.append(word2.substring(j, n2));

        return sb.toString();
    }
}