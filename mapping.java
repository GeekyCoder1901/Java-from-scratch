You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:

Characters ('a' to 'i') are represented by ('1' to '9') respectively.
Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
Return the string formed after mapping.

The test cases are generated so that a unique mapping will always exist.

class Solution {
    public String freqAlphabets(String s) {
          StringBuilder sb = new StringBuilder();
        
        for(int i = s.length()-1; i >= 0; i--) {
            int number;
            if(s.charAt(i) == '#') { 
                number = (s.charAt(i-2) - '0') * 10 + (s.charAt(i-1) - '0');
                i-=2;
            } else {  
                number = s.charAt(i) - '0';
            }
        
            sb.append((char) (number + 96));
        }

        return sb.reverse().toString();
    }
}