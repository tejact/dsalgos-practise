package dp;

public class LIS {
    public static void main(String[] args) {

    }

    public static int lengthOfLIS(int[] nums){
        int[] cache  = new int[nums.length];
        for(int i = 0; i < cache.length; i++){
            cache[i] = 1;
        }
        int lis = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    cache[i] = Math.max(cache[i],cache[j] + 1);
                }
            }
            lis = Math.max(lis,cache[i]);
        }
        return lis;
    }
}
