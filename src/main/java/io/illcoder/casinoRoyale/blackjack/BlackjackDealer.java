package io.illcoder.casinoRoyale.blackjack;

import io.illcoder.casinoRoyale.core.Dealer;
import io.illcoder.casinoRoyale.core.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by syoung on 9/22/15.
 */
public class BlackjackDealer extends Dealer {

    public BlackjackDealer()   {


    }


    public void runGame() throws IOException {

        String gameMessage= "Starting BlackJack... ";
        Boolean continueLoop = true;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(continueLoop){
            String input = br.readLine();
            int intInput = Integer.parseInt(input);
            takeWager(intInput);
            System.out.println("Enter response");

            if (input.equals("quit"))  continueLoop = false;





        }

    }
}
