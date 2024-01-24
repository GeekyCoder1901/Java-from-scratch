You are given an n x n grid where we place some 1 x 1 x 1 cubes that are axis-aligned with the x, y, and z axes.

Each value v = grid[i][j] represents a tower of v cubes placed on top of the cell (i, j).

We view the projection of these cubes onto the xy, yz, and zx planes.

A projection is like a shadow, that maps our 3-dimensional figure to a 2-dimensional plane. We are viewing the "shadow" when looking at the cubes from the top, the front, and the side.

Return the total area of all three projections.

 

class Solution {
    public int projectionArea(int[][] grid) {
         int m = grid.length, totalArea = 0, xzMax, yzMax;

        for ( int i = 0; i < m; i++ ) {
            xzMax = 0; yzMax = 0;
            for ( int j = 0; j < m; j++ ) {
                xzMax = Math.max(xzMax, grid[i][j]);
                yzMax = Math.max(yzMax, grid[j][i]);
                if ( grid[i][j] > 0 ) totalArea += 1;
            }
            totalArea += xzMax + yzMax;
        }
        return totalArea;
    }
}