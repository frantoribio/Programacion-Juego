package org.example;

import org.example.Builder.JuegoBuilder;
import org.example.models.Juego;
import org.example.models.Platform;
import org.example.utils.JuegoUtils;


public class App {

    public static void main( String[] args ) {

        Juego[] tienda = new Juego[3];

        //From builder example
        tienda[0] = new Juego("Super mario bros", 60f, Platform.SWITCH);
        //From input Example
        tienda[1] = JuegoBuilder.inputBuild();
        //Random example
        tienda[2] = JuegoBuilder.randomBuild();

        print(tienda);

    }

    static void print(Juego[] tienda){
        for (Juego juego:tienda) {
            System.out.println(juego);
        }
    }
}
