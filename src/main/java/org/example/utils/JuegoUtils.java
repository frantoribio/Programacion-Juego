package org.example.utils;

import org.example.models.Platform;

import java.util.Locale;
import java.util.Scanner;

public class JuegoUtils {

    public static Platform tryNextPlatform(){

        Scanner sc = new Scanner(System.in);
        String answer;
        boolean ok = false;
        Platform platform = null;

        do{
            answer = sc.nextLine();

            try {
                platform = Platform.valueOf(answer.toUpperCase(Locale.ROOT).trim());
                ok = true;
            } catch (Exception e){
                sc.nextLine();
            }

        } while (!ok);
        return platform;
    }

    public static float tryNextFloat(float min, float max){

        Scanner sc = new Scanner(System.in);
        float answer = min-1;
        boolean ok = false;

        do{
            try {
                answer = sc.nextFloat();
                ok = (answer >= min && answer <= max);
            } catch (Exception e){
                sc.nextLine();
            }
        } while (!ok);
        return answer;
    }

    public static String tryNextString(){

        Scanner sc = new Scanner(System.in);
        String answer;
        boolean ok;

        do{
            answer = sc.nextLine();
            answer = answer.trim().toUpperCase(Locale.ROOT);
            ok = !answer.equals("");
        } while (!ok);

        return answer;
    }

}
