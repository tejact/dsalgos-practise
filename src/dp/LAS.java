package dp;

import java.util.Arrays;

public class LAS {
   public static int lengthOfLAS(int[] nums){
       int[] endWithBig = new int[nums.length];
       for(int i = 0; i < endWithBig.length ; i++){
           endWithBig[i] = 1;
       }

       int[] endWithSmall = new int[nums.length];
       for(int i = 0; i < endWithSmall.length ; i++){
           endWithSmall[i] = 1;
       }

       for(int i = 0; i < nums.length; i++){
           for(int j = 0; j < i; j++){
               if(nums[i] > nums[j]){
                   // the structure of j,i  is .* , so we are going to update endWithBig
                   // it can be maximum of current OR at +1 of the length of series ending with small at j
                   // Ex: 5,4,10. Suppose i = 1 and j = 2. Then endWithBig is 1 + length of (5,4)
                   // length of 5,4 is endWithSmall at j
                   endWithBig[i] = Math.max(endWithBig[i],endWithSmall[j] + 1);
               }

               if(nums[j] > nums [i]){
                   endWithSmall[i] = Math.max(endWithSmall[i],endWithBig[j] + 1);
               }
           }
       }
       //Debug
       System.out.println(Arrays.toString(endWithSmall));
       System.out.println(Arrays.toString(endWithBig));
       return Math.max(endWithBig[endWithBig.length - 1],endWithSmall[endWithSmall.length - 1]);
   }
}
