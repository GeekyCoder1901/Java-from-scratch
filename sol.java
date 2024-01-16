Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.

He starts by putting in $1 on Monday, the first day. Every day from Tuesday to Sunday, he will put in $1 more than the day before. On every subsequent Monday, he will put in $1 more than the previous Monday.
Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.

class Solution {
    public int totalMoney(int n) {
        int div = n/7;
    int rem = n%7;
    int total = div*(2*28 + (div-1)*7)/2;
    total += rem*(2*(div+1)+rem-1)/2;
    return total;
    }
}