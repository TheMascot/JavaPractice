package ironhold_game;


import ironhold_game.player.InputProcessor;

import java.util.Scanner;

public class Engine {
    GameState gameState = new GameState();


    public void run() {
        City ironhold = new City();
        Scanner keyboard = new Scanner(System.in);
        boolean isPlaying = true;


        while (isPlaying) {
            gameState.increaseTurnCounter();
            System.out.println("CURRENT TURN: " + gameState.getTurnCounter());
            System.out.println(gameState.printStockpile());
            System.out.println("Waiting for your actions:");
            String action = keyboard.nextLine();
            String[] userInputArray = InputProcessor.process(action);

            switch (userInputArray[0]) {
                case "build" -> {
                    ironhold.buildBuildingByName(userInputArray[1]);
                }
                case "assign" -> {
                }
                case "reassign" -> {
                }
                case "quit" -> {
                    isPlaying = false;
                }
                default -> System.out.println("default case hit");
            }


        }


    }

}
