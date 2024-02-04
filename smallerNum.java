Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
               int[] count = new int[101];
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            count[nums[i]]++;
        }
        
        for (int i = 1; i <= 100; i++) {
            count[i] += count[i - 1];
        }
        
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                result[i] = 0;
            } else {
                result[i] = count[nums[i] - 1];
            }
        }
        
        return result;
 
    }
}