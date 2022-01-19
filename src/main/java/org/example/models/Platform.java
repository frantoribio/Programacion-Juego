package org.example.models;

public enum Platform {

    PC,
    XBOX,
    PLAYSTATION,
    SWITCH;

    public static String allValues(){
        String st = "";
        for (Platform p:Platform.values()) {
            st += p + ", ";
        }
        return st;
    }
}
