package ironhold_game.buildings;

public class Market extends ProductionBuilding{

  private int goldProduction;

    public Market(ProductionBuildings market) {
        super(market.getWoodCost(), market.getStoneCost(), market.getGoldCost(), market.getMaxWorkerNumber());
    }

    public int getGoldProduction() {
        return goldProduction;
    }

    public void setGoldProduction(int goldProduction) {
        this.goldProduction = goldProduction;
    }

    @Override
    public void build() {
        System.out.println("Market built");
    }
}
