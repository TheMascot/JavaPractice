package ironhold_game.buildings;

public class House extends Building{

    private int maxPopulation;
    private int currentPopulation;

    private House(PassiveBuildings house) {
        super(house.getWoodCost(), house.getStoneCost(), house.getGoldCost());
        this.maxPopulation = house.getMaxPopulation();
    }

    public int getMaxPopulation() {
        return maxPopulation;
    }

    public void setMaxPopulation(int maxPopulation) {
        this.maxPopulation = maxPopulation;
    }

    public int getCurrentPopulation() {
        return currentPopulation;
    }

    public void setCurrentPopulation(int currentPopulation) {
        this.currentPopulation = currentPopulation;
    }

    public static House build() {
        return new House(PassiveBuildings.HOUSE);
    }

}
