package org.pjc.rps;

import org.pjc.game.Move;

public class AIPlayer implements Player {

    @Override
    public Move move() {
        int i = (int) (Math.random()*3.0);
        switch (i) {
            case 0 :
                return new RpsMove(Choice.Rock);
            case 1:
                return new RpsMove(Choice.Paper);
            case 2:
                return new RpsMove(Choice.Scissors);
        }
        throw new IllegalArgumentException("Unknown move");
    }

}
