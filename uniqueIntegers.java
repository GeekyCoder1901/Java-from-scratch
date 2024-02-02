Given an integer n, return any array containing n unique integers such that they add up to 0.

class Solution {
    public int[] sumZero(int n) {
         int[] mp = new int[1001];
        int add = 0;
        for (int i = -500; i < 501; i++)
            mp[add++] = i;
        int[] arr = new int[n];
        add = (mp.length / 2) - (n / 2);
        for (int i = 0; i < n; i++) {
            if (mp[add] == 0 && n % 2 == 0) {
                arr[i] = mp[++add];
                add++;
            } else {
                arr[i] = mp[add++];
            }
        }
        return arr;
    }
}