package oop_projects.ironhold.buildings;

public class Market extends ProductionBuilding{

  private int goldProduction;

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
