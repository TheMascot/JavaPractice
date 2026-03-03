package JFD.Ten;

import javax.swing.*;

public class MenClothingItem {

    private String name;
    private MenClothing clothType;

    public MenClothingItem(String name, MenClothing clothType){
        this.name = name;
        this.clothType = clothType;
    }

    public String getName() {
        return name;
    }

    public MenClothing getClothType() {
        return clothType;
    }



}
