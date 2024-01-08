Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number. 



class Solution {
    public int thirdMax(int[] nums) {
     Arrays.sort(nums);
        int[] arr = new int[3];
        int count = 1;
        arr[0] = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < arr[count - 1]) {
                arr[count] = nums[i];
                count++;
            }
            if (count == 3) {
                break;
            }
        }

        if (count < 3) {
            return arr[0];  
        } else {
            return arr[2];  
        }
    }
}

    
    