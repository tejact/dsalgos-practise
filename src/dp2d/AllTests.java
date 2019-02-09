package dp2d;

import org.junit.jupiter.api.Test;

import static dp2d.EditDistance.editDistance;
import static dp2d.LCS.lcs;
import static dp2d.LCSubstring.lcSubstring;
import static dp2d.MinCostPath.minCostPath;
import static org.junit.jupiter.api.Assertions.*;

class AllTests {
    @Test
    void lis_simple(){
        assertEquals(2,lcs("abcau","chiru"));
        assertEquals(0,lcs("abc","def"));
        assertEquals(3,lcs("catabc","abcat"));
        assertEquals(5,lcs("ACFEFXVGAB","ABCDSEFGD"));
    }

    @Test
    void lcString_simple(){
        assertEquals(0,lcSubstring("",""));
        assertEquals(3,lcSubstring("abc","abc"));
        assertEquals(4,lcSubstring("abcdxyz","xyzabcd"));
        assertEquals(0,lcSubstring("abcd","xyz"));
        assertEquals(1,lcSubstring("abRcd","xyRz"));
    }

    @Test
    void editDistance_simple(){
        assertEquals(0,editDistance("",""));
        assertEquals(3,editDistance("abc",""));
        assertEquals(3,editDistance("","abc"));
        assertEquals(3,editDistance("horse","ros"));
        assertEquals(5,editDistance("intention","execution"));
    }

    @Test
    void minCost_simple(){
        int[][] a = new int[][]{
                {1,3,1},
                {1,5,1},
                {4,2,1},
        };
        assertEquals(7, minCostPath(a));

        int[][] b = new int[][]{
                {2,1,5,1},
                {3,4,2,2},
                {1,2,3,3},
                {1,3,2,4}
        };
        assertEquals(16, minCostPath(b));
    }
}