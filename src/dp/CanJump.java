package dp;
class CanJump {
    public static boolean canJump(int[] nums) {
        boolean[] canReach = new boolean[nums.length];
        canReach[0] = true;
        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(canReach[j] && (i - j <= nums[j])){
                    canReach[i] = true;
                    break;
                }
            }
        }
        return canReach[canReach.length - 1];
    }
}
