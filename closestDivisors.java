Given an integer num, find the closest two integers in absolute difference whose product equals num + 1 or num + 2.

Return the two integers in any order.

class Solution {
    public int[] closestDivisors(int num) {
          int i =  (int)Math.sqrt(num+2);
        while(i>=1){
            if((num+1)%i==0) return new int[]{i , (num+1)/i};
            if((num+2)%i==0) return new int[]{i , (num+2)/i};
            i--;
        }
        return null;
    }
}