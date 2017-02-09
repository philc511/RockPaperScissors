package org.pjc.game;

public class GameController {
    private GameState gameState;
    private GameView gameView;
    
    public GameController(GameState state, GameView view) {        
        this.gameState = state;
        this.gameView = view;
    }

    public void play() {
        GamePhase phase = gameState.getStartPhase();
        while (!phase.isGameEnd()) {
            phase = phase.execute(gameState, gameView);
            System.out.println(phase);
        }
    }
}
