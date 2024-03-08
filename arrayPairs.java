For an integer array nums, an inverse pair is a pair of integers [i, j] where 0 <= i < j < nums.length and nums[i] > nums[j].

Given two integers n and k, return the number of different arrays consisting of numbers from 1 to n such that there are exactly k inverse pairs. Since the answer can be huge, return it modulo 109 + 7.

class Solution {
    public int kInversePairs(int n, int k) {
         int MOD= 1000000007;
        int[] dp = new int[k+1];
        dp[0] = 1;
        for(int i = 2;i <= n;i++){
           for(int j = 1;j <= k;j++){
                dp[j] = (dp[j] + dp[j-1]) % MOD;
           }
           for(int j = k;j >= i;j--){
                dp[j] = (dp[j] - dp[j-i] + MOD) % MOD;
           }
        }
        return dp[k];
    }
}