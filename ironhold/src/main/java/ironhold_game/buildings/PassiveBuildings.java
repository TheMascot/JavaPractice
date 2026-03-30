package ironhold_game.buildings;

public enum PassiveBuildings {

    HOUSE(10,0,0, 10);

    private int woodCost;
    private int stoneCost;
    private int goldCost;
    private int maxPopulation;


    public int getMaxPopulation() {
        return maxPopulation;
    }

    public void setMaxPopulation(int maxPopulation) {
        this.maxPopulation = maxPopulation;
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

    PassiveBuildings(int woodCost, int stoneCost, int goldCost, int maxPopulation) {
        this.woodCost = woodCost;
        this.stoneCost = stoneCost;
        this.goldCost = goldCost;
        this.maxPopulation = maxPopulation;
    }
}
