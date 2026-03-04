package JFD.Ten;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class Frame extends JFrame {

    public Frame() throws IOException {
        MenClothingItemWithExtras m1 = new MenClothingItemWithExtras("nadrág", MenClothing.PANTS, 125.50);
        MenClothingItemWithExtras m2 = new MenClothingItemWithExtras("póló", MenClothing.SHIRTS, 45);
        MenClothingItemWithExtras m3 = new MenClothingItemWithExtras("nyakkendő", MenClothing.NECKTIES, 18.99);
        MenClothingItemWithExtras m4 = new MenClothingItemWithExtras("kabát", MenClothing.JACKETS, 99.50);
        MenClothingItemWithExtras m5 = new MenClothingItemWithExtras("másik kabát", MenClothing.OVERCOATS, 300);
        MenClothingItemWithExtras m6 = new MenClothingItemWithExtras("cipő", MenClothing.SHOES, 155.99);

        ArrayList<MenClothingItemWithExtras> menClothingList = new ArrayList<>();
        menClothingList.add(m1);
        menClothingList.add(m2);
        menClothingList.add(m3);
        menClothingList.add(m4);
        menClothingList.add(m5);
        menClothingList.add(m6);

        setTitle("Men's wardrobe");
        setLayout(new GridLayout(8, 2, 20, 5));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(new JLabel("Designer"));
        add(new JLabel(MenClothingItemWithExtras.nameOfDesigner));
        add(new JLabel());

        for (MenClothingItemWithExtras mci : menClothingList) {
            addInfo(mci);
        }

        add(new JLabel("Total cost"));
        add(new JLabel());
        add(new JLabel(String.valueOf(MenClothingItemWithExtras.costSummary)));
        pack();
        setVisible(true);

    }

    private void addInfo(MenClothingItemWithExtras menClothingItemWithExtras) {
        add(new JLabel(menClothingItemWithExtras.getName()));
        add(new JLabel(menClothingItemWithExtras.getClothType().toString()));
        add(new JLabel(String.valueOf(menClothingItemWithExtras.getCost())));
    }

}
