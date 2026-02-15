import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PlayableTicTacToe {

    public static void main(String[] args) {

        char[][] board = new char[3][3];
        Arrays.fill(board[0], ' ');
        Arrays.fill(board[1], ' ');
        Arrays.fill(board[2], ' ');

        boolean isWinner = false;
        boolean validInput = false;
        boolean playersTurn = true;
        int[] data;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("""
                    ***************************
                    *       TIC-TAC-TOE       *
                    ***************************
                    * Ön az X-el játszik,     *
                    * lépéseit a sor számának *
                    * és az oszlop betűjének  *
                    * megadásával teheti meg. *
                    * Például: 1a vagy 3b     *
                    * Jó játékot!             *
                    ***************************""");

        boardDrawer(board);

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

                if (board[rowData][colData] == 'X'){
                    System.out.println("Itt már van egy X.");
                    break;
                }
                else if (board[rowData][colData] == 'O'){
                    System.out.println("Itt már van egy O");
                    break;
                }
                else {
                    board[rowData][colData] = 'X';
                    playersTurn = false;
                    boardDrawer(board);
                    if (winChecker(board).equals("X")) {
                        System.out.println("Gratulálok! Ezt a játékot Ön nyerte!");
                        isWinner = true;
                        break;
                    } else if (!isBoardFull(board)) System.out.println("Az ellenfél lépése:");
                    else {
                        isWinner = true;
                        System.out.println("A játék döntetlen lett.");
                    }
                }
            }
            while (!playersTurn && !isWinner) {
                if (isBoardFull(board)) break;
                boardDrawer(opponentsMove(board));
                if (winChecker(board).equals("O")) {
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

    private static void boardDrawer(char[][] board) {

        StringBuilder currentBoard = new StringBuilder();
        currentBoard.append("  A B C \n");
        for (int i = 0; i < board.length; i++) {
            currentBoard.append(i + 1).append("|");
            for (int j = 0; j < board[i].length; j++) {
                currentBoard.append(board[i][j]).append("|");
                if (j == 2) currentBoard.append("\n");
            }
        }
        System.out.println(currentBoard);
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

    private static char[][] opponentsMove(char[][] board) {
        boolean validSpot = false;
        Random r = new Random();

        while (!validSpot) {
            int randomRow = r.nextInt(3);
            int randomCol = r.nextInt(3);

            if (board[randomRow][randomCol] == ' ') {
                board[randomRow][randomCol] = 'O';
                validSpot = true;
            }
        }
        return board;
    }

    private static String winChecker(char[][] board) {
        int winCondition = 3;
        int rowCounter;
        int colCounter;
        int leftDiagonalCounter = 0;
        int rightDiagonalCounter = 0;
        boolean isWinner = false;
        String returnValue = "";

        for (int i = 0; i < board.length; i++) {
            rowCounter = 0;
            colCounter = 0;

            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') rowCounter++;
                else if (board[i][j] == 'O') rowCounter--;

                if (board[j][i] == 'X') colCounter++;
                else if (board[j][i] == 'O') colCounter--;

                if (i == j) {
                    if (board[i][j] == 'X') leftDiagonalCounter++;
                    else if (board[i][j] == 'O') leftDiagonalCounter--;
                }
                if (i + j == 2) {
                    if (board[i][j] == 'X') rightDiagonalCounter++;
                    else if (board[i][j] == 'O') rightDiagonalCounter--;
                }
            }
            if (rowCounter == winCondition || colCounter == winCondition ||
                    leftDiagonalCounter == winCondition || rightDiagonalCounter == winCondition) {
                returnValue = "X";
                isWinner = true;
            }
            if (rowCounter == -winCondition || colCounter == -winCondition ||
                    leftDiagonalCounter == -winCondition || rightDiagonalCounter == -winCondition) {
                returnValue = "O";
                isWinner = true;
            }
            if (i == 2 && !isWinner) returnValue = "";
        }
        return returnValue;
    }

    private static boolean isBoardFull(char[][] board) {
        for (char[] chars : board) {
            for (char aChar : chars) {
                if (aChar == ' ') return false;
            }
        }
        return true;
    }

}
