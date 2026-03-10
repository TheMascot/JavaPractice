package JFD.Twelve;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static void main() throws IOException {

        AdvancedWordProcessor awp = new AdvancedWordProcessor();
        awp.initializeList();
//        boolean run = true;
        int line = -1;

        Scanner keyboard = new Scanner(System.in);
        while (true) {
            line = -1;
            System.out.println("Type the line:");
            String userInputNewLine = keyboard.nextLine();

            System.out.println("Type the operation (i/r/d/p/x) and the number of line:");
            String input = keyboard.nextLine().trim();

            if (input.equalsIgnoreCase("x")) {
                System.out.println("End of operation.");
                System.exit(0);
            }
            if (!input.equalsIgnoreCase("p")) {
                System.out.println("Type the line number:");
                line = Integer.parseInt(keyboard.nextLine().trim());
            }

            awp.useUserInput(createCommand(input), userInputNewLine, line);
            awp.display();
        }
    }

    private static Commands createCommand(String input) {
        String validInputs = "i, r, d, print, exit";
        return switch (input.toLowerCase()) {
            case "i" -> Commands.I;
            case "r" -> Commands.R;
            case "d" -> Commands.D;
            case "p" -> Commands.P;
            case "x" -> Commands.X;
            default -> Commands.NOT_VALID;
        };
    }
}
