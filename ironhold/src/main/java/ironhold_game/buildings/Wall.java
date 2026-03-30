package ironhold_game.buildings;

public class Wall extends Building {

    private int defenseValue;

    public Wall(int woodPrice, int stonePrice, int goldPrice, int defenseValue) {
        super(woodPrice, stonePrice, goldPrice);
        this.defenseValue = defenseValue;
    }

    public int getDefenseValue() {
        return defenseValue;
    }

    public void setDefenseValue(int defenseValue) {
        this.defenseValue = defenseValue;
    }

    @Override
    public void build() {
        System.out.println("Wall built");
    }
}
