package ironhold_game;


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

            switch(action){
                default -> System.out.println("default case hit");
            }


        }


    }

}
