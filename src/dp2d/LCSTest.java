package dp2d;

import static dp2d.LCS.lcs;
import static org.junit.jupiter.api.Assertions.*;

class LCSTest {
    @org.junit.jupiter.api.Test
    void lis_simple(){
        assertEquals(2,lcs("abcau","chiru"));
        assertEquals(0,lcs("abc","def"));
        assertEquals(3,lcs("catabc","abcat"));
        assertEquals(5,lcs("ACFEFXVGAB","ABCDSEFGD"));
    }


}