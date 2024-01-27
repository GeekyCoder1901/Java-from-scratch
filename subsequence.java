We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.

Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.

A subsequence of array is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements.

class Solution {
    public int findLHS(int[] nums) {
       Arrays.sort(nums);

        int l = 0;
        int r = 1;

        int max = 0;

        while(r < nums.length){
            while( nums[r] - nums[l] > 1){
                l++;
            }
            if( nums[r] - nums[l] == 1){
                  max = Math.max(max, (r - l) + 1);

            }
            r++;
        }
        return max;   
    }
}