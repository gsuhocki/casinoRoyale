package io.illcoder.casinoRoyale.core;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
=======
>>>>>>> f83e9caf7263e33a20c27947f67690d32fe2b356
import java.util.*;

/**
 * Created by syoung on 9/22/15.
<<<<<<< HEAD
 *Build card deck to play poker or blackjack
 *
 */
public class Deck {
    List<Card> deck;

    /**
     *Create a new array list for each Suit of cards 2 through Ace and prints out the size of the deck
     * The deck is the shuffled after created
     */
    public Deck(){
        deck = new ArrayList();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
               deck.add(new Card(suit, rank));
            }
        }
       // System.out.println(deck.get(0));
        //Collections.shuffle(deck);
        //System.out.println(deck.get(0));
    }


    public void shuffleDeck(List<Card> _deck){
        //private List<Card> sDeck;
       // sDeck = _deck;
        Collections.shuffle(_deck);
        //return sDeck;
    }

    public List<Card> getShuffledDeck(){
        return deck;
    }

    public static void main (String[] args){
        Deck deck1 = new Deck();
        List<Card> deck2 = deck1.getShuffledDeck();
        System.out.println(deck2.get(0));
        deck1.shuffleDeck(deck2);

        System.out.println(deck2.get(0));
    }

}












=======
 * Build card deck to play poker or blackjack
 */
public class Deck {

    public static Card cards[];

    public Deck() {
        this.cards = new Card[52];
        for (i=0;i<cards.length;i++){
            Card card = new Card();
            this.cards[i] = card;
        }

    public void shuffle() {
        Collections.shuffle(cards);

    }

}
>>>>>>> f83e9caf7263e33a20c27947f67690d32fe2b356
