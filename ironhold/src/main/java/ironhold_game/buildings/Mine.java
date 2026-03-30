package ironhold_game.buildings;


public class Mine extends ProductionBuilding{

   private int stoneProduction;

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
