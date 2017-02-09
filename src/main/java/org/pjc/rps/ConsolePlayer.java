package org.pjc.rps;

import org.pjc.game.Move;

public class ConsolePlayer implements Player {

    @Override
    public Move move() {
        Choice choice = null;
        while (choice == null) {
            String s = System.console().readLine();
            char c = s.toLowerCase().charAt(0);
            if ('r'== c) choice = Choice.Rock;
            else if ('p'== c) choice = Choice.Paper;
            else if ('s'== c) choice = Choice.Scissors;
        }
        return new RpsMove(choice);
    }

}
