package ironhold_game.buildings;

public class House extends Building{

    private int maxPopulation;
    private int currentPopulation;

    public House(int woodPrice, int stonePrice, int goldPrice, int maxPopulation) {
        super(woodPrice, stonePrice, goldPrice);
        this.maxPopulation = maxPopulation;
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
