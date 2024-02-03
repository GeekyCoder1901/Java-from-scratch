No-Zero integer is a positive integer that does not contain any 0 in its decimal representation.

Given an integer n, return a list of two integers [a, b] where:

a and b are No-Zero integers.
a + b = n
The test cases are generated so that there is at least one valid solution. If there are many valid solutions, you can return any of them.

class Solution {
    public int[] getNoZeroIntegers(int n) {
     int arr[]=new int[2];
        boolean t=true;
        for(int i=1;i<=n;i++){
            int k=i;
            while(k!=0){
                int rem=k%10;
                if(rem==0){
                   t=false;
                }
                k/=10;
            }
            if(t){
                int m=n-i;
                while(m!=0){
                    int rem=m%10;
                    if(rem==0){
                        t=false;
                    }
                    m/=10;
                }
              if(t){
               arr[0]=i;
               arr[1]=n-i;
               break;
              }
            }
            t=true;
        }
    return arr;
    }
}    
    