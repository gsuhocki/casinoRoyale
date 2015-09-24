package io.illcoder.casinoRoyale.core;

import java.util.*;
/**
 * Created by syoung on 9/22/15.
 *Build card deck to play poker or blackjack
 */
public class Deck {


        public static Card cards[];

        public Deck() {
            this.cards = new Card[52];
            for (int i = 0; i < cards.length; i++) {
                Card card = new Card();
                this.cards[i] = card;
            }
        }


    }






