package org.pjc.rps;

import org.pjc.game.GamePhase;
import org.pjc.game.GamePhaseBase;
import org.pjc.game.GameState;
import org.pjc.game.GameView;

public class GameOverPhase extends GamePhaseBase {

    @Override
    public boolean isGameEnd() {
        return true;
    }

    @Override
    public GamePhase execute(GameState state, GameView view) {
        // TODO Auto-generated method stub
        return null;
    }

}
