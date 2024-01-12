You have a bomb to defuse, and your time is running out! Your informer will provide you with a circular array code of length of n and a key k.

As code is circular, the next element of code[n-1] is code[0], and the previous element of code[0] is code[n-1].

Given the circular array code and an integer key k, return the decrypted code to defuse the bomb!

 
class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] ans = new int[code.length];
         if (k == 0) {
            return ans;
        }
        if(k > 0){
        for(int i=0;i<code.length;i++){
            int sum = 0;
            for(int j=1;j<=k;j++){
                sum += code[(i+j) % code.length];
            }
            ans[i] = sum;
            }
        } else {
            for(int i=0;i<code.length;i++){
                int sum = 0;
                for(int j=1;j<=-1 * k;j++){
                    sum += code[(i-j + code.length) % code.length];
                }
                ans[i] = sum;
            }
        }
        return ans;
    }
}