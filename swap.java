Fair candy swap

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aum = 0;
        boolean[] inAlice = new boolean[100001];
        for (int i = 0; i < aliceSizes.length; i++) {
            aum += aliceSizes[i];
            inAlice[aliceSizes[i]] = true;
        }
        int bum = 0;
        for (int i = 0; i < bobSizes.length; i++) {
            bum += bobSizes[i];
        }
        int diff = aum - bum;
        int[] ans = new int[2];
        for (int i = 0; i < bobSizes.length; i++) {
            int target = bobSizes[i] + diff / 2;
            if (target > 0 && target < 100001) {
                if (inAlice[target]) {
                    ans = new int[] {target, bobSizes[i]};
                    return ans;
                }
            }
        } 
        return ans;           
    }
}
