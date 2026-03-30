package ironhold_game.buildings;


public class Mine extends ProductionBuilding{

   private int stoneProduction;

    public Mine(int woodPrice, int stonePrice, int goldPrice, int maxWorkerNumber) {
        super(woodPrice, stonePrice, goldPrice, maxWorkerNumber);
    }

    public int getStoneProduction() {
        return stoneProduction;
    }

    public void setStoneProduction(int stoneProduction) {
        this.stoneProduction = stoneProduction;
    }

    @Override
    public void build() {
        System.out.println("Mine built");
    }
}
