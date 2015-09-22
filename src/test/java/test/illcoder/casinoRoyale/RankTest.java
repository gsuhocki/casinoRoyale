package test.illcoder.casinoRoyale;

import io.illcoder.casinoRoyale.core.Rank;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by clouie on 9/22/15.
 */


public class RankTest {

    @Test
    public void getPokerValueTest(){
        assertEquals("Testing the value Rank.TWO should return 2 ", 2, Rank.TWO.getPokerValue());
    }

    @Test
    public void getBlackJackValueTest(){
        assertEquals("Testing the value Rank.TWO should return2", 2, Rank.TWO.getBlackJackValue());
    }
}