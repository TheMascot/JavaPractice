package JFD.Eleven;

import java.util.Scanner;

public class Main {
    static void main() {

        int line = 0;
        PrimitiveWordProcessor pwp = new PrimitiveWordProcessor();
        pwp.initializeUserInputs();

        do {
            pwp.displayUserInputs();

            Scanner keyboard = new Scanner(System.in);
            System.out.print("Line to replace (or -1 to quit): ");
            while (!keyboard.hasNextInt()) {
                System.out.println("Not valid input");
                keyboard.next();
            }

            line = keyboard.nextInt();
            keyboard.nextLine();

            System.out.print("Type the new line: ");
            String newInput = keyboard.nextLine();

            pwp.setUserInputs(newInput, line);

        } while (line != -1);

        System.out.println("Process finished");

    }
}
