package org.pjc.rps;

import org.pjc.game.GameState;
import org.pjc.game.GameView;
import org.pjc.game.Move;

public class RockPaperScissorsView implements GameView {
    
    private Player player1;
    private Player player2;

    public RockPaperScissorsView(Player p1, Player p2) {
        this.player1 = p1;
        this.player2 = p2;
    }

    @Override
    public Move getPlayer1Move() {
        return player1.move();
    }

    @Override
    public Move getPlayer2Move() {
        return player2.move();
    }

    @Override
    public void DisplayRound(GameState state) {
        StringBuilder sb = new StringBuilder();
        sb.append("P1: " + state.getLastPlayer1Move());
        sb.append("\nP2: " + state.getLastPlayer2Move());
        int winner = state.getLastWinner();
        if (winner < 0) sb.append("\nP1 wins");
        else if (winner == 0) sb.append("\nDraw");
        else sb.append("\nP2 wins");
        System.out.println(sb);
    }

}
