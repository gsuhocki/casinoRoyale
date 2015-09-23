package io.illcoder.casinoRoyale.core;

/**
 * Created by syoung on 9/22/15.
 */


public class Card {

    enum Suit{SPADE,DIAMOND,CLUB, HEART}
    enum Rank{TWO, THREE, JACK}

    private Suit suit;
    private Rank rank;

    private int valuePoker;
    private int valueBlackJack;

    /**
     * Constructor for Card class
     * @param suit
     * @param rank
     */
     Card(Suit suit, Rank rank){

        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit(){
        return this.suit;
    }

    public Rank getRank(){
        return this.rank;
    }

    public int getValuePoker(){
        return valuePoker;
    }

    public int getValueBlackJack(){
        return valueBlackJack;
    }
}
