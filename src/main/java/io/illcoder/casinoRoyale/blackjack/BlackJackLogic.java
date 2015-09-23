package io.illcoder.casinoRoyale.blackjack;

import io.illcoder.casinoRoyale.core.Dealer;
import io.illcoder.casinoRoyale.core.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 * Created by syoung on 9/22/15.
 */



public class BlackJackLogic extends Dealer {

Scanner scan = new Scanner(System.in);

    public BlackJackLogic() {

    }


    public int takeWager(){
        System.out.println("Please make your wager  ");
        int wager =  scan.nextInt();
        System.out.println("Your wager of " + wager);


        return wager;
    }







    /**
     * BlackJack constructor that gets info from Player class
     * @param player human player that created game at beginning of app.
     */
    public BlackJackLogic(Player player)   {
        BlackJackLogic blackJackLogic = new BlackJackLogic(player);



    }

    @Override
    public String quit(){
       String quitMessage = "Thanks for playing!";

        return quitMessage;


    }

    /**
     * Pauses for 1/2 a second.
     */
    public void pause(){

        try {
            Thread.sleep(500);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }



    }

    /**
     * Pauses for
     * @param amountOfTime * 1000 to convert to milliseconds.
     */
    public void pause(int amountOfTime){
        amountOfTime *= 1000;
        try {
            Thread.sleep(amountOfTime);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }



    }

    /**
     * Gives player another card.
     */
    public void hit(){
        System.out.println("Have another card");

    }


    /**
     * Doesn't take a card on turn
     */
    public String stay(){
        String lucky = "You must think your lucky!";
        return lucky;
    }

//    public String calcScore(){
//        int playerScore = 0
//        if ()
//    }


    public void runGame(Player player) throws IOException {

       Player cpu = new Player();



        System.out.println("Starting BlackJack... ");



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         Boolean continueLoop = true;

        while(continueLoop){
            System.out.println("Welcome to Ultimate ");
            pause(1);
            System.out.println("__________ .__                    __          ____.                 __     \n" +
                    "\\______   \\|  |  _____     ____  |  | __     |    |_____     ____  |  | __ \n" +
                    " |    |  _/|  |  \\__  \\  _/ ___\\ |  |/ /     |    |\\__  \\  _/ ___\\ |  |/ / \n" +
                    " |    |   \\|  |__ / __ \\_\\  \\___ |    <  /\\__|    | / __ \\_\\  \\___ |    <  \n" +
                    " |______  /|____/(____  / \\___  >|__|_ \\ \\________|(____  / \\___  >|__|_ \\ \n" +
                    "        \\/            \\/      \\/      \\/                \\/      \\/      \\/ ");
            String input = br.readLine();

            int intInput = Integer.parseInt(input);
            //takeWager(intInput);
            System.out.println("Enter response");










        }

    }
}
