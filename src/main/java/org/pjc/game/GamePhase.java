package org.pjc.game;

public interface GamePhase {

    GamePhase execute(GameState state, GameView view);
    
    public boolean isGameEnd();

}
