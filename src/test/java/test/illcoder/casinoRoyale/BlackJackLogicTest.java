package test.illcoder.casinoRoyale;

import io.illcoder.casinoRoyale.blackjack.BlackJackLogic;
import io.illcoder.casinoRoyale.core.Player;
import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;


/**
 * Created by sstrauss on 9/22/15.
 */
public class BlackJackLogicTest {

    BlackJackLogic blackJackLogic = new BlackJackLogic();
    @Test
    public void testsPause(){

        System.out.println("check timer");
        blackJackLogic.pause(3);

        System.out.println("__________ .__                    __          ____.                 __     \n" +
                "\\______   \\|  |  _____     ____  |  | __     |    |_____     ____  |  | __ \n" +
                " |    |  _/|  |  \\__  \\  _/ ___\\ |  |/ /     |    |\\__  \\  _/ ___\\ |  |/ / \n" +
                " |    |   \\|  |__ / __ \\_\\  \\___ |    <  /\\__|    | / __ \\_\\  \\___ |    <  \n" +
                " |______  /|____/(____  / \\___  >|__|_ \\ \\________|(____  / \\___  >|__|_ \\ \n" +
                "        \\/            \\/      \\/      \\/                \\/      \\/      \\/ ");

        blackJackLogic.pause();
        System.out.println("__________ .__                    __          ____.                 __     \n" +
                "\\______   \\|  |  _____     ____  |  | __     |    |_____     ____  |  | __ \n" +
                " |    |  _/|  |  \\__  \\  _/ ___\\ |  |/ /     |    |\\__  \\  _/ ___\\ |  |/ / \n" +
                " |    |   \\|  |__ / __ \\_\\  \\___ |    <  /\\__|    | / __ \\_\\  \\___ |    <  \n" +
                " |______  /|____/(____  / \\___  >|__|_ \\ \\________|(____  / \\___  >|__|_ \\ \n" +
                "        \\/            \\/      \\/      \\/                \\/      \\/      \\/ ");

    }

    Player p1 = new Player("Sean");
    @Test
    public void testBlackJackConstructorWithPlayerInput(){


        BlackJackLogic blackJackLogic = new BlackJackLogic(p1);
        Assert.assertEquals("Should be the created Player at the beginning of the game", "Sean", p1.getName());

    }

    @Test
    public void checkStayFunction(){
        BlackJackLogic blackJackLogic = new BlackJackLogic(p1);
        Assert.assertEquals("Should print message saying message", "You must think your lucky!", blackJackLogic.stay());
    }


//    @Test
//    public void checkBlackJackPointConstrains(){
//        Assert.assertEquals("If score ever goes above 21, that player automatically loses.", "You lose", );
//    }

    @Test
    public void checkIfInputIsBeingTakenInAsInt(){
        Assert.assertEquals("Should return the users wager as an int", 50, blackJackLogic.takeWager());
    }
    @Test
    public int takeWager(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please make your wager  ");
        int wager =  scan.nextInt();
        System.out.println("Your wager of " + wager);


        return wager;
    }
}