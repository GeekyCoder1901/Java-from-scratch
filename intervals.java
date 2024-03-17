Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
          Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
      int prev = 0, count  = 1;
      // if end is same, sort by start, bigger start in front
      for(int i = 0; i < intervals.length; i ++) {
          if(intervals[i][0] >= intervals[prev][1]) {
              prev = i;
              count ++;
          }
      }
      return intervals.length - count;
    }
}