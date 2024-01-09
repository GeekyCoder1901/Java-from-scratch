You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.




class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
       int res=0;
        outerloop:
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words[i].length(); j++){
                if(!allowed.contains(String.valueOf(words[i].charAt(j))))
                continue outerloop;
            }
            res++;
        }

        return res; 
    }
}