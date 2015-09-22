package io.illcoder.casinoRoyale.core;

/**
 * Created by clouie on 9/22/15.
 */
public enum Rank {
    TWO(2,2), THREE(3,3);

    private int pokerValue;
    private int blackJackValue;

    Rank(int pokerValue, int blackJackValue){
        this.pokerValue = pokerValue;
        this.blackJackValue = blackJackValue;

    }

    public int getPokerValue(){
        return this.pokerValue;
    }

    public int getBlackJackValue(){
        return this.blackJackValue;
    }
}
