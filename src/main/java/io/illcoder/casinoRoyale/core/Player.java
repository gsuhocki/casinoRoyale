package io.illcoder.casinoRoyale.core;

/**
 * Created by syoung on 9/22/15.
 */
public class Player {
    private String name;
    private int money = 500;
    private Card[] hand = new Card[10];


    public Player(String name){
        this.name = name;
    }

    public Player(){

    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public Card[] getHand() {
        return hand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
