You are given an integer n.

Each number from 1 to n is grouped according to the sum of its digits.

Return the number of groups that have the largest size.

class Solution {
    public int countLargestGroup(int n) {
         int[] map = new int[37];
    int maxCount = 0, res = 0;
    for (int i = 1; i <= n; i++) {
      
      int num = i, sum = 0;
      while (num > 0) {
        sum += num %10;
        num/=10;
      }

      ++map[sum];
      
      if (maxCount < map[sum]) {
        maxCount = map[sum];
        res = 1;
      } else if (maxCount == map[sum]) {
        res++;
      }
    }
    return res;
    }
}