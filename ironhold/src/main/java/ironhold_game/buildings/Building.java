package ironhold_game.buildings;

public abstract class Building {

    private int woodPrice;
    private int stonePrice;
    private int goldPrice;

    public int getWoodPrice() {
        return woodPrice;
    }

    public void setWoodPrice(int woodPrice) {
        this.woodPrice = woodPrice;
    }

    public int getStonePrice() {
        return stonePrice;
    }

    public void setStonePrice(int stonePrice) {
        this.stonePrice = stonePrice;
    }

    public int getGoldPrice() {
        return goldPrice;
    }

    public void setGoldPrice(int goldPrice) {
        this.goldPrice = goldPrice;
    }

    public abstract void build();

}
