package OOP_Projects.Playable_Tic_Tac_Toe;

import java.util.Arrays;

public class InputHandler {

    private final String rawInput;
    private int rowData = 0;
    private int colData = 0;
//    boolean validInput = false;
//    int[] data;

    public InputHandler(String userInput) {
        this.rawInput = userInput.trim().replaceAll(" ", "");
    }

    public int getRowData() {
        return rowData;
    }

    public int getColData() {
        return colData;
    }

//    public void setRawInputandRowColData() {
//        if(checkRawInput()){
//            this.rawInput = rawInput;
//            transformInput(rawInput);
//        }
//    }

    public boolean checkRawInput(){
        String validRow = "123";
        String validCol = "abc";
        String[] temp = this.rawInput.split("");
        System.out.println(Arrays.toString(temp));
        if(validRow.contains(temp[0]) && validCol.contains(temp[1])){
            transformInput(this.rawInput);
            return true;
        }
        else{
            Messages.displayIncorrectInputMessage();
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
            default -> colIndex;
        };
        this.rowData = rowIndex;
        this.colData = colIndex;
    }






}

