You are given an integer num. You can swap two digits at most once to get the maximum valued number.

Return the maximum valued number you can get.

class Solution {
    public int maximumSwap(int num) {
      if(num < 10) return num;
        
        char[] arr = String.valueOf(num).toCharArray();
        
        int[] rightIndex = new int[10];      
        
        for(int i=0; i<arr.length; i++){
            rightIndex[arr[i] - '0'] = i;  
        }
        
        for(int i=0; i<arr.length; i++){  
            for(int j=9; j>arr[i] - '0'; j--){ 
                if(rightIndex[j] > i){  
                    arr[i] = arr[rightIndex[j]];
                    arr[rightIndex[j]] = temp;
                    return Integer.valueOf(new String(arr));  
                }
            }
        }
        return num;  
    }
}