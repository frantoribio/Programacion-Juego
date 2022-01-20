package org.example.utils;

import org.example.models.Platform;
import org.example.models.Stock;
import org.example.models.Tienda;

import java.util.*;

public class Utils {

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

    public static int tryNextInt(int min, int max){

        Scanner sc = new Scanner(System.in);
        int answer = min-1;
        boolean ok = false;

        do{
            try {
                answer = sc.nextInt();
                ok = (answer >= min && answer <= max);
            } catch (Exception e){
                sc.nextLine();
            }
        } while (!ok);
        return answer;
    }

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

    public static float rNum(int max , int min){
        return ((float)(Math.random()*(max-min)))+ min;
    }

}
