package JFD.Ten;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class Frame extends JFrame {

    public Frame() throws IOException {
       MenClothingItem m1 = new MenClothingItem("nadrág", MenClothing.PANTS);
       MenClothingItem m2 = new MenClothingItem("póló", MenClothing.SHIRTS);
       MenClothingItem m3 = new MenClothingItem("nyakkendő", MenClothing.NECKTIES);
       MenClothingItem m4 = new MenClothingItem("kabát", MenClothing.JACKETS);
       MenClothingItem m5 = new MenClothingItem("másik kabát", MenClothing.OVERCOATS);
       MenClothingItem m6 = new MenClothingItem("cipő", MenClothing.SHOES);

       ArrayList<MenClothingItem> menClothingList = new ArrayList<>();
       menClothingList.add(m1);
       menClothingList.add(m2);
       menClothingList.add(m3);
       menClothingList.add(m4);
       menClothingList.add(m5);
       menClothingList.add(m6);

       setTitle("Men's wardrobe");
       setLayout(new GridLayout(6,2, 20, 5));
       setDefaultCloseOperation(EXIT_ON_CLOSE);

        for (MenClothingItem mci : menClothingList) {
            addInfo(mci);
        }
        pack();
        setVisible(true);

    }
    private void addInfo(MenClothingItem menClothingItem){
        add(new JLabel(menClothingItem.getName()));
        add(new JLabel(menClothingItem.getClothType().toString()));
    }

}
