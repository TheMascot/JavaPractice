package JFD.Ten;

import java.awt.*;

public class MenClothingItemWithExtras extends MenClothingItem {

    static String nameOfDesigner = "House of Fashion";
    static Color color = Color.blue;
    static double costSummary;
    private double cost;

    public MenClothingItemWithExtras(String name, MenClothing clothType, double cost) {
        super(name, clothType);
        this.cost = cost;
        costSummary += cost;
    }

    public double getCost() {
        return cost;
    }
}
