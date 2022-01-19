package org.example.Builder;

import org.example.models.Juego;
import org.example.models.Platform;
import org.example.utils.JuegoUtils;
import org.example.utils.Utils;

public class JuegoBuilder {


    public static Juego inputBuild(){

        System.out.println("Type the title [not empty]");
        String title = Utils.tryNextString();

        System.out.println("Type the price [0.00 / 200.00]");
        float price = Utils.tryNextFloat(0,200);

        System.out.println("Type the platform ["+ Platform.allValues()+"]");
        Platform platform = Utils.tryNextPlatform();

        return new Juego(title, price, platform);
    }

    public static Juego randomBuild(){

        String title = JuegoUtils.randomTitle();
        float price = JuegoUtils.randomPrice();
        Platform platform = JuegoUtils.randomPlatform();

        return new Juego(title, price, platform);
    }
}
