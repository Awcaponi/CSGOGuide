package com.android.awni.csgoguide;

import java.util.ArrayList;


public class Maps {
    private int id;
    private String name;
    private String url;
    private ArrayList<Position> positions;

    public Maps(int id, String name, String url, ArrayList<Position> positions) {

        this.id = id;
        this.name = name;
        this.url = url;
        this.positions = positions;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ArrayList<Position> getPositions() {
        return positions;
    }

    public void setPositions(ArrayList<Position> positions) {
        this.positions = positions;
    }

    @Override
    public String toString() {
        return "Maps{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", positions=" + positions +
                '}';
    }
}
