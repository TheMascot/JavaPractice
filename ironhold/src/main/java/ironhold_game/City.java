package ironhold_game;


import ironhold_game.buildings.*;

import java.util.ArrayList;
import java.util.List;

public class City {

    private List<House> houseList = new ArrayList<>();
    private List<Wall> wallList = new ArrayList<>();
    private List<Farm> farmList = new ArrayList<>();
    private List<Sawmill> sawmillList = new ArrayList<>();
    private List<Mine> mineList = new ArrayList<>();
    private List<Market> marketList = new ArrayList<>();

    private int population;
    private int unemployed;

    public City() {
        this.population = 10;
        this.unemployed = 10;
        initializeCity();
    }

    private void initializeCity() {
        this.houseList.add(House.build());
        this.wallList.add(Wall.build());
    }

    public void buildBuildingByName(String buildingName){
        switch (buildingName){
            case "house" -> houseList.add(House.build());
            case "farm" -> farmList.add(Farm.build());
            case "sawmill" -> sawmillList.add(Sawmill.build());
            case "mine" -> mineList.add(Mine.build());
            case "market" -> marketList.add(Market.build());
            case "wall" -> wallList.add(Wall.build());
            default -> System.out.println("Building name is invalid");
        }
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation() {
        this.population = houseList.stream()
                .mapToInt(House::getCurrentPopulation)
                .sum();
    }

    public int getUnemployed() {
        return unemployed;
    }

    public void setUnemployed(int unemployed) {

        this.unemployed = unemployed;
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public List<Wall> getWallList() {
        return wallList;
    }

    public List<Farm> getFarmList() {
        return farmList;
    }

    public List<Sawmill> getSawmillList() {
        return sawmillList;
    }

    public List<Mine> getMineList() {
        return mineList;
    }

    public List<Market> getMarketList() {
        return marketList;
    }
}
