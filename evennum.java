Given an array nums of integers, return how many of them contain an even number of digits.


class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int count1=0;
            while(nums[i]>0){
                count1++;
                nums[i]=nums[i]/10;
            }
            if(count1%2==0){
                count++;
            }
        }
        return count;
    }
}