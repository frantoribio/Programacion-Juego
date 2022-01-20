package org.example.models;

public class Stock extends Juego {

    Juego game;
    int amount;

    public Stock(Juego game, int amount){

        super();
        this.game = game;
        this.amount = amount;

    }

    public Juego getGame() {
        return game;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "game=" + game +
                ", amount=" + amount +
                '}';
    }

    public int compareToPrice(Stock s){
        return this.game.compareToPrice(s.getGame());
    }

    public int compareToTitle(Stock s){
        return this.game.compareToTtitle(s.getGame());
    }

    public int compareToPlatform(Stock s){
        return this.game.compareToPlatform(s.getGame());
    }

    public int compareToStock(Stock s){
        return Integer.compare(amount, s.getAmount());
    }

}
