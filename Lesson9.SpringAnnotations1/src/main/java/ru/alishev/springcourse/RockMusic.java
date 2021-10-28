package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;


public class RockMusic implements Music {
    @Override
    public  ArrayList<String> getSong() {
        ArrayList<String> songs = new ArrayList<String>();
        songs.add("Wind cries Mary");
        songs.add("Human");
        songs.add("Nothing else matters");
        return songs;
    }
}
