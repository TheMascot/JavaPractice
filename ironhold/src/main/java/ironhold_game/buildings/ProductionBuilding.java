package ironhold_game.buildings;

public abstract class ProductionBuilding extends Building {

    private int maxWorkerNumber;
    private int currentWorkerNumber;

    public ProductionBuilding(int woodPrice, int stonePrice, int goldPrice, int maxWorkerNumber) {
        super(woodPrice, stonePrice, goldPrice);
        this.maxWorkerNumber = maxWorkerNumber;
    }

    public int getMaxWorkerNumber() {
        return maxWorkerNumber;
    }

    public void setMaxWorkerNumber(int maxWorkerNumber) {
        this.maxWorkerNumber = maxWorkerNumber;
    }

    public int getCurrentWorkerNumber() {
        return currentWorkerNumber;
    }

    public void setCurrentWorkerNumber(int currentWorkerNumber) {
        this.currentWorkerNumber = currentWorkerNumber;
    }
}
