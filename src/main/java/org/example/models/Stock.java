package org.example.models;

public class Stock {

    Juego game;
    int amount;

    public Stock(Juego game, int amount){
        this.amount = amount;
        this.game = game;
    }

    public Juego getGame() {
        return game;
    }

    public int getAmount() {
        return amount;
    }
}
