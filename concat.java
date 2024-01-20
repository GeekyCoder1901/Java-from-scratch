You are given an array of distinct integers arr and an array of integer arrays pieces, where the integers in pieces are distinct. Your goal is to form arr by concatenating the arrays in pieces in any order. However, you are not allowed to reorder the integers in each array pieces[i].

Return true if it is possible to form the array arr from pieces. Otherwise, return false.

class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        HashMap<Integer,int[]> hm = new HashMap();
        for(int[] list:pieces)
            hm.put(list[0],list);
        
        int index = 0;
        while(index<arr.length){
            if(!hm.containsKey(arr[index]))
                return false;
            
            int[] list = hm.get(arr[index]);
            for(int val:list){
                if(index>=arr.length || val!=arr[index])
                    return false;
                index++;
            }
        }
        return true; 
    }
}