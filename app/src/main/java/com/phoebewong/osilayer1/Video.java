package com.phoebewong.osilayer1;

public class Video {
    private String name;
    private String layer;
    private String link;


    public Video(String name, String layer, String link) {
        this.name = name;
        this.layer = layer;
        this.link = link;
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

    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
}

