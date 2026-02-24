package OOP_Projects.DiceGame;

import java.util.*;

public class Dice {

    private int currentValue;
    private final Map<Integer, char[]> diceValueToArray = new HashMap<>(6) {
        {
            put(1, new char[]{' ', ' ', ' ', ' ', '●', ' ', ' ', ' ', ' '});
            put(2, new char[]{'●', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '●'});
            put(3, new char[]{'●', ' ', ' ', ' ', '●', ' ', ' ', ' ', '●'});
            put(4, new char[]{'●', ' ', '●', ' ', ' ', ' ', '●', ' ', '●'});
            put(5, new char[]{'●', ' ', '●', ' ', '●', ' ', '●', ' ', '●'});
            put(6, new char[]{'●', ' ', '●', '●', ' ', '●', '●', ' ', '●'});

        }
    };

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void rollADice() {
        Random random = new Random();
        int r1 = random.nextInt(6) + 1;
        setCurrentValue(r1);
        displayDice(r1);
    }

    private void displayDice(int diceValue) {
        char[] charArr = diceValueToArray.get(diceValue);
        int counter = 0;

        System.out.println("◜--------◝");
        for (int i = 0; i < 9; i++) {
            if(counter % 3 == 0){
                System.out.print("|");
            }
            System.out.print(' ');
            System.out.print(charArr[i]);
            System.out.print(' ');
            if(++counter % 3 == 0){
                System.out.println("|");
            }
        }
        System.out.println("◟--------◞");
    }
}
