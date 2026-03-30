package ironhold_game.resources;

public enum Resources {

    WOOD("Wood"),
    STONE("Stone"),
    GOLD("Gold"),
    FOOD("Food"),
    DEFENSEVALUE("Defense value");

    private String name;

    public String getName() {
        return name;
    }

    Resources(String name) {
        this.name = name;
    }
}
