package com.example.eliotshort.rockpaperscissors;

import android.graphics.Typeface;
import android.text.style.StyleSpan;

/**
 * Created by ianhenderson on 20/12/2017.
 */

public class Game {

    Hand hand;

    public Game(Hand hand) {
        this.hand = hand;
    }

    public String game(Counter counter){

        String computerHand = hand.computerPlay();
        String playerHand = hand.getPlay();
        String play = "Computer played: " + computerHand + "<br/><br/>Player played: " + playerHand + "<br/><br/><b>";
        String win;
        int counterLoss = counter.getLossCounter();
        int counterWin = counter.getWinCounter();

        if (
                (computerHand.equals("Rock") && playerHand.equals("Scissors")) |
                (computerHand.equals("Rock") && playerHand.equals("Lizard")) |
                (computerHand.equals("Paper") && playerHand.equals("Rock")) |
                (computerHand.equals("Paper") && playerHand.equals("Spock")) |
                (computerHand.equals("Scissors") && playerHand.equals("Paper")) |
                (computerHand.equals("Scissors") && playerHand.equals("Lizard")) |
                (computerHand.equals("Lizard")  && playerHand.equals("Paper")) |
                (computerHand.equals("Lizard")  && playerHand.equals("Spock")) |
                (computerHand.equals("Spock") && playerHand.equals("Rock")) |
                (computerHand.equals("Spock") && playerHand.equals("Scissors"))
                )
        {
            win =  play + "COMPUTER WINS.";
            counterLoss ++;
            counter.setLossCounter(counterLoss);
        }
        else if (playerHand == computerHand){
            win = play + "IT'S A DRAW.";

        }
        else{
            win = play + "PLAYER WINS.";
            counterWin ++;
            counter.setWinCounter(counterWin);
        }

        return win;

    }



}
