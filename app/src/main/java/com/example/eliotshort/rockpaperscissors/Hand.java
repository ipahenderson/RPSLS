package com.example.eliotshort.rockpaperscissors;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ianhenderson on 20/12/2017.
 */

public class Hand {

    ArrayList<String> options;
    String play;


    public Hand(String play){
        this.play = play;
        this.options = new ArrayList<>();
        options.add("Rock");
        options.add("Paper");
        options.add("Scissors");
        options.add("Lizard");
        options.add("Spock");
    }

    public String getPlay() {
        return play;
    }

    public String computerPlay(){
        Collections.shuffle(options);
        return options.get(0);
    }

    public void setPlay(String play) {
        this.play = play;
    }

    public ArrayList<String> getOptions() {
        return options;
    }
}
