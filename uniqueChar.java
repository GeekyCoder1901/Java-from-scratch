Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

class Solution {
    public int firstUniqChar(String s) {
        int oneMask = 0;
        int twoMask = 0;
        int len = s.length();
        for(int i = 0; i < len; i++) {
            int bit = 1 << (s.charAt(i)-'a');
            if((oneMask & bit) != 0) {
                twoMask |= bit;
            } else {
                oneMask |= bit;
            }
        }

        for(int i = 0; i < len; i++) {
            int bit = 1 << (s.charAt(i)-'a');
            if((twoMask & bit) == 0) {
                return i;
            }
        }
        return -1; 
    }
}