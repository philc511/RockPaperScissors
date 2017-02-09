package org.pjc.rps;

import org.pjc.game.GameController;

public class RockPaperScissorsMain {
    public static void main(String[] args) {

        GameController gc = new GameController(new RockPaperScissorState(), 
                new RockPaperScissorsView(new ConsolePlayer(), new AIPlayer()));
        gc.play();
    }

}
