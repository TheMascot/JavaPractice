package OOP_Projects.Playable_Tic_Tac_Toe;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class GameSetup {

    private char playerChar;
    private int boardSize;
//   private int difficulty;

    Player player;
    Opponent opponent;
    Board board = new Board();


    public Board getCurrentBoard() {
        return board;
    }

    public Player getCurrentPlayer() {
        return player;
    }

    public Opponent getCurrentOpponent() {
        return opponent;
    }

    public void run(Scanner keyboard) {
        do {
            Messages.displayPlayerSignChoice();
            initialPlayerCharSetup(keyboard.next().toUpperCase().charAt(0));
            keyboard.nextLine();
        } while (!validateInputChar(this.playerChar));
        do {
            Messages.displayBoardSizeChoice();
            initialBoardSizeSetup(keyboard.nextInt());
        } while (!validateInputBoardSize(board.getSize()));
        keyboard.nextLine();
    }

    private boolean validateInputChar(char input) {
        if (input == 'X' || input == 'O') return true;
        else {
            Messages.displayIncorrectPlayerCharErrorMessage();
            return false;
        }
    }

    private void initialPlayerCharSetup(char input) {
        this.playerChar = input;
        player = new Player(this.playerChar);
        opponent = new Opponent(player);
    }

    private void initialBoardSizeSetup(int input) {
        board = new Board(input);
        System.out.println("Board size: " + input);
    }

    private boolean validateInputBoardSize(int input) {
        if (input >= 3 && input <= 5) return true;
        else {
            Messages.displayIncorrectBoardSizerErrorMessage();
            return false;
        }
    }

}
