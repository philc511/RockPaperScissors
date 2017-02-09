package org.pjc.game;

public abstract class GamePhaseBase implements GamePhase {

    @Override
    public abstract GamePhase execute(GameState state, GameView view);
    
    @Override
    public boolean isGameEnd() {
        return false;
    }

}
