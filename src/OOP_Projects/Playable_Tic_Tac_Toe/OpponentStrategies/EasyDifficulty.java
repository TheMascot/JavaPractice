package OOP_Projects.Playable_Tic_Tac_Toe.OpponentStrategies;

import OOP_Projects.Playable_Tic_Tac_Toe.Board;
import OOP_Projects.Playable_Tic_Tac_Toe.Opponent;
import OOP_Projects.Playable_Tic_Tac_Toe.Player;

import java.util.Random;

public class EasyDifficulty implements Difficulty {
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

