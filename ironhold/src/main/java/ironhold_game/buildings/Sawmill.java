package ironhold_game.buildings;

public class Sawmill extends ProductionBuilding {

    private int woodProduction;

    public int getWoodProduction() {
        return woodProduction;
    }

    public void setWoodProduction(int woodProduction) {
        this.woodProduction = woodProduction;
    }

    @Override
    public void build() {
        System.out.println("Sawmill built");
    }
}
