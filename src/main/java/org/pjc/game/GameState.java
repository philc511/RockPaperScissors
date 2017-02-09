package org.pjc.game;

public interface GameState {

    GamePhase getStartPhase();

    void addPlayer1Move(Move move);

    void addPlayer2Move(Move move);

    Move getLastPlayer1Move();

    Move getLastPlayer2Move();

    int getLastWinner();

}
