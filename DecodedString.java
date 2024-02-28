You are given an encoded string s. To decode the string to a tape, the encoded string is read one character at a time and the following steps are taken:

If the character read is a letter, that letter is written onto the tape.
If the character read is a digit d, the entire current tape is repeatedly written d - 1 more times in total.
Given an integer k, return the kth letter (1-indexed) in the decoded string.

class Solution {
    public String decodeAtIndex(String s, int k) {
         int prev = 0, temp = 0;
    for(int i = 0; i < s.length(); i++){
        if(Character.isDigit(s.charAt(i))) {
            temp = prev;
            prev *= (s.charAt(i) - '0');
            if(k <= prev || temp > prev){ // overflow, temp > prev
                if(!(k % temp == 0) || temp > prev) k %= temp;
                else if(k < temp) k = 1;
                else k = temp;
                i = -1; prev = 0;
            }
        }
        else if(k == (++prev))
            return String.valueOf(s.charAt(i));
    }
    return "";
    }
}