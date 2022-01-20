package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class Tienda {

    private String name;
    private ArrayList<Stock> storage = new ArrayList<>();

    public Tienda(){
    }

    Tienda(String name, ArrayList<Stock> storage){
        this.name = name;
        this.storage = storage;
    }

    public ArrayList<Stock> getGames() {
        return storage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().equals("")){
            throw new IllegalArgumentException("Empty name not allowed");
        }
        this.name = name.trim().toUpperCase(Locale.ROOT);
    }

    public void setGames(ArrayList<Stock> games) {
        if (games.size() == 0){
            throw new IllegalArgumentException("Empty game list not allowed");
        }
        this.storage = games;
    }

    public void removeGame(int index) {
        storage.remove(index);
    }

    public void addGame(Stock game) {
        storage.add(game);
    }
    public void addGame(Juego game) {
        storage.add(new Stock(game,1));
    }

    public void addGame(Juego game, int amount) {
        storage.add(new Stock(game,amount));
    }

    public String toString(){

        StringBuilder st = new StringBuilder();
        int index = 0;
        for(Stock game: storage){
            index++;
            st.append(index).append("- ").append(game.getGame().toString()).append("\n");
        }

        return st.toString();
    }

    public void printStock(){
        System.out.println("Game amount = "+ getTotalStock());
        System.out.println("Platform distributions: \n"+
                "PC - Number: " + getPcNum() + ", Percentage: " + getPcPer() + "\n" +
                "SWITCH - Number: " + getSwitchNum() + ", Percentage: " + getSwitchPer() + "\n" +
                "PLAYSTATION - Number: " + getPlayStationNum() + ", Percentage: " + getPlayStationPer() + "\n" +
                "XBOX - Number: " + getXboxNum() + ", Percentage: " + getXboxPer());
    }

    private int getTotalStock(){
        int count = 0;
        for(Stock g : storage){
            count += g.getAmount();
        }
        return count;
    }

    public void printAll(){
        for (Stock s: storage) {
            System.out.println(s);
        }
    }

    private float getXboxPer(){
        return Math.round(((float)getXboxNum() / (float)storage.size()) * 10000) / 100f;
    }

    private float getPcPer(){
        return Math.round(((float)getPcNum() / (float)storage.size()) * 10000) / 100f;
    }

    private float getSwitchPer(){
        return Math.round(((float)getSwitchNum() / (float)storage.size()) * 10000) / 100f;
    }

    private float getPlayStationPer(){
        return Math.round(((float)getPlayStationNum() / (float)storage.size()) * 10000) / 100f;
    }

    private int getXboxNum(){
        int count = 0;
        for(Stock g : storage){
            if(g.getGame().getPlatform() == Platform.XBOX){
                count++;
            }
        }
        return count;
    }

    private int getPlayStationNum(){
        int count = 0;
        for(Stock g : storage){
            if(g.getGame().getPlatform() == Platform.PLAYSTATION){
                count++;
            }
        }
        return count;
    }

    private int getSwitchNum(){
        int count = 0;
        for(Stock g : storage){
            if(g.getGame().getPlatform() == Platform.SWITCH){
                count++;
            }
        }
        return count;
    }

    private int getPcNum(){
        int count = 0;
        for(Stock g : storage){
            if(g.getGame().getPlatform() == Platform.PC){
                count++;
            }
        }
        return count;
    }

    public void sortByPrice(){
        storage.sort(Stock::compareToPrice);
    }

    public void sortByTitle(){
        storage.sort(Stock::compareToTitle);
    }

    public void sortByPlatform(){
        storage.sort(Stock::compareToPlatform);
    }

    public void sortByStock() { storage.sort(Stock::compareToStock); }

    public void reverse() {

        int size = storage.size();
        for (int i = 0; i < (size/2); i++) {
            Collections.swap(storage,i,(size - 1 - i));
        }
    }

}
