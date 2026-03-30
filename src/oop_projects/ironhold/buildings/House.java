package oop_projects.ironhold.buildings;

public class House extends Building{

    private int maxPopulation;
    private int currentPopulation;

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
