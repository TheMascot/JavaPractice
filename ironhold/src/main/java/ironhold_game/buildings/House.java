package ironhold_game.buildings;

public class House extends Building{

    private int maxPopulation;
    private int currentPopulation;

    public House(AvailableBuildings availableBuildings) {
        super(availableBuildings.getWoodCost(), availableBuildings.getStoneCost(), availableBuildings.getGoldCost());
        this.maxPopulation = availableBuildings.getMaxPopulation();
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

    @Override
    public void build() {
        System.out.println("House is built");
    }

}
