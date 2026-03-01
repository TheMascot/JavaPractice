package OOP_Projects.Playable_Tic_Tac_Toe;

import java.util.Scanner;

public class Main {

    final static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        GameSetup setup = new GameSetup();
        Messages.displayHeader();
        setup.run(keyboard);
        Player player = setup.getCurrentPlayer();
        Opponent opponent = setup.getCurrentOpponent();
        Board board = new Board();
        boolean isAWinner = false;

        Messages.displayInfoMessage(player.getPlayersSign());

        if(player.isPlayersTurn()){
        board.boardDrawer(board.getFullBoard());
        }

        while (!isAWinner) {
            while (player.isPlayersTurn()) {
                Messages.displayWhereToPlaceNextPlayerSign(player);

                InputHandler inputHandler = new InputHandler(keyboard.nextLine().toLowerCase());
                if (!inputHandler.checkRawInput()) continue;

                if (board.isThisFieldPopulated(inputHandler.getRowData(), inputHandler.getColData())) {
                    Messages.displayPopulatedFieldErrorMessage();
                    break;
                } else {
                    board.setOneBoardField(inputHandler.getRowData(), inputHandler.getColData(), player, opponent);
                    toggleBothPlayersTurn(player, opponent);
                    board.boardDrawer(board.getFullBoard());

                    isAWinner = checkWhatPhaseComesNextAfterPlayersMove(board, player);
                }
            }
            while (opponent.isOpponentTurn() && !isAWinner) {
                if (board.isBoardFull()) break;
                board.boardDrawer(opponent.nextMove(board, player, opponent));
                isAWinner = checkIfOpponentsWon(board, opponent);
                toggleBothPlayersTurn(player, opponent);
            }

        }
        Messages.displayLastMessage();
        keyboard.close();
    }

    private static void toggleBothPlayersTurn(Player player, Opponent opponent) {
        player.togglePlayersTurn();
        opponent.toggleOpponentTurn();
    }

    private static boolean checkWhatPhaseComesNextAfterPlayersMove(Board board, Player player) {
        if (board.winChecker(board.getFullBoard()) == player.getPlayersSign()) {
            Messages.displayPlayerWon();
            return true;
        } else if (!board.isBoardFull()) {
            Messages.displayOpponentsMoveText();
            return false;
        } else {
            Messages.displayGameEndsWithTie();
            return true;
        }
    }

    private static boolean checkIfOpponentsWon(Board board, Opponent opponent) {
        if (board.winChecker(board.getFullBoard()) == opponent.getOpponentSign()) {
            Messages.displayOpponentWon();
            return true;
        } else return false;
    }
}
