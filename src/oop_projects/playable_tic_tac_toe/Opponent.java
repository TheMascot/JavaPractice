package oop_projects.playable_tic_tac_toe;

import oop_projects.playable_tic_tac_toe.opponent_strategies.Difficulty;

public class Opponent {

    private char opponentSign;
    private boolean opponentTurn;
    private Difficulty difficulty;

    public Opponent(Player player, Difficulty difficulty) {
        setOpponentSign(player.getPlayersSign());
        setOpponentTurn(player.getPlayersSign());
        setDifficulty(difficulty);
    }

    public char getOpponentSign() {
        return opponentSign;
    }

    public void setOpponentSign(char playerSign) {
        if (playerSign == 'X') this.opponentSign = 'O';
        else if(playerSign == 'O') this.opponentSign = 'X';
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public boolean isOpponentTurn() {
        return opponentTurn;
    }

    public void toggleOpponentTurn() {
        this.opponentTurn = !this.opponentTurn;
    }

    private void setOpponentTurn(char playerSign) {
        if (playerSign == 'X') this.opponentTurn = false;
        else if (playerSign == 'O') this.opponentTurn = true;
    }
    public char[][] makeMove(Board board, Player player, Opponent opponent) {
       return difficulty.nextMove(board, player, opponent);
    }
}
