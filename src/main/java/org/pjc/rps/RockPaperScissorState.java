package org.pjc.rps;

import java.util.ArrayList;
import java.util.List;

import org.pjc.game.GamePhase;
import org.pjc.game.GameState;
import org.pjc.game.Move;

public class RockPaperScissorState implements GameState {
    private List<Choice> player1Turns;
    private List<Choice> player2Turns;

    public RockPaperScissorState() {
        player1Turns = new ArrayList<Choice>();
        player2Turns = new ArrayList<Choice>();
    }

    @Override
    public GamePhase getStartPhase() {
        // TODO Auto-generated method stub
        return new StartPhase();
    }

    public void addPlayer1Move(Move move) {
        Choice choice = ((RpsMove) move).getChoice();
        player1Turns.add(choice);        
    }

    public void addPlayer2Move(Move move) {
        Choice choice = ((RpsMove) move).getChoice();
        player2Turns.add(choice);                
    }

    @Override
    public Move getLastPlayer1Move() {
        return new RpsMove(player1Turns.get(player1Turns.size() - 1));
    }

    @Override
    public Move getLastPlayer2Move() {
        return new RpsMove(player2Turns.get(player2Turns.size() - 1));
    }

    @Override
    public int getLastWinner() {
        Choice p1 = player1Turns.get(player1Turns.size() - 1);
        Choice p2 = player2Turns.get(player2Turns.size() - 1);
    
        if (Choice.Rock.equals(p1)) {
            if (Choice.Rock.equals(p2)) {
                return 0;
            }
            else if (Choice.Scissors.equals(p2)) {
                return -1;
            }
            else if (Choice.Paper.equals(p2)) {
                return 1;
            }
            else return 0; // unknown selection
        }
        else if (Choice.Scissors.equals(p1)) {
            if (Choice.Rock.equals(p2)) {
                return 1;
            }
            else if (Choice.Scissors.equals(p2)) {
                return 0;
            }
            else if (Choice.Paper.equals(p2)) {
                return -1;
            }
            else return 0; // unknown selection
        }
        else if (Choice.Paper.equals(p1)) {
            if (Choice.Rock.equals(p2)) {
                return -1;
            }
            else if (Choice.Scissors.equals(p2)) {
                return 1;
            }
            else if (Choice.Paper.equals(p2)) {
                return 0;
            }
            else return 0; // unknown selection
        }
        else return 0; // unknown selection
    }

}
