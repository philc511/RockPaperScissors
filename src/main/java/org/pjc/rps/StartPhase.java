package org.pjc.rps;

import org.pjc.game.GamePhase;
import org.pjc.game.GamePhaseBase;
import org.pjc.game.GameState;
import org.pjc.game.GameView;

public class StartPhase extends GamePhaseBase {

    @Override
    public GamePhase execute(GameState state, GameView view) {
        return new Player1TurnPhase();
    }

}
