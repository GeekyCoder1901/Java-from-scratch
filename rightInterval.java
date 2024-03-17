You are given an array of intervals, where intervals[i] = [starti, endi] and each starti is unique.

The right interval for an interval i is an interval j such that startj >= endi and startj is minimized. Note that i may equal j.

Return an array of right interval indices for each interval i. If no right interval exists for interval i, then put -1 at index i.

class Solution {
    public int[] findRightInterval(int[][] intervals) {
       int n = intervals.length;
        if (n == 1) return new int[]{-1};   // would still be handled without this check

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int minStart = Integer.MAX_VALUE;
            int finalIdx = -1;
            int END = intervals[i][1];

            for (int j = 0; j < n; j++) {
                int currStart = intervals[j][0];

                if (currStart >= END && currStart < minStart) {
                    minStart = currStart;
                    finalIdx = j;
                }
            }

            ans[i] = finalIdx;
        }

        return ans;  
    }
}