package JFD.Eleven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class PrintStreamPractice {

    static void main() throws FileNotFoundException {

        File file = new File("src/JFD/Eleven/text.txt");
        Scanner fileScanner = new Scanner(file);
        while(fileScanner.hasNextLine()){
            System.out.println(fileScanner.nextLine());
        }
        PrintStream addLine = new PrintStream(file);
        addLine.println("Line 4");
        addLine.println("Line 5");
        addLine.println("Line 6");
        fileScanner.close();

        Scanner fileScanner2 = new Scanner(file);
        while (fileScanner2.hasNextLine()) {
            System.out.println(fileScanner2.nextLine());

        }

    }

}
