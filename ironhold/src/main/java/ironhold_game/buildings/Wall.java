package ironhold_game.buildings;

public class Wall extends Building {

    private int defenseValue;

    public Wall(DefensiveBuildings wall) {
        super(wall.getWoodCost(), wall.getStoneCost(), wall.getGoldCost());
        this.defenseValue = wall.getDefenseValue();
    }

    public int getDefenseValue() {
        return defenseValue;
    }

    public void setDefenseValue(int defenseValue) {
        this.defenseValue = defenseValue;
    }

    public static Wall build() {
        return new Wall(DefensiveBuildings.WALL);
    }
}
