You are given a string time in the form of  hh:mm, where some of the digits in the string are hidden (represented by ?).

The valid times are those inclusively between 00:00 and 23:59.

Return the latest valid time you can get from time by replacing the hidden digits.

 

class Solution {
    public String maximumTime(String time) {
        char[] ans= time.toCharArray();
        if(ans[0]=='?'){
            ans[0]= (ans[1]<='3' || ans[1]=='?') ? '2' : '1';
        }
        
        if(ans[1]=='?') {
            ans[1]=ans[0]=='2' ? '3':'9';
        }
        
        if(ans[3]=='?') ans[3]='5';
        
        if(ans[4]=='?') ans[4]='9';
    
            return new String(ans);
    }
}