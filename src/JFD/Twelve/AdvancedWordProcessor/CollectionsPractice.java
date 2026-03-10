package JFD.Twelve.AdvancedWordProcessor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionsPractice {

    public static void main() {
        List<String> test = new ArrayList<>(List.of("cat", "dog", "horse", "zebra"));

        Scanner keyboard = new Scanner(System.in);
        boolean run = true;

        while (run) {
            String newItem = keyboard.nextLine();
            if (newItem.equals("exit")) {
                run = false;
            }
            for (int i = 0; i < test.size(); i++) {
                if (i == test.size() - 1 && test.get(i).compareToIgnoreCase(newItem) < 0) {
                    test.add(newItem);
                    break;
                }
                if (test.get(i).compareToIgnoreCase(newItem) < 0) continue;
                test.add(i, newItem);
                break;
            }

            System.out.println(test);

        }
    }
}
