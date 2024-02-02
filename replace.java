Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.

class Solution {
    public int[] replaceElements(int[] arr) {
          if(arr.length == 1){
            return new int[]{-1};
        }
        int n=arr.length;
        int temp=arr[n-1];
        arr[n-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>temp){
                int demo=arr[i];
                arr[i]=temp;
                temp=demo;
            }
            else{
                arr[i]=temp;
            }
        }
        return arr;
    }
}