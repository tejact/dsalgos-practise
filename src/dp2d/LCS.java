package dp2d;

// Length of common sub sequence
public class LCS {
    static int lcs(String a,String b){
        int[][] cache = new int[a.length() + 1][b.length() + 1];
        int m = cache.length;
        int n = cache[0].length;
        //Fill first row with 0
        // Use n as it is length
        for(int i = 0; i < n ; i++){
            cache[0][i] = 0;
        }
        //Fill first row with 0
        //Use m as it is width
        for(int j = 0; j < m; j++) {
            cache[j][0] = 0;
        }
        // LIS of null and null is 1
        // Here loop is based on table but not strings.
        // Decide between better way to do it.
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(a.charAt(i - 1) == b.charAt(j-1)){
                    cache[i][j] = 1 + cache[i-1][j-1];
                }else{
                    cache[i][j] = Math.max(cache[i-1][j],cache[i][j-1]);
                }
            }
        }
        // System.out.println(Arrays.deepToString(cache));
        return cache[m - 1][n - 1];
    }
}
