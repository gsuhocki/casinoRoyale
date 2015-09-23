package test.illcoder.casinoRoyale;

import org.junit.Test;
import static org.junit.Assert.*;
import test.illcoder.casinoRoyale;

/**
 * Created by gsuhocki on 9/23/15.
 */

public class RankTest {

    @Test
    public void getPokerValueTest(){
        assertEquals("Testing the value Rank.TWO should return 2",2, Rank.TWO.getPokerValue());
    }

    @Test
    public void getBlackJackValueTest(){
        assertEquals("Testing the value Rank.TWO should return 2",2, Rank.TWO.getBlackJackValue());

    }

}
