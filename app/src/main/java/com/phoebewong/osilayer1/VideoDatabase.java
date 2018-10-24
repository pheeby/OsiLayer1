package com.phoebewong.osilayer1;
import java.util.ArrayList;

public class VideoDatabase {

    private static ArrayList<Video> videoArrayList = new ArrayList<Video>(){{

        add(new Video("Video name ", "Layer 1", "xlLBoVUDLvs"));
        add(new Video("Video name 2 ", "Layer 2", "xlLBoVUDLvs"));
        add(new Video("Video name 3 ", "Layer 3", "xlLBoVUDLvs"));

    }};

    public static ArrayList<Video> getVideoArrayList(){
        return videoArrayList;
    }
}
