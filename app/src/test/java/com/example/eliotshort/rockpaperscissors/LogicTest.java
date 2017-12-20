package com.example.eliotshort.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by eliotshort on 20/12/2017.
 */

public class LogicTest {

    Game testGame;
    Hand testHand;
    Counter testCounter;

    @Before

    public void before(){

        testHand = new Hand("Scissors");
        testGame = new Game(testHand);
        testCounter = new Counter();
    }

    @Test
    public void gameWorks1(){
        testHand.getOptions().clear();
        testHand.getOptions().add("Rock");
        testHand.setPlay("Scissors");
        assertEquals("Computer played: Rock\n\nPlayer played: Scissors\n\nCOMPUTER WINS.", testGame.game(testCounter));
    }

    @Test
    public void gameWorks2(){
        testHand.getOptions().clear();
        testHand.getOptions().add("Rock");
        testHand.setPlay("Lizard");
        assertEquals("Computer played: Rock\n\nPlayer played: Lizard\n\nCOMPUTER WINS.", testGame.game(testCounter));
    }

    @Test
    public void gameWorks3(){
        testHand.getOptions().clear();
        testHand.getOptions().add("Paper");
        testHand.setPlay("Rock");
        assertEquals("Computer played: Paper\n\nPlayer played: Rock\n\nCOMPUTER WINS.", testGame.game(testCounter));
    }

    @Test
    public void gameWorks4(){
        testHand.getOptions().clear();
        testHand.getOptions().add("Paper");
        testHand.setPlay("Spock");
        assertEquals("Computer played: Paper\n\nPlayer played: Spock\n\nCOMPUTER WINS.", testGame.game(testCounter));
    }

    @Test
    public void gameWorks5(){
        testHand.getOptions().clear();
        testHand.getOptions().add("Scissors");
        testHand.setPlay("Paper");
        assertEquals("Computer played: Scissors\n\nPlayer played: Paper\n\nCOMPUTER WINS.", testGame.game(testCounter));
    }

    @Test
    public void gameWorks6(){
        testHand.getOptions().clear();
        testHand.getOptions().add("Scissors");
        testHand.setPlay("Lizard");
        assertEquals("Computer played: Scissors\n\nPlayer played: Lizard\n\nCOMPUTER WINS.", testGame.game(testCounter));
    }

    @Test
    public void gameWorks7(){
        testHand.getOptions().clear();
        testHand.getOptions().add("Lizard");
        testHand.setPlay("Spock");
        assertEquals("Computer played: Lizard\n\nPlayer played: Spock\n\nCOMPUTER WINS.", testGame.game(testCounter));
    }

    @Test
    public void gameWorks8(){
        testHand.getOptions().clear();
        testHand.getOptions().add("Lizard");
        testHand.setPlay("Paper");
        assertEquals("Computer played: Lizard\n\nPlayer played: Paper\n\nCOMPUTER WINS.", testGame.game(testCounter));
    }

    @Test
    public void gameWorks9(){
        testHand.getOptions().clear();
        testHand.getOptions().add("Spock");
        testHand.setPlay("Rock");
        assertEquals("Computer played: Spock\n\nPlayer played: Rock\n\nCOMPUTER WINS.", testGame.game(testCounter));
    }

    @Test
    public void gameWorks10(){
        testHand.getOptions().clear();
        testHand.getOptions().add("Spock");
        testHand.setPlay("Scissors");
        assertEquals("Computer played: Spock\n\nPlayer played: Scissors\n\nCOMPUTER WINS.", testGame.game(testCounter));
    }

    @Test
    public void gameWorks11(){
        testHand.getOptions().clear();
        testHand.getOptions().add("Scissors");
        testHand.setPlay("Rock");
        assertEquals("Computer played: Scissors\n\nPlayer played: Rock\n\nPLAYER WINS.", testGame.game(testCounter));
    }

    @Test
    public void gameWorks12(){
        testHand.getOptions().clear();
        testHand.getOptions().add("Lizard");
        testHand.setPlay("Rock");
        assertEquals("Computer played: Lizard\n\nPlayer played: Rock\n\nPLAYER WINS.", testGame.game(testCounter));
    }

    @Test
    public void gameWorks13(){
        testHand.getOptions().clear();
        testHand.getOptions().add("Rock");
        testHand.setPlay("Paper");
        assertEquals("Computer played: Rock\n\nPlayer played: Paper\n\nPLAYER WINS.", testGame.game(testCounter));
    }

    @Test
    public void gameWorks14(){
        testHand.getOptions().clear();
        testHand.getOptions().add("Spock");
        testHand.setPlay("Paper");
        assertEquals("Computer played: Spock\n\nPlayer played: Paper\n\nPLAYER WINS.", testGame.game(testCounter));
    }

    @Test
    public void gameWorks15(){
        testHand.getOptions().clear();
        testHand.getOptions().add("Paper");
        testHand.setPlay("Scissors");
        assertEquals("Computer played: Paper\n\nPlayer played: Scissors\n\nPLAYER WINS.", testGame.game(testCounter));
    }

    @Test
    public void gameWorks16(){
        testHand.getOptions().clear();
        testHand.getOptions().add("Lizard");
        testHand.setPlay("Scissors");
        assertEquals("Computer played: Lizard\n\nPlayer played: Scissors\n\nPLAYER WINS.", testGame.game(testCounter));
    }

    @Test
    public void gameWorks17(){
        testHand.getOptions().clear();
        testHand.getOptions().add("Spock");
        testHand.setPlay("Lizard");
        assertEquals("Computer played: Spock\n\nPlayer played: Lizard\n\nPLAYER WINS.", testGame.game(testCounter));
    }

    @Test
    public void gameWorks18(){
        testHand.getOptions().clear();
        testHand.getOptions().add("Paper");
        testHand.setPlay("Lizard");
        assertEquals("Computer played: Paper\n\nPlayer played: Lizard\n\nPLAYER WINS.", testGame.game(testCounter));
    }

    @Test
    public void gameWorks19(){
        testHand.getOptions().clear();
        testHand.getOptions().add("Rock");
        testHand.setPlay("Spock");
        assertEquals("Computer played: Rock\n\nPlayer played: Spock\n\nPLAYER WINS.", testGame.game(testCounter));
    }

    @Test
    public void gameWorks20(){
        testHand.getOptions().clear();
        testHand.getOptions().add("Scissors");
        testHand.setPlay("Spock");
        assertEquals("Computer played: Scissors\n\nPlayer played: Spock\n\nPLAYER WINS.", testGame.game(testCounter));
    }



    @Test
    public void gameWorks21(){
        testHand.getOptions().clear();
        testHand.getOptions().add("Rock");
        testHand.setPlay("Rock");
        assertEquals("Computer played: Rock\n\nPlayer played: Rock\n\nIT'S A DRAW.", testGame.game(testCounter));
    }

    @Test
    public void gameWorks22(){
        testHand.getOptions().clear();
        testHand.getOptions().add("Paper");
        testHand.setPlay("Paper");
        assertEquals("Computer played: Paper\n\nPlayer played: Paper\n\nIT'S A DRAW.", testGame.game(testCounter));
    }

    @Test
    public void gameWorks23(){
        testHand.getOptions().clear();
        testHand.getOptions().add("Scissors");
        testHand.setPlay("Scissors");
        assertEquals("Computer played: Scissors\n\nPlayer played: Scissors\n\nIT'S A DRAW.", testGame.game(testCounter));
    }

    @Test
    public void gameWorks24(){
        testHand.getOptions().clear();
        testHand.getOptions().add("Lizard");
        testHand.setPlay("Lizard");
        assertEquals("Computer played: Lizard\n\nPlayer played: Lizard\n\nIT'S A DRAW.", testGame.game(testCounter));
    }

    @Test
    public void gameWorks25(){
        testHand.getOptions().clear();
        testHand.getOptions().add("Spock");
        testHand.setPlay("Spock");
        assertEquals("Computer played: Spock\n\nPlayer played: Spock\n\nIT'S A DRAW.", testGame.game(testCounter));
    }
    @Test
    public void canChangeCounter(){
        testHand.getOptions().clear();
        testHand.getOptions().add("Rock");
        testGame.game(testCounter);
        testGame.game(testCounter);
        assertEquals(2, testCounter.getLossCounter());
    }

}
