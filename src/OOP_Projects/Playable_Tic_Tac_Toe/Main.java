package OOP_Projects.Playable_Tic_Tac_Toe;

import java.util.Scanner;

public class Main {

    final static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        Board board = new Board();
        Player player = new Player('X');
        Opponent opponent = new Opponent(player);

        boolean isWinner = false;

        Messages.displayWelcomeMessage();

        board.boardDrawer(board.getFullBoard());

        while (!isWinner) {

            Messages.displayWhereToPlaceNextPlayerSign(player);

            InputHandler inputHandler = new InputHandler(keyboard.nextLine().toLowerCase());
            if(!inputHandler.checkRawInput()) continue;

            while (player.isPlayersTurn()) {

                if (board.isThisFieldPopulated(inputHandler.getRowData(), inputHandler.getColData())) {
                    Messages.displayPopulatedFieldErrorMessage();
                    break;
                }  else {
                    board.setOneBoardField(inputHandler.getRowData(), inputHandler.getColData(), player, opponent);
                    toggleBothPlayersTurn(player, opponent);
                    board.boardDrawer(board.getFullBoard());

                    if (board.winChecker(board.getFullBoard()).equals("X")) {
                        System.out.println("Gratulálok! Ezt a játékot Ön nyerte!");
                        isWinner = true;
                        break;
                    } else if (!board.isBoardFull()) System.out.println("Az ellenfél lépése:");
                    else {
                        isWinner = true;
                        System.out.println("A játék döntetlen lett.");
                    }
                }
            }
            while (opponent.isOpponentTurn() && !isWinner) {
                if (board.isBoardFull()) break;
                board.boardDrawer(opponent.opponentsMove(board, player, opponent));
                if (board.winChecker(board.getFullBoard()).equals("O")) {
                    isWinner = true;
                    System.out.println("Ezt a játszmát a számítógép nyerte.");
                    break;
                }
                toggleBothPlayersTurn(player, opponent);
            }

        }
        System.out.println("Köszönöm a játékot!");
        keyboard.close();
    }

    private static void toggleBothPlayersTurn(Player player, Opponent opponent) {
        player.togglePlayersTurn();
        opponent.toggleOpponentTurn();
    }
}
