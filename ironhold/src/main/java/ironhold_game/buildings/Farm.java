package ironhold_game.buildings;


public class Farm extends ProductionBuilding {

    private int foodProduction;

    private Farm(ProductionBuildings farm) {
        super(farm.getWoodCost(), farm.getStoneCost(), farm.getGoldCost(), farm.getMaxWorkerNumber());
    }

    public int getFoodProduction() {
        return foodProduction;
    }

    public void setFoodProduction(int foodProduction) {
        this.foodProduction = foodProduction;
    }

    public static Farm build() {
        return new Farm(ProductionBuildings.FARM);
    }
}
