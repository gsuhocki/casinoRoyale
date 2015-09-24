package test.illcoder.casinoRoyale;
// import io.illcoder.casinoRoyale.core.Card;
//  import io.illcoder.casinoRoyale.core.Rank;
// import io.illcoder.casinoRoyale.core.Suit;

import test.illcoder.casinoRoyale.Rank;
import test.illcoder.casinoRoyale.Suit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by clouie on 9/23/15.
 */
public class CardTest {

    @Test
    public void getSuitTest(){
        Card card = new Card(Suit.HEARTS, Rank.TWO);


        assertEquals("Testing the value Card.HEART should return HEART", Suit.HEARTS, card.getSuit());
    }

/*    @Test
    public void getRankTest(){
        assertEquals("Testing the value Rank.Two");
    }
    */
}
