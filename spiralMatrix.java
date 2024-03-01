You start at the cell (rStart, cStart) of an rows x cols grid facing east. The northwest corner is at the first row and column in the grid, and the southeast corner is at the last row and column.

You will walk in a clockwise spiral shape to visit every position in this grid. Whenever you move outside the grid's boundary, we continue our walk outside the grid (but may return to the grid boundary later.). Eventually, we reach all rows * cols spaces of the grid.

Return an array of coordinates representing the positions of the grid in the order you visited them.

class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
         int[][] res = new int[rows * cols][];
        int k = 0;
        res[k++] = new int[]{rStart, cStart};
        int[] direction = {0, 1, 0, -1, 0};
        int d = 0;
        int len = 0;
        while(k < rows * cols){
            if(d == 0 || d == 2){
                len++;
            }
            for(int i = 0; i < len; i++){
                rStart += direction[d];
                cStart += direction[d+1];
                
                if(rStart > -1 && rStart < rows && cStart > -1 && cStart < cols){
                    res[k++] = new int[]{rStart, cStart};
                }
            }
            d = ++d % 4;
        }
        return res;
    }
}