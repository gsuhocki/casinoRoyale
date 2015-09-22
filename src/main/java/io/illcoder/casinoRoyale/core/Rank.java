package io.illcoder.casinoRoyale.core;

/**
 * Created by clouie on 9/22/15.
 */
public enum Rank {
    TWO(2,2), THREE(3,3), FOUR(4,4), FIVE(5,5), SIX(6,6), SEVEN(7,7), EIGHT(8,8), NINE(9,9), TEN(10,10), JACK(11,10),
    QUEEN(12,10), KING(13,10), ACE(14,11);

    private int pokerValue;
    private int blackJackValue;

    /**
     * Rank object Constructor
      * @param pokerValue
     * @param blackJackValue
     */
    Rank(int pokerValue, int blackJackValue){
        this.pokerValue = pokerValue;
        this.blackJackValue = blackJackValue;

    }

    /**
     * These functions get the various attributes for the Rank object
      * @return
     */
    public int getPokerValue(){
        return this.pokerValue;
    }

    public int getBlackJackValue(){
        return this.blackJackValue;
    }
}
