package dp2d;

import java.util.Arrays;

class MinCostPath {
     static int minCostPath(int[][] matrix){
        int[][] cache = new int[matrix.length][matrix[0].length];
        int m = cache.length;
        int n = cache[0].length;
        // the first cell is itself
        cache[0][0] = matrix[0][0];
        //populate first column. It the cummulative sum at each cell
        for(int i = 1; i < m; i++){
            cache[i][0] = cache[i-1][0] + matrix[i][0];
        }
        //populate first row. It is the cumulative sum at each cell in the row
        for(int j = 1; j < m; j++){
            cache[0][j] = cache[0][j-1] +  matrix[0][j];
        }
        // iterate for remaining
        for(int i = 1; i < m ; i++){
            for(int j = 1; j < n; j++){
                // current + min of either top of left
                cache[i][j] = matrix[i][j] + Math.min(cache[i-1][j],cache[i][j-1]);
            }
        }
        System.out.println(Arrays.deepToString(cache));
        return cache[m-1][n-1];
    }
}
