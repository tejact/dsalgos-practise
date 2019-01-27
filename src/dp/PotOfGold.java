package dp;

// Similar to this : https://www.techiedelight.com/pots-gold-game-dynamic-programming/
public class PotOfGold {
    public static int potOfGoldRecursive(int[] coins){
        return potOfGoldRecursive(coins,0,coins.length-1);
    }

    private static int potOfGoldRecursive(int[] coins, int start, int end) {
        if(start == end){
            return coins[start];
        }
        if(start + 1 == end){
           return Math.max(coins[start],coins[end]);
        }

        int maxWithStart = coins[start] + Math.min(potOfGoldRecursive(coins,start + 2, end),potOfGoldRecursive(coins,start + 1, end - 1));
        int maxWithEnd = coins[end] + Math.min(potOfGoldRecursive(coins,start, end - 2),potOfGoldRecursive(coins,start + 1, end - 1));
        return Math.max(maxWithStart,maxWithEnd);
    }

    public static int potOfGoldTopDown(int[] coins){
        int[][] cache = new int[coins.length][coins.length];
        return potOfGoldTopDown(coins,0,coins.length-1,cache);
    }

    private static int potOfGoldTopDown(int[] coins, int start, int end,int[][] cache) {
        if(start == end){
            return coins[start];
        }
        if(start + 1 == end){
            return Math.max(coins[start],coins[end]);
        }
        if(cache[start][end] == 0) {
            int maxWithStart = coins[start] + Math.min(potOfGoldRecursive(coins,start + 2, end),potOfGoldRecursive(coins,start + 1, end - 1));
            int maxWithEnd = coins[end] + Math.min(potOfGoldRecursive(coins,start, end - 2),potOfGoldRecursive(coins,start + 1, end - 1));
            cache [start][end] = Math.max(maxWithStart,maxWithEnd);
        }
        return cache[start][end];
    }

    //TODO: Complete this.
    public static int potOfGoldBottomUp(int[] coins){
        return 0;
    }

}
