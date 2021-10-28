package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Neil Alishev
 */
public class MusicPlayer {
    private ArrayList<Music> musicGenres;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(ArrayList<Music> musicGenres){
        this.musicGenres=musicGenres;
    }

    public String playMusic() {
        int randGen = new Random().nextInt(3);
        int randSong = new Random().nextInt(3);
        return '\n'+"Playing: " + musicGenres.get(randGen).getSong().get(randSong);
        }


    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Music> getMusicGenres() {
        return musicGenres;
    }

    public void setMusicGenres(ArrayList<Music> musicGenres) {
        this.musicGenres = musicGenres;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
