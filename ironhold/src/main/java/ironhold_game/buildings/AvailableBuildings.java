package ironhold_game.buildings;

public enum AvailableBuildings {

    HOUSE(10,0,0, 10, 0),
    FARM(10,0,0, 0, 5),
    MINE(20,0,0, 0, 5),
    SAWMILL(10,0,0, 0, 5),
    MARKET(20,15,0,0,4),
    WALL(30,20,0,0,0);

    private int woodCost;
    private int stoneCost;
    private int goldCost;
    private int maxPopulation;
    private int maxWorkerNumber;

    public int getMaxPopulation() {
        return maxPopulation;
    }

    public void setMaxPopulation(int maxPopulation) {
        this.maxPopulation = maxPopulation;
    }

    public int getMaxWorkerNumber() {
        return maxWorkerNumber;
    }

    public void setMaxWorkerNumber(int maxWorkerNumber) {
        this.maxWorkerNumber = maxWorkerNumber;
    }

    public int getWoodCost() {
        return woodCost;
    }

    public void setWoodCost(int woodCost) {
        this.woodCost = woodCost;
    }

    public int getStoneCost() {
        return stoneCost;
    }

    public void setStoneCost(int stoneCost) {
        this.stoneCost = stoneCost;
    }

    public int getGoldCost() {
        return goldCost;
    }

    public void setGoldCost(int goldCost) {
        this.goldCost = goldCost;
    }

    AvailableBuildings(int woodCost, int stoneCost, int goldCost, int maxPopulation, int maxWorkerNumber) {
        this.woodCost = woodCost;
        this.stoneCost = stoneCost;
        this.goldCost = goldCost;
        this.maxPopulation = maxPopulation;
        this.maxWorkerNumber = maxWorkerNumber;
    }
}
