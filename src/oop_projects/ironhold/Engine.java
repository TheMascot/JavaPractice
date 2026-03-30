package oop_projects.ironhold;

public class Engine {
    GameState gameState = new GameState();


public void run(){
    gameState.initializeStockpile();
    System.out.println(gameState.printStockpile());
}

}
