package dp2d;

import org.junit.jupiter.api.Test;

import static dp2d.LCS.lcs;
import static dp2d.LCSubstring.lcSubstring;
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
}