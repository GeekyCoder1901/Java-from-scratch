A string s is nice if, for every letter of the alphabet that s contains, it appears both in uppercase and lowercase. For example, "abABB" is nice because 'A' and 'a' appear, and 'B' and 'b' appear. However, "abA" is not because 'b' appears, but 'B' does not.

Given a string s, return the longest substring of s that is nice. If there are multiple, return the substring of the earliest occurrence. If there are none, return an empty string.

 

class Solution {
    public String longestNiceSubstring(String s) {
       Set<Character> set = new HashSet();
       for(char c : s.toCharArray()){
           set.add(c);
       }

       for(int i = 0; i < s.length(); i++){
           if(set.contains(Character.toUpperCase(s.charAt(i)))
              && set.contains(Character.toLowerCase(s.charAt(i))))
                continue;
            
            String s1 = longestNiceSubstring(s.substring(0, i));
            String s2 = longestNiceSubstring(s.substring(i+1));
            return s1.length() >= s2.length() ? s1 : s2;
       }

       return s;
    }  
    }
