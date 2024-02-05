Given an integer n, return a string with n characters such that each character in such string occurs an odd number of times.

The returned string must contain only lowercase English letters. If there are multiples valid strings, return any of them.  


class Solution {
    public String generateTheString(int n) {
                
StringBuilder s = new StringBuilder();

    if(n%2==0){
        s.append("t".repeat(n-1));
        s.append("e");
}else{
        s.append("t".repeat(n));
}

return s.toString();


    }
}