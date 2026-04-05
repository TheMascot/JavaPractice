package ironhold_game.buildings;


public class Mine extends ProductionBuilding{

   private int stoneProduction;

    public Mine(ProductionBuildings mine) {
        super(mine.getWoodCost(), mine.getStoneCost(), mine.getGoldCost(), mine.getMaxWorkerNumber());
    }

    public int getStoneProduction() {
        return stoneProduction;
    }

    public void setStoneProduction(int stoneProduction) {
        this.stoneProduction = stoneProduction;
    }

    public static Mine build() {
        return new Mine(ProductionBuildings.MINE);
    }
}
