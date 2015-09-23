package io.illcoder.casinoRoyale.core;

/**
 * Created by syoung on 9/22/15.
 */



public enum Card {

    TWO(2, 2), THREE(3, 3), FOUR(4, 4), FIVE(5, 5), SIX(6, 6), SEVEN(7, 7), EIGHT(8, 8), NINE(9, 9), TEN(10, 10), JACK(11, 10),
    QUEEN(12, 10), KING(13, 10), ACE(14, 11);

    private Suit suit;
    private Rank rank;

    Card (Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;

    }

    Rank getRank(){
        return rank;
    }

    Suit getSuit(){
        return suit;
    }

    public String toString(){
        return "This Card is "+ rank + "of"+ suit;
    }

}
