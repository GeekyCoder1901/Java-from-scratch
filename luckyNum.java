Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
         int n = matrix.length;
        int m = matrix[0].length;
        ArrayList<Integer> ls = new ArrayList<Integer>();

         for (int i=0; i<n; i++){
             int num = Integer.MAX_VALUE;
             int index = -1;
            for (int j=0; j<m; j++){
                if(matrix[i][j] < num){
                    num = matrix[i][j];
                    index = j;
                }
            }
             boolean flag = true;
             for(int row=0; row<n; row++){
                 if(matrix[row][index] > num ) flag = false;
             }
             if(flag) ls.add(num);
        }

        return ls;
    }
}