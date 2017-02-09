package org.pjc.game;

public interface GameView {

    Move getPlayer1Move();

    Move getPlayer2Move();

    void DisplayRound(GameState state);

}
