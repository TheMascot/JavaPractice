package ironhold_game.buildings;

public enum ProductionBuildings {
    FARM(10,0,0,  5),
    MINE(20,0,0,  5),
    SAWMILL(10,0,0,  5),
    MARKET(20,15,0,4);

    private int woodCost;
    private int stoneCost;
    private int goldCost;
    private int maxWorkerNumber;

    public int getMaxWorkerNumber() {
        return maxWorkerNumber;
    }

    public void setMaxWorkerNumber(int maxWorkerNumber) {
        this.maxWorkerNumber = maxWorkerNumber;
    }

    public int getGoldCost() {
        return goldCost;
    }

    public void setGoldCost(int goldCost) {
        this.goldCost = goldCost;
    }

    public int getStoneCost() {
        return stoneCost;
    }

    public void setStoneCost(int stoneCost) {
        this.stoneCost = stoneCost;
    }

    public int getWoodCost() {
        return woodCost;
    }

    public void setWoodCost(int woodCost) {
        this.woodCost = woodCost;
    }

    ProductionBuildings(int woodCost, int stoneCost, int goldCost, int maxWorkerNumber) {
        this.woodCost = woodCost;
        this.stoneCost = stoneCost;
        this.goldCost = goldCost;
        this.maxWorkerNumber = maxWorkerNumber;
    }
}
