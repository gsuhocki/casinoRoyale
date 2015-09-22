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
        assertEquals("Testing the value Rank.TWO should return 2", 2, Rank.TWO.getPokerValue());
        assertEquals("Testing the value Rank.THREE should return 3", 3, Rank.THREE.getPokerValue());
        assertEquals("Testing the value Rank.FOUR should return 4", 4, Rank.FOUR.getPokerValue());
        assertEquals("Testing the value Rank.FIVE should return 5", 5, Rank.FIVE.getPokerValue());
        assertEquals("Testing the value Rank.SIX should return 6", 6, Rank.SIX.getPokerValue());
        assertEquals("Testing the value Rank.SEVEN should return 7", 7, Rank.SEVEN.getPokerValue());
        assertEquals("Testing the value Rank.EIGHT should return 8", 8, Rank.EIGHT.getPokerValue());
        assertEquals("Testing the value Rank.NINE should return 9", 9, Rank.NINE.getPokerValue());
        assertEquals("Testing the value Rank.TEN should return 10", 10, Rank.TEN.getPokerValue());
        assertEquals("Testing the value Rank.JACK should return 11", 11, Rank.JACK.getPokerValue());
        assertEquals("Testing the value Rank.QUEEN should return 12", 12, Rank.QUEEN.getPokerValue());
        assertEquals("Testing the value Rank.KING should return 13", 13, Rank.KING.getPokerValue());
        assertEquals("Testing the value Rank.ACE should return 14", 14, Rank.ACE.getPokerValue());
    }

    @Test
    public void getBlackJackValueTest(){
        assertEquals("Testing the value Rank.TWO should return 2", 2, Rank.TWO.getBlackJackValue());
        assertEquals("Testing the value Rank.THREE should return 3", 3, Rank.THREE.getBlackJackValue());
        assertEquals("Testing the value Rank.FOUR should return 4", 4, Rank.FOUR.getBlackJackValue());
        assertEquals("Testing the value Rank.FIVE should return 5", 5, Rank.FIVE.getBlackJackValue());
        assertEquals("Testing the value RANK.SIX should return 6", 6, Rank.SIX.getBlackJackValue());
        assertEquals("Testing the value Rank.SEVEN should return 7", 7, Rank.SEVEN.getBlackJackValue());
        assertEquals("Testing the value Rank.EIGHT should return 8", 8, Rank.EIGHT.getBlackJackValue());
        assertEquals("Testing the value Rank.NINE should return 9", 9, Rank.NINE.getBlackJackValue());
        assertEquals("Testing the value Rank.TEN should return 10", 10, Rank.TEN.getBlackJackValue());
        assertEquals("Testing the value Rank.JACK should return 10", 10, Rank.JACK.getBlackJackValue());
        assertEquals("Testing the value Rank.QUEEN should return 10", 10, Rank.QUEEN.getBlackJackValue());
        assertEquals("Testing the value Rank.KING should return 10", 10, Rank.KING.getBlackJackValue());
        assertEquals("Testing the value Rank.ACE should return 11", 11, Rank.ACE.getBlackJackValue());

    }


}
