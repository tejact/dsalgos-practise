package dp2d;

class LCSubstring {
     static int lcSubstring(String a,String b){
        int[][] cache = new int[a.length() + 1][b.length() + 1];
        int m = cache.length;
        int n = cache[0].length;
        //base cases
        for(int i = 0; i < m; i++){
            cache[i][0] = 0;
        }
        for(int i = 0; i < n; i++){
            cache[0][i] = 0;
        }

        //Variable to track maxLen as it is not garunteed to get the length from the last cell
        int maxLen = 0;
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                // similar to longest common substring.
                // but when the chars are not matched. Reset to 0
                if(a.charAt(i-1) == b.charAt(j-1)){
                    cache[i][j] = 1 + cache[i-1][j-1];
                    maxLen = Math.max(maxLen,cache[i][j]);
                }else{
                    cache[i][j] = 0;
                }
            }
        }
        return maxLen;
    }
}
