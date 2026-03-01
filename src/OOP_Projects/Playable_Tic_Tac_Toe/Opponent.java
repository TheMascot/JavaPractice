package OOP_Projects.Playable_Tic_Tac_Toe;

import java.util.Random;

public class Opponent {

    char opponentSign;
    boolean opponentTurn;

    public Opponent(Player player) {
        setOpponentSign(player.getPlayersSign());
        setOpponentTurn(player.getPlayersSign());
    }

    public char getOpponentSign() {
        return opponentSign;
    }

    public void setOpponentSign(char playerSign) {
        if (playerSign == 'X') this.opponentSign = 'O';
        else if(playerSign == 'O') this.opponentSign = 'X';
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
    public char[][] nextMove(Board board, Player player, Opponent opponent) {

        boolean validSpot = false;
        Random r = new Random();

        while (!validSpot) {
            int randomRow = r.nextInt(board.getSize());
            int randomCol = r.nextInt(board.getSize());

            if (board.getOneBoardField(randomRow, randomCol) == ' ') {
                board.setOneBoardField(randomRow, randomCol, player, opponent);
                validSpot = true;
            }
        }
        return board.getFullBoard();
    }
}
