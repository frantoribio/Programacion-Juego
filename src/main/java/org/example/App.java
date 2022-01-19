package org.example;

import org.example.Builder.JuegoBuilder;
import org.example.Builder.StockBuilder;
import org.example.models.Juego;
import org.example.models.Platform;
import org.example.models.Stock;
import org.example.models.Tienda;
import org.example.utils.JuegoUtils;


public class App {

    public static void main( String[] args ) {

        Tienda t = new Tienda();

        t.setName("pepe shop");

        randomizeShop(t);

        t.addGame(StockBuilder.inputBuilder());

        t.printStock();

    }

    static void randomizeShop(Tienda t){

        for (int i = 0; i < 30; i++) {
            Stock s = StockBuilder.randomBuild();
            t.addGame(s);
        }

    }
}
