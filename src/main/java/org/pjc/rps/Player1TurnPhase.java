package org.pjc.rps;

import org.pjc.game.GamePhase;
import org.pjc.game.GamePhaseBase;
import org.pjc.game.GameState;
import org.pjc.game.GameView;
import org.pjc.game.Move;

public class Player1TurnPhase extends GamePhaseBase  {

    @Override
    public GamePhase execute(GameState state, GameView view) {
        Move move = view.getPlayer1Move();
        
        state.addPlayer1Move(move);
        
        return new Player2TurnPhase();
    }

}
