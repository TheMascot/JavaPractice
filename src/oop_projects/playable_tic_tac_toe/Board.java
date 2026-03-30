package oop_projects.playable_tic_tac_toe;

import java.util.Arrays;

public class Board {

    private int size = 0;
    private char[][] board;

    public Board(){}

    public Board(int size) {
        this.size = size;
        board = new char[this.size][this.size];
        initializeBoard();
    }

    public int getSize() {
        return size;
    }

    public char[][] getFullBoard() {
        char[][] copy = new char[size][size];
        for (int i = 0; i < size; i++) {
            copy[i] = board[i].clone();
        }
        return copy;
    }

    public char getOneBoardField(int row, int col){
        return getFullBoard()[row][col];
    }
    public void setOneBoardField(int row, int col, Player player, Opponent opponent){
       this.board[row][col] = player.isPlayersTurn() ? player.getPlayersSign() : opponent.getOpponentSign();
    }

    public boolean isThisBoardFieldPopulated(int row, int col) {
        if(getOneBoardField(row, col) != ' ') return true;
        else return false;
    }

    private void initializeBoard() {
        for (int i = 0; i < size; i++) {
            Arrays.fill(board[i], ' ');
        }
    }

    public void boardDrawer(char[][] board) {
        StringBuilder currentBoard = new StringBuilder();
        String[] colDesignators = {"A ","B ","C ","D ","E "};
        currentBoard.append("  ");
        for (int i = 0; i < this.size; i++) {
            currentBoard.append(colDesignators[i]);
        }
        currentBoard.append("\n");

        for (int i = 0; i < size; i++) {
            currentBoard.append(i + 1).append("|");
            for (int j = 0; j < size; j++) {
                currentBoard.append(board[i][j]).append("|");
                if (j == size-1) currentBoard.append("\n");
            }
        }
        System.out.println(currentBoard);
    }

    public char winChecker(char[][] board) {

        int winCondition = size;
        int rowCounter;
        int colCounter;
        int leftDiagonalCounter = 0;
        int rightDiagonalCounter = 0;
        boolean isWinner = false;
        char returnValue = ' ';

        for (int i = 0; i < size; i++) {
            rowCounter = 0;
            colCounter = 0;

            for (int j = 0; j < size; j++) {
                if (board[i][j] == 'X') rowCounter++;
                else if (board[i][j] == 'O') rowCounter--;

                if (board[j][i] == 'X') colCounter++;
                else if (board[j][i] == 'O') colCounter--;

                if (i == j) {
                    if (board[i][j] == 'X') leftDiagonalCounter++;
                    else if (board[i][j] == 'O') leftDiagonalCounter--;
                }
                if (i + j == this.size-1) {
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
