package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Neil Alishev
 */
public class ClassicalMusic implements Music {
    @Override
    public ArrayList getSong() {
        ArrayList<String> songs = new ArrayList<String>();
        songs.add("Hungarian Rhapsody");
        songs.add("Satisfaction");
        songs.add("What’s Going On");
        return songs;
    }
}
