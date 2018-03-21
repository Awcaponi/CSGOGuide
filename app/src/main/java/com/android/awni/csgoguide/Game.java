package com.android.awni.csgoguide;

import java.util.ArrayList;

/**
 * Created by user on 21/03/2018.
 */

public class Game {
    private int id;
    private String name;
    private String  website;
    private ArrayList<Maps> maps;

    public Game(int id, String name, String website, ArrayList<Maps> maps) {
        this.id = id;
        this.name = name;
        this.website = website;
        this.maps = maps;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public ArrayList<Maps> getMaps() {
        return maps;
    }

    public void setMaps(ArrayList<Maps> maps) {
        this.maps = maps;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", website='" + website + '\'' +
                ", maps=" + maps +
                '}';
    }
}
