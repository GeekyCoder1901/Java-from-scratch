sort array by parity

Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition

class Solution {
    public int[] sortArrayByParity(int[] nums) {
         return Arrays.stream(Arrays.stream(nums).boxed().toArray(Integer[]::new))
                .sorted(Comparator.comparingInt(n -> (int) n % 2 == 0 ? 0 : 1))
                .mapToInt(x -> x)
                .toArray();
    }
    
}