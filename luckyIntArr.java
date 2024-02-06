Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.

Return the largest lucky integer in the array. If there is no lucky integer return -1.

class Solution {
    public int findLucky(int[] arr) {
       int[] frequency = new int[501]; 

        for (int num : arr) {
            frequency[num]++;
        }

        for (int i = arr.length; i > 0; i--) {
            if (frequency[i] == i) {
                return i;
            }
        }

        return -1;  
    }
}