package org.example;

import org.example.models.Juego;
import org.example.models.Platform;
import org.example.utils.JuegoUtils;


public class App {

    public static void main( String[] args ) {

        Juego[] tienda = new Juego[3];

        tienda[0] = new Juego("Super mario bros", 60f, Platform.SWITCH);
        tienda[1] = new Juego("Call of duty", 40f, Platform.PLAY);
        String title = JuegoUtils.tryNextString();
        float price = JuegoUtils.tryNextFloat(0,200);
        Platform platform = JuegoUtils.tryNextPlatform();
        tienda[2] = new Juego(title, price, platform);


    }
}
