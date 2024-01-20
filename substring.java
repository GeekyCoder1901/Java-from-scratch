For a string sequence, a string word is k-repeating if word concatenated k times is a substring of sequence. The word's maximum k-repeating value is the highest value k where word is k-repeating in sequence. If word is not a substring of sequence, word's maximum k-repeating value is 0.

Given strings sequence and word, return the maximum k-repeating value of word in sequence.

 

class Solution {
    public int maxRepeating(String sequence, String word) {
 int n = sequence.length(), m = word.length();
        int max = 0;
        for(int i = 0;i < n;i++) {
            int cnt = 0, k = 0;
            for(int j = i;j < n;j++) {
                if(sequence.charAt(j) == word.charAt(k)) k++;
                else break;
                if(k == m) {
                    k = 0;
                    cnt++;
                }
            }
            max = Math.max(max, cnt);
        }
        return max;        
    }
}