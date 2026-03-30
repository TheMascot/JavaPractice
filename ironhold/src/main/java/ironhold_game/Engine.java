package ironhold_game;


public class Engine {
    GameState gameState = new GameState();


public void run(){
    City ironhold = new City();
    System.out.println(gameState.printStockpile());
}

}
