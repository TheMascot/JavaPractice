package oop_projects.ironhold.buildings;

public class Farm extends ProductionBuilding{

   private int foodProduction;

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
