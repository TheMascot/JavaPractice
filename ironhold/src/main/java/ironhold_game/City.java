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
        this.buildHouse(new House(AvailableBuildings.HOUSE));
    }

    public void buildHouse(House house) {
        houseList.add(house);
    }

    public void buildWall(Wall wall) {
        wallList.add(wall);
    }

    public void buildFarm(Farm farm) {
        farmList.add(farm);
    }

    public void buildSawmill(Sawmill sawmill) {
        sawmillList.add(sawmill);
    }

    public void buildMine(Mine mine) {
        mineList.add(mine);
    }

    public void buildMarket(Market market) {
        marketList.add(market);
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
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
