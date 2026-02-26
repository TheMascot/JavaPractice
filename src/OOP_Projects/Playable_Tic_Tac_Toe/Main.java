package OOP_Projects.Playable_Tic_Tac_Toe;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    final static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        Board board = new Board();
        Player p1 = new Player('b');

        boolean isWinner = false;
        boolean validInput = false;
        boolean playersTurn = true;
        int[] data;


        Messages.displayWelcomeMessage();

        board.boardDrawer(board.getBoard());

        while (!isWinner) {

            String rawInput;
            int rowData = 0;
            int colData = 0;

            while (!validInput) {
                System.out.println("Hová tegyük a következő X-et?");

                rawInput = keyboard.nextLine().toLowerCase();
                rawInput = rawInput.trim().replaceAll(" ", "");

                data = inputValidator(rawInput);
                if (data != null) {
                    validInput = true;
                    rowData = data[0];
                    colData = data[1];
                }
            }
            while (playersTurn) {

                if (board.getBoard()[rowData][colData] == 'X') {
                    System.out.println("Itt már van egy X.");
                    break;
                } else if (board.getBoard()[rowData][colData] == 'O') {
                    System.out.println("Itt már van egy O");
                    break;
                } else {
                    board.getBoard()[rowData][colData] = 'X';
                    playersTurn = false;
                    board.boardDrawer(board.getBoard());
                    if (board.winChecker(board.getBoard()).equals("X")) {
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
            while (!playersTurn && !isWinner) {
                if (board.isBoardFull()) break;
                board.boardDrawer(opponentsMove(board));
                if (board.winChecker(board.getBoard()).equals("O1a")) {
                    isWinner = true;
                    System.out.println("Ezt a játszmát a számítógép nyerte.");
                    break;
                }
                playersTurn = true;
            }
            validInput = false;
        }
        System.out.println("Köszönöm a játékot!");

    }

    private static int[] inputValidator(String rawInput) {
        String validRow = "123";
        String validCol = "abc";
        int targetRow; //input data
        String targetCol;

        int rowIndex; // output data
        int colIndex = 0;

        if (rawInput.length() > 2) {
            System.out.println("Hibás adat. A sor számával és az oszlop betűjével adja " +
                    "meg, hová kerüljön az X.");
            return null;
        }
        if (rawInput.length() == 2 &&
                validRow.contains(rawInput.substring(0, 1)) &&
                validCol.contains(rawInput.substring(1, 2))) {

            targetRow = Integer.parseInt(rawInput.substring(0, 1));
            targetCol = rawInput.substring(1, 2);

            rowIndex = targetRow - 1;
            colIndex = switch (targetCol) {
                case "a" -> 0;
                case "b" -> 1;
                case "c" -> 2;
                default -> colIndex;
            };
        } else {
            System.out.println("Nem megfelelő a sor vagy az oszlop megjelölése!");
            return null;
        }
        return new int[]{rowIndex, colIndex};

    }

    private static char[][] opponentsMove(Board board) {

        boolean validSpot = false;
        Random r = new Random();

        while (!validSpot) {
            int randomRow = r.nextInt(3);
            int randomCol = r.nextInt(3);

            if (board.getBoard()[randomRow][randomCol] == ' ') {
                board.getBoard()[randomRow][randomCol] = 'O';
                validSpot = true;
            }
        }
        return board.getBoard();
    }



}
