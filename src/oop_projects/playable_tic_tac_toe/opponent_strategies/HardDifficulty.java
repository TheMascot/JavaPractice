package oop_projects.playable_tic_tac_toe.opponent_strategies;

import oop_projects.playable_tic_tac_toe.Board;
import oop_projects.playable_tic_tac_toe.Opponent;
import oop_projects.playable_tic_tac_toe.Player;

import java.util.Random;

// TODO create the real hard strategy logic, this is the same as easy currently
public class HardDifficulty implements Difficulty {
    public char[][] nextMove(Board board, Player player, Opponent opponent) {
        boolean validSpot = false;
        Random r = new Random();

        while (!validSpot) {
            int randomRow = r.nextInt(board.getSize());
            int randomCol = r.nextInt(board.getSize());

            if (!board.isThisBoardFieldPopulated(randomRow,randomCol)) {
                board.setOneBoardField(randomRow, randomCol, player, opponent);
                validSpot = true;
            }
        }
        return board.getFullBoard();
    }
}
