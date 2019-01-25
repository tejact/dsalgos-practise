package dp;

import static dp.LAS.lengthOfLAS;
import static dp.LIS.lengthOfLIS;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AllTest {
    @org.junit.jupiter.api.Test
    public void lis_simple(){
        assertEquals(1,lengthOfLIS(new int[]{1,1,1,1,1,1,1}));
        assertEquals(1,lengthOfLIS(new int[]{5,4,3,2,1}));
        assertEquals(5,lengthOfLIS(new int[]{1,2,3,4,5}));
        assertEquals(4,lengthOfLIS(new int[]{6,9,10,7,12}));
        assertEquals(1,lengthOfLIS(new int[]{6}));
        assertEquals(2,lengthOfLIS(new int[]{6,7}));
        assertEquals(1,lengthOfLIS(new int[]{7,7}));
    }

    @org.junit.jupiter.api.Test
    public void LAS_simple(){
        assertEquals(1,lengthOfLAS(new int[]{1}));
        assertEquals(2,lengthOfLAS(new int[]{1,2}));
        assertEquals(2,lengthOfLAS(new int[]{2,1}));
        assertEquals(2,lengthOfLAS(new int[]{1,2,3,4,5}));
        assertEquals(2,lengthOfLAS(new int[]{5,4,3,2,1}));
        assertEquals(4,lengthOfLAS(new int[]{1,9,6,20,100,200}));
        assertEquals(4,lengthOfLAS(new int[]{1,9,6,20,100,200}));
        assertEquals(7,lengthOfLAS(new int[]{10,15,11,14,12,13,11,9}));
    }

}