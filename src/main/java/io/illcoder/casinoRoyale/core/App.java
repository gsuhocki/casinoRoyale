package io.illcoder.casinoRoyale.core;
import io.illcoder.casinoRoyale.blackjack.BlackjackDealer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by syoung on 9/22/15.
 */
public class App {
//intiates scanner for entire class
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) throws IOException {
        Player player = new Player();


        //InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        //BufferedReader br = new BufferedReader(inputStreamReader);

        System.out.println(" __   __    ______     ___           _______. __  .__   __.   ______      .______        ______   ____    ____  ___       __       _______  __   __  \n" +
                "|  | |  |  /      |   /   \\         /       ||  | |  \\ |  |  /  __  \\     |   _  \\      /  __  \\  \\   \\  /   / /   \\     |  |     |   ____||  | |  | \n" +
                "|  | |  | |  ,----'  /  ^  \\       |   (----`|  | |   \\|  | |  |  |  |    |  |_)  |    |  |  |  |  \\   \\/   / /  ^  \\    |  |     |  |__   |  | |  | \n" +
                "|  | |  | |  |      /  /_\\  \\       \\   \\    |  | |  . `  | |  |  |  |    |      /     |  |  |  |   \\_    _/ /  /_\\  \\   |  |     |   __|  |  | |  | \n" +
                "|__| |__| |  `----./  _____  \\  .----)   |   |  | |  |\\   | |  `--'  |    |  |\\  \\----.|  `--'  |     |  |  /  _____  \\  |  `----.|  |____ |__| |__| \n" +
                "(__) (__)  \\______/__/     \\__\\ |_______/    |__| |__| \\__|  \\______/     | _| `._____| \\______/      |__| /__/     \\__\\ |_______||_______|(__) (__) \n" +
                "                                                                                                                                                     ");
        System.out.print("The Casino Royale's doors swoosh open at your approach.\n A myriad of fragrances and aromas accompany the cool\n" +
                "air that makes the dry heat of desert \n a distant memory. A middle aged attendant" +
                " with a snake like smile you don't trust approaches. Hey whats your name pal?: ");
        //This string will set the players name
        String enteredName = scanner.nextLine();
        //Player player.name = enteredName;
        //start loop for switch statement
        Boolean continueLoop = true;
        //Prompt and input for player to choose a game
        Scanner in = new Scanner(System.in);
            System.out.printf("Welcome to the Game room Whale! what do you wanna play? " +
                    "1 for BlackJack, " +
                    "2 for Poker, or " +
                    "0 to quit:  ");
        while (continueLoop) {
            int input = in.nextInt();
            int gameType = input;
            String gameSelection;
            switch (gameType) {
                case 1:
                    gameSelection = " You strut confidently to the BlackJack table." +
                            " A slovenly man past his prime gaze meets yours as sit, he smiles confident of his pending victory.";
                     class BlackjackDealer extends Dealer{
                        Object BJ = new BlackjackDealer();
                    }
                    break;
                case 2:
                    gameSelection = "You have a seat at the poker table. Your opponent smells like urine and failed dreams.";
                     class PokerDealer extends Dealer {
                        Object PD = new PokerDealer();
                    }
                    break;
                case 0:
                    gameSelection = "You cut and run out the front door on foot. Your getting to old for this shit.";
                    break;
                default:
                    System.out.println( "It's either 1 for BlackJack, 2 for Poker, or 0 to quit...This ain't rocket science kid.");
                    continue ;

            }
            System.out.println(gameSelection);
            //close loop to end program
            continueLoop = false;
        }

    }
}
