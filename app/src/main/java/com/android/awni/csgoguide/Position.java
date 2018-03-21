package com.android.awni.csgoguide;



public class Position {
    private int id;
    private String name;
    private String imgStop;
    private String imgCross;

    public Position(int id, String name, String imgStop, String imgCross) {
        this.id = id;
        this.name = name;
        this.imgStop = imgStop;
        this.imgCross = imgCross;
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

    public String getImgStop() {
        return imgStop;
    }

    public void setImgStop(String imgStop) {
        this.imgStop = imgStop;
    }

    public String getImgCross() {
        return imgCross;
    }

    public void setImgCross(String imgCross) {
        this.imgCross = imgCross;
    }

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", imgStop='" + imgStop + '\'' +
                ", imgCross='" + imgCross + '\'' +
                '}';
    }
}


