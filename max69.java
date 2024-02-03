You are given a positive integer num consisting only of digits 6 and 9.

Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).

class Solution {
    public int maximum69Number (int num) {
       StringBuilder s= new StringBuilder(""+num);

     for(int i=0;i<s.length();i++){
         if(s.charAt(i)=='6') {
             s.setCharAt(i,'9');
             break;
         }
     }   

     return Integer.parseInt(s.toString()); 
    }
}