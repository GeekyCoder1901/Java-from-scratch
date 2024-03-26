Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].

You may return the answer in any order.

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < 1 << n; i++) {
      if (Integer.bitCount(i) == k) {
        List<Integer> comb = new ArrayList<>(k);
        for (int j = 0; j <= n; j++) {
          // collect bit with 1
          if (((i >> j) & 1) == 1) {
            comb.add(j + 1);
          }
        }
        result.add(comb);
      }
    }
    return result;
    }
}