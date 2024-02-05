Increasing Decreasing String

class Solution {
    public String sortString(String s) {
         int[] freq = new int[26];
        int len = s.length();

        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }    

        StringBuilder sb = new StringBuilder();

        while(len != 0){

            //step 1-2-3
            for(int i=0; i<26; i++){
                if(freq[i] > 0){
                    sb.append((char)(i+'a'));
                    freq[i]--;len--;
                }
            }

            //step 4-5-6
            for(int i=25; i>=0; i--){
                if(freq[i] > 0){
                    sb.append((char)(i+'a'));
                    len--;freq[i]--;
                }
            }
        }    

        return sb.toString();
    }
}