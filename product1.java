Given an integer number n, return the difference between the product of its digits and the sum of its digits.

class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int mul=1;
        int num=0;
        while(n>0){
            num=n%10;
            mul*=num;
            sum+=num;
            n/=10;
        }
        return mul-sum;
    }
}