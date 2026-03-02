package OOP_Projects.Playable_Tic_Tac_Toe.OpponentStrategies;

import OOP_Projects.Playable_Tic_Tac_Toe.Board;
import OOP_Projects.Playable_Tic_Tac_Toe.Opponent;
import OOP_Projects.Playable_Tic_Tac_Toe.Player;


public interface Difficulty {
    char[][] nextMove(Board board, Player player, Opponent opponent);

}
