package oop_projects.playable_tic_tac_toe;

import java.util.Scanner;

public class Main {

    final static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        Messages.displayHeader();

        GameSetup setup = new GameSetup();
        setup.run(keyboard);
        Player player = setup.getCurrentPlayer();
        Opponent opponent = setup.getCurrentOpponent();
        Board board = setup.getCurrentBoard();
        boolean isThereAWinner = false;

        Messages.displayInfoMessage(player.getPlayersSign());

        if(player.isPlayersTurn()){
        board.boardDrawer(board.getFullBoard());
        }

        while (!isThereAWinner) {
            while (player.isPlayersTurn()) {
                Messages.displayWhereToPlaceNextPlayerSign(player);

                PlayerMoveInputHandler playerMoveInputHandler = new PlayerMoveInputHandler(keyboard.nextLine().toLowerCase());
                if (!playerMoveInputHandler.checkRawInput(board.getSize())) continue;

                if (board.isThisBoardFieldPopulated(playerMoveInputHandler.getRowData(), playerMoveInputHandler.getColData())) {
                    Messages.displayPopulatedFieldErrorMessage();
                    break;
                } else {
                    board.setOneBoardField(playerMoveInputHandler.getRowData(), playerMoveInputHandler.getColData(), player, opponent);
                    toggleBothPlayersTurn(player, opponent);
                    board.boardDrawer(board.getFullBoard());

                    isThereAWinner = checkWhatPhaseComesNextAfterPlayersMove(board, player);
                }
            }
            while (opponent.isOpponentTurn() && !isThereAWinner) {
                if (board.isBoardFull()) break;
                board.boardDrawer(opponent.makeMove(board, player, opponent));
                isThereAWinner = checkIfOpponentsWon(board, opponent);
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
