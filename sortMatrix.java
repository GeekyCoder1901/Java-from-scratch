A matrix diagonal is a diagonal line of cells starting from some cell in either the topmost row or leftmost column and going in the bottom-right direction until reaching the matrix's end. For example, the matrix diagonal starting from mat[2][0], where mat is a 6 x 3 matrix, includes cells mat[2][0], mat[3][1], and mat[4][2].

Given an m x n matrix mat of integers, sort each matrix diagonal in ascending order and return the resulting matrix.

class Solution {
    public int[][] diagonalSort(int[][] mat) {
          Map<Integer, PriorityQueue<Integer>> diagonals = sortedDiagonals(mat);

        for (int i = 0; i < mat.length; ++i)
            for (int j = 0; j < mat[0].length; ++j)
                mat[i][j] = diagonals.get(i - j).poll();

        return mat;
    }

    private Map<Integer, PriorityQueue<Integer>> sortedDiagonals(int[][] mat) {
        Map<Integer, PriorityQueue<Integer>> diagonals = new HashMap<>();

        for (int i = 0; i < mat.length; ++i)
            for (int j = 0; j < mat[0].length; ++j)
                diagonals.computeIfAbsent(i - j, param -> new PriorityQueue<>()).add(mat[i][j]);

        return diagonals;
    }
    
}