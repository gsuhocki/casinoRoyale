package test.illcoder.casinoRoyale;
import io.illcoder.casinoRoyale.core.Card;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by clouie on 9/23/15.
 */
public class CardTest {

    @Test
    public void getSuitTest(){
        assertEquals("Testing the value Card.HEART should return HEART", HEART, Card.HEART.getSuit());
    }

}
