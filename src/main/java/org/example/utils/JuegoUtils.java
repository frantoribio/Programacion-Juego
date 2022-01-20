package org.example.utils;

import org.example.models.Platform;

import java.util.Random;

public class JuegoUtils {

    private final static String[] TITLES = {"Mario","Call of duty","Kirby","League of legends","Clash royal","Monster hunter","Advance wars","Nintendogs","God of war","Plants vs zombies","Cuphead","Bomberman","Wii fit","Autochess","Valorant","Team Fights Tactics","Zelda","Mega Man","Metroid Dread","Duck Hunt","Ratchet and clank"};


    public static String randomTitle(){
        Random r = new Random();
        int index = r.nextInt(TITLES.length);
        return TITLES[index];
    }

    public static float randomPrice(){
        int rNum = (int)Utils.rNum(100, 0);
        float price;
        if(rNum < 10){
            price = 0;
        } else if(rNum < 50) {
            price = Utils.rNum(40,20);
        } else {
            price = Utils.rNum(100, 50);
        }
        return price;
    }

    public static Platform randomPlatform(){
        int rNum = (int)Utils.rNum(100, 0);
        Platform platform;
        if(rNum < 10){
            platform = Platform.SWITCH;
        } else if(rNum < 30) {
            platform = Platform.XBOX;
        } else if(rNum < 60){
            platform = Platform.PC;
        } else {
            platform = Platform.PLAYSTATION;
        }
        return platform;
    }
}
