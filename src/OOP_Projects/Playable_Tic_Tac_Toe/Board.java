package OOP_Projects.Playable_Tic_Tac_Toe;

import java.util.Arrays;

public class Board {

    private final int SIZE = 3;
    private char[][] board;

    public Board() {
        board = new char[SIZE][SIZE];
        initializeBoard();
    }

    public char[][] getFullBoard() {
        char[][] copy = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            copy[i] = board[i].clone();
        }
        return copy;
//        return this.board;
    }

    public char getOneBoardField(int row, int col){
        char temp = getFullBoard()[row][col];
        return temp;
    }
    public void setOneBoardField(int row, int col, Player player, Opponent opponent){
       this.board[row][col] = player.isPlayersTurn() ? player.getPlayersSign() : opponent.getOpponentSign();
    }

    public boolean isThisFieldPopulated(int row, int col) {
        if(getOneBoardField(row, col) != ' ') return true;
        else return false;
    }

    private void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            Arrays.fill(board[i], ' ');
        }
    }

    public void boardDrawer(char[][] board) {
        StringBuilder currentBoard = new StringBuilder();
        currentBoard.append("  A B C \n");

        for (int i = 0; i < SIZE; i++) {
            currentBoard.append(i + 1).append("|");
            for (int j = 0; j < SIZE; j++) {
                currentBoard.append(board[i][j]).append("|");
                if (j == 2) currentBoard.append("\n");
            }
        }
        System.out.println(currentBoard);
    }

    public char winChecker(char[][] board) {

        int winCondition = SIZE;
        int rowCounter;
        int colCounter;
        int leftDiagonalCounter = 0;
        int rightDiagonalCounter = 0;
        boolean isWinner = false;
        char returnValue = ' ';

        for (int i = 0; i < SIZE; i++) {
            rowCounter = 0;
            colCounter = 0;

            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 'X') rowCounter++;
                else if (board[i][j] == 'O') rowCounter--;

                if (board[j][i] == 'X') colCounter++;
                else if (board[j][i] == 'O') colCounter--;

                if (i == j) {
                    if (board[i][j] == 'X') leftDiagonalCounter++;
                    else if (board[i][j] == 'O') leftDiagonalCounter--;
                }
                if (i + j == 2) {
                    if (board[i][j] == 'X') rightDiagonalCounter++;
                    else if (board[i][j] == 'O') rightDiagonalCounter--;
                }
            }
            if (rowCounter == winCondition || colCounter == winCondition ||
                    leftDiagonalCounter == winCondition || rightDiagonalCounter == winCondition) {
                returnValue = 'X';
                isWinner = true;
            }
            if (rowCounter == -winCondition || colCounter == -winCondition ||
                    leftDiagonalCounter == -winCondition || rightDiagonalCounter == -winCondition) {
                returnValue = 'O';
                isWinner = true;
            }
            if (i == 2 && !isWinner) returnValue = ' ';
        }
        return returnValue;
    }

    public boolean isBoardFull() {
        for (char[] chars : this.board) {
            for (char aChar : chars) {
                if (aChar == ' ') return false;
            }
        }
        return true;
    }
}
