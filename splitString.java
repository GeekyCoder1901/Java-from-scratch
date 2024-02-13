Given a string s of zeros and ones, return the maximum score after splitting the string into two non-empty substrings (i.e. left substring and right substring).

The score after splitting a string is the number of zeros in the left substring plus the number of ones in the right substring.

class Solution {
    public int maxScore(String s) {
         int left = -1;
        int zeros = 0;
        int ones = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                zeros++;
            } else {
                ones++;
            }

            left = Math.max(left, zeros - ones);
        }

        if (s.charAt(s.length() - 1) == '1') {
            ones += 1;
        }

        return left + ones;       
    }
}