package ironhold_game.buildings;


public class Farm extends ProductionBuilding {

   private int foodProduction;

    public Farm(ProductionBuildings farm) {
        super(farm.getWoodCost(), farm.getStoneCost(), farm.getGoldCost(), farm.getMaxWorkerNumber());
    }

    public int getFoodProduction() {
        return foodProduction;
    }

    public void setFoodProduction(int foodProduction) {
        this.foodProduction = foodProduction;
    }

    @Override
    public void build() {
        System.out.println("Farm is built");
    }
}
