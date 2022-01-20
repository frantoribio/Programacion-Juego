package org.example.models;

import java.util.Locale;

public class Juego {

    private String title;
    private float price;
    private Platform platform;

    public Juego(){

    }

    public Juego(String title, float price, String platform){

        setPlatform(platform);
        this.title = title.toUpperCase(Locale.ROOT);
        this.price = price;

    }

    public Juego(String title, float price, Platform platform){

        this.platform = platform;
        this.title = title.toUpperCase(Locale.ROOT);
        this.price = price;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {

        if (title.trim().equals("")){
            throw new IllegalArgumentException("Tittle not allowed");
        }
        this.title = title.trim().toUpperCase(Locale.ROOT);
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price< 0 || price > 200){
            throw new IllegalArgumentException("price not allowed, should be between [0 / 200.00]");
        }
        this.price = ((float)Math.round(price*100)) / 100;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {

        this.platform = Platform.valueOf(platform.trim().toUpperCase(Locale.ROOT));

    }

    public void setPlatform(Platform platform) {

        if (platform == null){
            throw new IllegalArgumentException("not allowed platform");
        }

        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", platform=" + platform +
                '}';
    }

    public int compareToTtitle(Juego juego){
        int length = this.title.length();
        if(juego.title.length() < this.title.length()){
            length = juego.title.length();
        }

        for (int i = 0; i < length; i++) {
            if(this.title.charAt(i) > juego.title.charAt(i)){
                return 1;
            } else if(this.title.charAt(i) < juego.title.charAt(i)){
                return -1;
            }
        }

        return 0;
    }

    public int compareToPrice(Juego juego){
        return Float.compare(price, juego.getPrice());
    }

    public int compareToPlatform(Juego juego){
        return platform.compareTo(juego.getPlatform());
    }
}
