package org.example;

import org.example.Builder.StockBuilder;
import org.example.models.Stock;
import org.example.models.Tienda;


public class App {

    public static void main( String[] args ) {

        Tienda t = new Tienda();

        t.setName("pepe shop");

        randomizeShop(t);

        System.out.println("before sort");
        t.printAll();

        t.sortByPrice();

        System.out.println("after sort price");
        t.printAll();

        t.sortByTitle();
        System.out.println("after sort title");
        t.printAll();

        t.sortByPlatform();
        System.out.println("after sort platform");
        t.printAll();

        t.sortByStock();
        System.out.println("after sort stock");
        t.printAll();

        t.reverse();
        System.out.println("reversed");
        t.printAll();
    }

    static void randomizeShop(Tienda t){

        for (int i = 0; i < 30; i++) {
            Stock s = StockBuilder.randomBuild();
            t.addGame(s);
        }

    }
}
