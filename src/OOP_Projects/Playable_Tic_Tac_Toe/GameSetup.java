package OOP_Projects.Playable_Tic_Tac_Toe;

import java.util.Scanner;

public class GameSetup {

    private char playerChar;
//   private int boardSize;
//   private int difficulty;

    Player player;
    Opponent opponent;

    public char getPlayerChar() {
        return playerChar;
    }

    public Player getCurrentPlayer() {
        return player;
    }

    public Opponent getCurrentOpponent() {
        return opponent;
    }

    public void run(Scanner keyboard) {
        while (!validateInputChar(this.playerChar)) {
            Messages.displayPlayerSignChoice();
            initialPlayerCharSetup(keyboard.next().toUpperCase().charAt(0));
        }
        keyboard.nextLine();
    }

    private boolean validateInputChar(char input) {
        if (input == 'X' || input == 'O') return true;
        else return false;
    }

    private void initialPlayerCharSetup(char input) {
        if (input == 'X' || input == 'O') {
            this.playerChar = input;
            player = new Player(this.getPlayerChar());
            opponent = new Opponent(player);
        }
    }
}
