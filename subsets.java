Given an integer array nums of unique elements, return all possible subsets(the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < Math.pow(2, n); i++) {
            List<Integer> temp = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    temp.add(nums[j]);
                }
            }
            res.add(temp);
        }
        return res;
    }
}