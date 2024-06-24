You are given a binary array nums and an integer k.

A k-bit flip is choosing a subarray of length k from nums and simultaneously changing every 0 in the subarray to 1, and every 1 in the subarray to 0.

Return the minimum number of k-bit flips required so that there is no 0 in the array. If it is not possible, return -1.

A subarray is a contiguous part of an array.

class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length, flipped = 0, res = 0;
        int[] isFlipped = new int[n];
        for (int i = 0; i < nums.length; ++i) {
            if (i >= k)
                flipped ^= isFlipped[i - k];
                if (flipped == nums[i]) {
                    if (i + k > nums.length)
                        return -1;
                isFlipped[i] = 1;
                flipped ^= 1;
                res++;
            }
        }
        return res;
    }
}