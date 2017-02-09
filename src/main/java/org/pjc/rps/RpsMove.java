package org.pjc.rps;

import org.pjc.game.Move;

public class RpsMove implements Move {

    private Choice choice;

    public RpsMove(Choice choice) {
        this.choice = choice;
    }

    public Choice getChoice() {
        return choice;
    }
    
    @Override
    public String toString() {
        return choice.toString();
    }

}
