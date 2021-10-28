package ru.alishev.springcourse;

import java.util.ArrayList;

public class RapMusic implements Music {
    @Override
    public ArrayList<String> getSong() {
        ArrayList<String> songs = new ArrayList<String>();
        songs.add("Rap God");
        songs.add("In Da Club");
        songs.add("California Love");
        return songs;
    }
}
