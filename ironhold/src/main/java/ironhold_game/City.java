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

    private void buildHouse(House house) {
        houseList.add(house);
    }

    private void buildWall(Wall wall) {
        wallList.add(wall);
    }

    private void buildFarm(Farm farm) {
        farmList.add(farm);
    }

    private void buildSawmill(Sawmill sawmill) {
        sawmillList.add(sawmill);
    }

    private void buildMine(Mine mine) {
        mineList.add(mine);
    }

    private void buildMarket(Market market) {
        marketList.add(market);
    }
}
