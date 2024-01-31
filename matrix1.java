weakest row in matrix

You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.

A row i is weaker than a row j if one of the following is true:

The number of soldiers in row i is less than the number of soldiers in row j.
Both rows have the same number of soldiers and i < j.
Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.

 
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
      PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[1]==b[1] ? a[0]-b[0] : a[1]-b[1]); 
        for(int i=0; i<mat.length; i++){  // O(n)
            int onesCount = count(mat[i]);
            pq.offer(new int[]{i,onesCount});
        }
        int[] arr = new int[k];  // O(k)
        int i = 0;
        while(i != k){
            arr[i++] = pq.poll()[0];
        }
        return arr;
    }
    int count(int[] arr){   // O(log m)
        int low = 0;int high = arr.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == 1){
                low = mid+1;
            }else{
                high = mid - 1;
            }
        }
        return low;  
    }
}