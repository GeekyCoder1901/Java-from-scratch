Number of steps to reduce a number to zero

Given an integer num, return the number of steps to reduce it to zero.

In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

class Solution {
    public int numberOfSteps(int num) {
     int s=0;
     while(num>0){
     if(num%2==0){
        num= num/2;
        s++;
     }
     else{
         num=num-1;
         s++;
         }
     }
         return s;
    }
}