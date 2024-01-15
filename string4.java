You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.

class Solution {
    public boolean halvesAreAlike(String s) {
    int length = s.length() / 2;
        
        return checkVowel(s.substring(0 , length)) == checkVowel(s.substring(length));
    }

    public static int checkVowel(String str ) {
        int count = 0;
        for (char ch : str.toCharArray())
        {   
           if("AEIOUaeiou".indexOf(ch) != -1) count++;
        }
        return count;    
    }
}