Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.

 

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int i1 = 0, i2 = 0;
       int n = arr2.length;
       while(i2 < n){
        i1 = swap(arr1, arr2[i2++], i1); 
       }
        Arrays.sort(arr1,i1, arr1.length);
        return arr1;
    }
    int swap(int[] arr, int target, int from){
       for(int i = from; i < arr.length; i++){
         if(arr[i] == target){
                int temp = arr[from];
                arr[from++] =  arr[i];
                arr[i] = temp;
            }
       }
       return from;
    }
}