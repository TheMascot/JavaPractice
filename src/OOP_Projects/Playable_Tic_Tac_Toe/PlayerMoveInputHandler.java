package OOP_Projects.Playable_Tic_Tac_Toe;

public class PlayerMoveInputHandler {

    private final String rawInput;
    private int rowData = 0;
    private int colData = 0;

    public PlayerMoveInputHandler(String userInput) {
        this.rawInput = userInput.trim().replaceAll(" ", "");
    }

    public int getRowData() {
        return rowData;
    }

    public int getColData() {
        return colData;
    }

    public boolean checkRawInput(int boardSize){
        String possibleRows = "12345";
        String possibleCols = "abcde";

        String validRow = possibleRows.substring(0, boardSize);
        String validCol = possibleCols.substring(0, boardSize);

        String[] temp = this.rawInput.split("");

        if(validRow.contains(temp[0]) && validCol.contains(temp[1])){
            transformInput(this.rawInput);
            return true;
        }
        else{
            Messages.displayIncorrectInputErrorMessage();
            return false;
        }
    }

    private void transformInput(String rawInput) {
        int targetRow; //input data
        String targetCol;
        // TODO refactor to not use substring
        targetRow = Integer.parseInt(rawInput.substring(0, 1));
        targetCol = rawInput.substring(1, 2);

        int rowIndex; // output data
        int colIndex = 0;


        rowIndex = targetRow - 1;
        colIndex = switch (targetCol) {
            case "a" -> 0;
            case "b" -> 1;
            case "c" -> 2;
            case "d" -> 3;
            case "e" -> 4;
            default -> colIndex;
        };
        this.rowData = rowIndex;
        this.colData = colIndex;
    }






}

