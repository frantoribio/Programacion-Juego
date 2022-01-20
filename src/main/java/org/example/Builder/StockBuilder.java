package org.example.Builder;

import org.example.models.*;
import org.example.utils.Utils;

public class StockBuilder {

    public static Stock inputBuilder(){
        Juego j = JuegoBuilder.inputBuild();

        System.out.println("Insert the stock amount [1 / 50]");
        int amount = Utils.tryNextInt(1,50);

        return new Stock(j,amount);
    }
    public static Stock randomBuild(){
        Juego j = JuegoBuilder.randomBuild();
        int amount = (int)Utils.rNum(50,1);

        return new Stock(j,amount);
    }
}
