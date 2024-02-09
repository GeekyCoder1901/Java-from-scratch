Given the binary representation of an integer as a string s, return the number of steps to reduce it to 1 under the following rules:

If the current number is even, you have to divide it by 2.

If the current number is odd, you have to add 1 to it.

It is guaranteed that you can always reach one for all test cases.

class Solution {
    public int numSteps(String s) {
        
        int countSteps = 0;
        int carry = 0;
        for(int i = s.length()-1;i>=1;i--)
        {
            int rightMostBit = s.charAt(i)-'0';
            if((rightMostBit+carry) == 1)
            {
                carry=1;
                countSteps += 2;
            }
            else
            {
                countSteps++;
            }
        }
        return countSteps+carry;
    }
}