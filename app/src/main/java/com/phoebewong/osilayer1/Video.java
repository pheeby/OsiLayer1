package com.phoebewong.osilayer1;

public class Video {
    private String name;
    private String layer;


    public Video(String name, String layer) {
        this.name = name;
        this.layer = layer;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLayer() {
        return layer;
    }

    public void setLayer(String layer) {
        this.layer = layer;
    }
    public String toString(){
        return name + layer;
    }
}

