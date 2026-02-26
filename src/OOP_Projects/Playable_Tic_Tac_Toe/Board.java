package OOP_Projects.Playable_Tic_Tac_Toe;

import java.util.Arrays;

public class Board {

    private int SIZE = 3;
    private char[][] board;

    public Board() {
        board = new char[SIZE][SIZE];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            Arrays.fill(board[i], ' ');
        }
    }

    public void boardDrawer(Board board) {
        StringBuilder currentBoard = new StringBuilder();
        currentBoard.append("  A B C \n");

        for (int i = 0; i < this.board.length; i++) {
            currentBoard.append(i + 1).append("|");
            for (int j = 0; j < this.board[i].length; j++) {
                currentBoard.append(this.board[i][j]).append("|");
                if (j == 2) currentBoard.append("\n");
            }
        }
        System.out.println(currentBoard);
    }
}
