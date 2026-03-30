package oop_projects.playable_tic_tac_toe;

import oop_projects.playable_tic_tac_toe.opponent_strategies.Difficulty;
import oop_projects.playable_tic_tac_toe.opponent_strategies.EasyDifficulty;
import oop_projects.playable_tic_tac_toe.opponent_strategies.HardDifficulty;
import oop_projects.playable_tic_tac_toe.opponent_strategies.MediumDifficulty;

import java.util.Scanner;

public class GameSetup {

    private char playerChar;
    private int difficultyNumber;

    Player player;
    Opponent opponent;
    Board board;


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
            initialPlayerSetup(keyboard.next().toUpperCase().charAt(0));
            keyboard.nextLine();
        } while (!validateInputChar(this.playerChar));
        do {
            Messages.displayBoardSizeChoice();
            if (keyboard.hasNextInt()) {
                initialBoardSizeSetup(keyboard.nextInt());
            }
            keyboard.nextLine();
        } while (!validateInputBoardSize(board.getSize()));
        do {
            Messages.displayDifficultyChoice();
            if (keyboard.hasNextInt()) {
                initialDifficultyNumberSetup(keyboard.nextInt());
                initialOpponentSetup(this.difficultyNumber);
            }
            keyboard.nextLine();
        } while (!validateInputDifficulty(this.difficultyNumber));
    }

    private void initialPlayerSetup(char input) {
        this.playerChar = input;
        player = new Player(this.playerChar);
    }

    private boolean validateInputChar(char input) {
        if (input == 'X' || input == 'O') return true;
        else {
            Messages.displayIncorrectPlayerCharErrorMessage();
            return false;
        }
    }

    private void initialBoardSizeSetup(int input) {
        board = new Board(input);
    }

    private boolean validateInputBoardSize(int input) {
        if (input >= 3 && input <= 5) return true;
        else {
            Messages.displayIncorrectBoardSizerErrorMessage();
            return false;
        }
    }

    private void initialDifficultyNumberSetup(int input) {
        this.difficultyNumber = input;
    }

    private void initialOpponentSetup(int difficultyNumber) {
        Difficulty difficulty = switch (difficultyNumber) {
            case 1 -> new EasyDifficulty();
            case 2 -> new MediumDifficulty();
            case 3 -> new HardDifficulty();
            default -> new EasyDifficulty();
        };
        opponent = new Opponent(player, difficulty);
    }

    private boolean validateInputDifficulty(int input) {
        if (input >= 1 && input <= 3) return true;
        else {
            Messages.displayIncorrectDifficultyErrorMessage();
            return false;
        }
    }
}
