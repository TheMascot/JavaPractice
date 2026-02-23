package OOP_Projects.DiceGame;

public class PlayField {

    private int fieldLength = 20;
//    char[] fieldArray = new char[fieldLength];

    public int getFieldLength() {
        return fieldLength;
    }

    public void setFieldLength(int fieldLength) {
        if (fieldLength < 20) {
            this.fieldLength = 20;
        } else if (fieldLength > 100) {
            this.fieldLength = 100;
        } else {
            this.fieldLength = fieldLength;
        }
    }

    public void displayPlayField( Player player) {
        System.out.print(player.getTwoCharInitial() + " ");
        for (int i = 0; i < this.fieldLength; i++) {
            if (i == player.getPosition()){
                System.out.print(player.getSymbol());
                continue;
            }
            if (i == this.fieldLength - 1) System.out.print('▩');
            else {
                System.out.print('_');
            }
        }
        System.out.println(" Gas in tank: " + player.getGasInTank());
    }
}
