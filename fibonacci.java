Given an integer k, return the minimum number of Fibonacci numbers whose sum is equal to k. The same Fibonacci number can be used multiple times.

class Solution {
    public int findMinFibonacciNumbers(int k) {
       List<Integer> list=new LinkedList<>();
       int num=0,n1=1,n2=2,count=0,i;
       list.add(1);list.add(2);
       while(num<k)
       {
           num=n1+n2;
           list.add(num);
           n1=n2;
           n2=num;
       } 
       i=list.size()-1;
       while(k>0)
       {
           if(list.get(i)>k)
           i--;
           else if(list.get(i)==num||list.get(i)<num)
           {
               count++;
               k-=list.get(i);
           }
       }
       return count;
    }
}