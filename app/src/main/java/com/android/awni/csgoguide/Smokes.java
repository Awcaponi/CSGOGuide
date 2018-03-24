package com.android.awni.csgoguide;

/**
 * Created by user on 24/03/2018.
 */

public class Smokes {
    private Position From;
    private Position To;
    private String imgStand;
    private String imgCrosshair;

    public Smokes(Position from, Position to, String imgStand, String imgCrosshair) {
        From = from;
        To = to;
        this.imgStand = imgStand;
        this.imgCrosshair = imgCrosshair;
    }

    public Position getFrom() {
        return From;
    }

    public void setFrom(Position from) {
        From = from;
    }

    public Position getTo() {
        return To;
    }

    public void setTo(Position to) {
        To = to;
    }

    public String getImgStand() {
        return imgStand;
    }

    public void setImgStand(String imgStand) {
        this.imgStand = imgStand;
    }

    public String getImgCrosshair() {
        return imgCrosshair;
    }

    public void setImgCrosshair(String imgCrosshair) {
        this.imgCrosshair = imgCrosshair;
    }

    @Override
    public String toString() {
        return "Smokes{" +
                "From=" + From +
                ", To=" + To +
                ", imgStand='" + imgStand + '\'' +
                ", imgCrosshair='" + imgCrosshair + '\'' +
                '}';
    }
}

