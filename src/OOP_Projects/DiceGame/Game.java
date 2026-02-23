package OOP_Projects.DiceGame;

import java.util.Scanner;

public class Game {

    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        GameSetup setup = initializer();
        PlayField playField = setup.getPlayField();
        Player player1 = setup.getPlayer1();
        Player player2 = setup.getPlayer2();
        boolean isGameOver = false;

        Dice dice = new Dice();

        while (!isGameOver) {
            if (player1.isCurrentPlayer) {
                playerTurn(playField, player1, dice);
                displayBothPlayfields(playField, player1, player2);
                if(checkForWinner(playField, player1)){
                isGameOver = true;
                }
            } else {
                playerTurn(playField, player2, dice);
                displayBothPlayfields(playField, player1, player2);
                if(checkForWinner(playField, player2)){
                isGameOver = true;
                };
            }

            changeCurrentPlayer(player1, player2);

        }
        gameOverMessage(player1, player2);

    }

    private static GameSetup initializer() {

        Player p1 = new Player('▼');
        p1.setCurrentPlayer(true);
        Player p2 = new Player('▽');

        System.out.println("What are the initials of player one? (Two characters only)");
        p1.setTwoCharInitial(keyboard.nextLine());
        System.out.println("What are the initials of player two? (Two characters only)");
        p2.setTwoCharInitial(keyboard.nextLine());

        System.out.println("How long should the field be?");
        PlayField playField = new PlayField();
        playField.setFieldLength(keyboard.nextInt());

        playField.displayPlayField(p1);
        playField.displayPlayField(p2);

        return new GameSetup(playField, p1, p2);
    }

    private static void playerTurn(PlayField playfield, Player player, Dice dice) {
        String playerInput;
        String validatedPlayerInput = null;

        System.out.println("***** " + player.getTwoCharInitial() + "'s turn. *****");

        while (validatedPlayerInput == null) {
            System.out.println("Would you like to MOVE or fill up the GAS? (M/G)");
            playerInput = keyboard.next();
            validatedPlayerInput = inputValidation(playerInput);
            if (validatedPlayerInput == null) {
                System.out.println("Incorrect input, type \"m\" to MOVE or \"g\" to fill up the GAS");
            }
        }
        if (validatedPlayerInput.equals("m") && player.getGasInTank() == 0) {
            System.out.println("Your tank is empty!");
            return;
        }

        dice.rollADice();

        if (validatedPlayerInput.equals("m")) {
            player.setPosition(dice.getCurrentValue(), playfield, player.getGasInTank());
            player.setGasInTank(-(dice.getCurrentValue()));
        } else if (validatedPlayerInput.equals("g")) {
            player.setGasInTank(dice.getCurrentValue());
        }

    }

    private static String inputValidation(String input) {
        if (input.equalsIgnoreCase("m") || input.equalsIgnoreCase("move")) return "m";
        if (input.equalsIgnoreCase("g") || input.equalsIgnoreCase("gas")) return "g";
        else return null;
    }

    private static void changeCurrentPlayer(Player player1, Player player2) {
        if (player1.isCurrentPlayer) {
            player1.setCurrentPlayer(false);
            player2.setCurrentPlayer(true);
        } else {
            player1.setCurrentPlayer(true);
            player2.setCurrentPlayer(false);
        }
    }

    private static void displayBothPlayfields(PlayField playField, Player player1, Player player2) {
        if (player1.isCurrentPlayer) {
            playField.displayPlayField(player1);
            playField.displayPlayField(player2);
        } else {
            playField.displayPlayField(player1);
            playField.displayPlayField(player2);
        }
    }

    private static boolean checkForWinner(PlayField playField, Player player) {
        if (player.getPosition() == playField.getFieldLength() - 1) {
            player.setWinner(true);
            return true;
        }
        else return false;
    }

    private static void gameOverMessage(Player player1, Player player2) {
        System.out.println("***** THE WINNER IS: " + (player1.isWinner() ? player1.getTwoCharInitial() :
                player2.getTwoCharInitial()) + " *****");
        System.out.println("***** CONGRATULATIONS! *****");
    }
}
