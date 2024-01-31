Minimum Absolute Difference

Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.

Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows

a, b are from arr
a < b
b - a equals to the minimum absolute difference of any two elements in arr

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list =  new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length-1;i++){
            min = Math.min(min,Math.abs(arr[i]-arr[i+1]));
        }
        for(int i = 0;i<arr.length-1;i++){
            if(Math.abs(arr[i]-arr[i+1])==min){
                list.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
     
        return list;
    }
}