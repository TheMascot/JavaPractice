package ironhold_game;


public class Engine {
    GameState gameState = new GameState();


public void run(){
    System.out.println(gameState.printStockpile());
}

}
