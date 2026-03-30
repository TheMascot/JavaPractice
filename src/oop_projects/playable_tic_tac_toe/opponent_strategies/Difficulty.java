package oop_projects.playable_tic_tac_toe.opponent_strategies;

import oop_projects.playable_tic_tac_toe.Board;
import oop_projects.playable_tic_tac_toe.Opponent;
import oop_projects.playable_tic_tac_toe.Player;


public interface Difficulty {
    char[][] nextMove(Board board, Player player, Opponent opponent);

}
