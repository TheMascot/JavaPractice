package ironhold_game.buildings;


public class Farm extends ProductionBuilding {

   private int foodProduction;

    public Farm(int woodPrice, int stonePrice, int goldPrice, int maxWorkerNumber) {
        super(woodPrice, stonePrice, goldPrice, maxWorkerNumber);
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
