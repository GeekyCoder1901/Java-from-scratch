You are given an integer array nums and an integer k. You can partition the array into at most k non-empty adjacent subarrays. The score of a partition is the sum of the averages of each subarray.

Note that the partition must use every integer in nums, and that the score is not necessarily an integer.

Return the maximum score you can achieve of all the possible partitions. Answers within 10-6 of the actual answer will be accepted.

class Solution {
    public double largestSumOfAverages(int[] nums, int k) {
        return solve(0, 0, k, nums); // Time Limit Exceeded
    }

    private double solve(int i, double score, int lvl, int[] nums){
        if (lvl == 0)
            return i == nums.length? score : 0;

        double ans = 0, cur = 0;
        for (int j = i; j <= nums.length - lvl; j++){
            cur += nums[j];
            ans = Math.max(ans, solve(j + 1, score + cur/(j-i+1), lvl - 1, nums));
        }

        return ans;
    }
}