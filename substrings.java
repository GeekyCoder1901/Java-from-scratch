Given a string s consisting only of characters a, b and c.

Return the number of substrings containing at least one occurrence of all these characters a, b and c.

class Solution {
    public int numberOfSubstrings(String s) {
         int freq[]=new int[3];
        int size=3;
        int start=0;
        int n=s.length();
        int res=0;
        for(int i=0;i<n;i++){
            char a=s.charAt(i);
            freq[a-'a']++;
            if(freq[a-'a']==1){
                size--;
            }
            while(size==0&&start<n){
                res+=n-i;
                freq[s.charAt(start)-'a']--;
                if(freq[s.charAt(start)-'a']==0){
                    size++;
                }
                start++;
                
            }
        }
        return res;
    }
}