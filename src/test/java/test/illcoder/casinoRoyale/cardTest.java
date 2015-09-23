package test.illcoder.casinoRoyale;

import io.illcoder.casinoRoyale.core.Rank;
import org.junit.Test;

import io.illcoder.casinoRoyale.core.Card;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by gsuhocki on 9/22/15.
 */


public class cardTest {

    /**
     * Created by gsuhocki on 9/23/15.
     */



        @Test
        public void getRankTest(){
            assertEquals("Testing the value Rank.TWO should return 2",2, Card.TWO.getRank());
        }

        @Test
        public void getSuitTest(){
            assertEquals("Testing the value Rank.TWO should return 2",2, Card.TWO.getSuit());

        }

    }



}
