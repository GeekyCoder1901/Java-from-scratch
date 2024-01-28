Lagest number at least twise of others
You are given an integer array nums where the largest integer is unique.

Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.

class Solution {
    public int dominantIndex(int[] nums) {
       int max = 0;
        int index = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                index = i;
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(max < 2 * nums[i] && i != index){
                return -1;
            }
        }
        return index; 
    }
}