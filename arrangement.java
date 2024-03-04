Given two integers n and k, construct a list answer that contains n different positive integers ranging from 1 to n and obeys the following requirement:

Suppose this list is answer = [a1, a2, a3, ... , an], then the list [|a1 - a2|, |a2 - a3|, |a3 - a4|, ... , |an-1 - an|] has exactly k distinct integers.
Return the list answer. If there multiple valid answers, return any of them.

class Solution {
    public int[] constructArray(int n, int k) {
            int num=-1;
        int[] res = new int[n];
        res[0]=n;
        for(int i=1;i<n;i++){
            if(i<k){
                if(num>0){    
                    res[i]=res[i-1]+(n-i);
                    num*=-1;
                }else{
                    res[i]=res[i-1]-(n-i);
                    num*=-1;
                }
            }else{
                res[i]=res[i-1]+num;
            }
        }

        return res;

    }
}