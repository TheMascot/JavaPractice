package ironhold_game.buildings;

public class Wall extends Building {

    private int defenseValue;

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
