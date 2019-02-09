package dp2d;

public class EditDistance {
    static int editDistance(String a,String b){
        int[][] cache = new int[a.length() + 1][b.length() + 1];
        int m = cache.length;
        int n = cache[0].length;
        for(int i = 0; i < m; i++){
            cache[i][0] = i;
        }
        for(int j = 0; j < n; j++){
            cache[0][j] = j;
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(a.charAt(i-1) == b.charAt(j-1)){
                    cache[i][j] = cache[i-1][j-1];
                }else{
                    cache[i][j] = 1 + min(cache[i-1][j-1],cache[i-1][j],cache[i][j-1]);
                }
            }
        }
        return cache[m-1][n-1];
    }

    private static int min(int a,int b,int c){
        if(a < b && a < c){
            return a;
        }else if(b < a && b < c){
            return b;
        }else{
            return c;
        }
    }
}
