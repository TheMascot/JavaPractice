package OOP_Projects.DiceGame;

public class Player {

    private String twoCharInitial = "??";
    private int position = 0;
    private boolean isWinner = false;
    private char symbol;
    private int gasInTank = 20;
    boolean isCurrentPlayer = false;

    public boolean isCurrentPlayer() {
        return isCurrentPlayer;
    }

    public void setCurrentPlayer(boolean currentPlayer) {
        isCurrentPlayer = currentPlayer;
    }

    public int getGasInTank() {
        return gasInTank;
    }

    public void setGasInTank(int gasAdded) {
        if ((this.gasInTank + gasAdded) < 0) {
            this.gasInTank = 0;
        } else {
            this.gasInTank += gasAdded;
        }


    }

    public String getTwoCharInitial() {
        return twoCharInitial;
    }

    public void setTwoCharInitial(String twoCharInitial) {

        if (twoCharInitial.length() > 2) {
            this.twoCharInitial = twoCharInitial.substring(0, 2);
        } else if (twoCharInitial.length() == 1) {
            this.twoCharInitial = "?" + twoCharInitial;
        } else this.twoCharInitial = twoCharInitial;
    }

    public Player(char symbol) {
        this.symbol = symbol;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int stepAhead, PlayField playfield, int gasInTank) {
        if (stepAhead > gasInTank) {
            this.position += gasInTank;
        } else {
            this.position += stepAhead;
        }
        if (this.position >= playfield.getFieldLength()) {
            this.position = playfield.getFieldLength() - 1;
        }
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }
}
