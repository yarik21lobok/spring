package ru.alishev.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean RapMusic rapMusic(){
        return new RapMusic();
    }

    @Bean ArrayList<Music> musicGenres(){
        ArrayList<Music> result = new ArrayList<>();
        result.add(rapMusic());
        result.add(rockMusic());
        result.add(classicalMusic());
        return result;
    }

    @Bean MusicPlayer musicPlayer(){
        return new MusicPlayer(musicGenres());
    }

    @Bean Computer computer(){
        return new Computer(musicPlayer());
    }

}
