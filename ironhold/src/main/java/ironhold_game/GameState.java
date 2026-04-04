package ironhold_game;

import ironhold_game.resources.Resources;

import java.util.HashMap;
import java.util.Map;

public class GameState {

    private Map<Resources, Integer> stockpile = new HashMap<>();
    private int turnCounter = 0;
    private int inputCounter;

    public GameState() {
        initializeStockpile();
    }

    public String printStockpile() {
        StringBuilder sb = new StringBuilder("Current stockpile:\n");

        for (Map.Entry<Resources, Integer> entry : stockpile.entrySet()) {
            sb.append(entry.getKey().getName())
                    .append(": ")
                    .append(entry.getValue())
                    .append("\n");
        }
        return sb.toString();
    }

    public void addResource(Resources resource, int amount) {
        // if key not present-> initialize with amount; else sum amount with key value;
        stockpile.merge(resource, amount, Integer::sum);
    }

    public void increaseTurnCounter() {
        this.turnCounter++;
    }

    private void initializeStockpile() {
        stockpile.put(Resources.WOOD, 20);
        stockpile.put(Resources.FOOD, 30);
        stockpile.put(Resources.STONE, 0);
        stockpile.put(Resources.GOLD, 0);
    }

    public Map<Resources, Integer> getStockpile() {
        return stockpile;
    }

    public void setStockpile(Map<Resources, Integer> stockpile) {
        this.stockpile = stockpile;
    }

    public int getTurnCounter() {
        return turnCounter;
    }

    public void setTurnCounter(int turnCounter) {
        this.turnCounter = turnCounter;
    }
}
