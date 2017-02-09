package org.pjc.rps;

import org.pjc.game.GamePhase;
import org.pjc.game.GamePhaseBase;
import org.pjc.game.GameState;
import org.pjc.game.GameView;
import org.pjc.game.Move;

public class Player2TurnPhase extends GamePhaseBase {

    @Override
    public GamePhase execute(GameState state, GameView view) {
        Move move = view.getPlayer2Move();
        
        state.addPlayer2Move(move);
        
        return new EvaluationPhase();
    }

}
