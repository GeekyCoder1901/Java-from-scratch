Given a binary string s ​​​​​without leading zeros, return true​​​ if s contains at most one contiguous segment of ones. Otherwise, return false.

class Solution {
    public boolean checkOnesSegment(String s) {
        for(int i = 0; i < s.length() - 1; i++)
        {
          if(s.charAt(i) == '0' && s.charAt(i + 1) == '1')
            return false;
        }
        return true;
    
    }
}