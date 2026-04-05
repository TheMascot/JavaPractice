package ironhold_game.player;

import ironhold_game.buildings.*;

public class InputProcessor {

    public static String[] process(String input) {
        return input.toLowerCase().trim().split(" ");
    }

}
