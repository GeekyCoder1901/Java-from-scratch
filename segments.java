Given a string s, return the number of segments in the string.

A segment is defined to be a contiguous sequence of non-space characters.

 
import java.util.StringTokenizer;
class Solution {
    public int countSegments(String s) {
        StringTokenizer st = new StringTokenizer(s);
        int word=0;
        while(st.hasMoreTokens()){
            word++;
            st.nextToken();
        }
        return word;
    }
}