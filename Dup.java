Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.





class Solution {
    public boolean containsDuplicate(int[] nums){
       for(int i=0;i<nums.length;i++){
           int element=nums[i];
           for(int j=i+1;j<nums.length;j++)           {
               if(nums[j]==element)
               {
                   return true;
               }
           }
       } 
       return false;
    }
}