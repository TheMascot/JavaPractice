package ironhold_game.buildings;

public class Sawmill extends ProductionBuilding {

    private int woodProduction;

    public Sawmill(ProductionBuildings sawmill) {
        super(sawmill.getWoodCost(), sawmill.getStoneCost(), sawmill.getGoldCost(), sawmill.getMaxWorkerNumber());
    }

    public int getWoodProduction() {
        return woodProduction;
    }

    public void setWoodProduction(int woodProduction) {
        this.woodProduction = woodProduction;
    }

    public static Sawmill build() {
        return new Sawmill(ProductionBuildings.SAWMILL);
    }
}
