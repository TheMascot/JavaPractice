package JFD.Twelve.AdvancedWordProcessor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class AdvancedWordProcessor {

    private List<String> userInputList = new ArrayList<>();

    public List<String> getUserInputList() {
        return List.copyOf(userInputList);
    }

    public void useUserInput(Commands command, String input, int line) throws IOException {
        if(line == -1){
            switch (command) {
                case P -> printToFile();
                case X -> {
                    return;
                }
                case NOT_VALID -> System.out.println("Operation input is not valid");
            }
        }
       else switch (command) {
            case I -> insertLine(input, line);
            case R -> replaceLine(input, line);
            case D -> deleteLine(line);

            case NOT_VALID -> System.out.println("Operation input is not valid");
        }
    }

    public void initializeList() {
        this.userInputList.add("> First line");
        this.userInputList.add("> Second line");
        this.userInputList.add("> Third line");
        this.userInputList.add("> Forth line");
        this.userInputList.add("> Fifth line");
    }

    public void display() {
        for (String s : userInputList) {
            System.out.println(s);
        }
    }

    private void insertLine(String input, int line) {
        if (this.userInputList.size() == line) this.userInputList.add("> " + input);
        else if (this.userInputList.size() > line) {
            userInputList.add(line, ("> " + input));
        } else {
            for (int i = this.userInputList.size(); i < line; i++) {
                if (i == line - 1) this.userInputList.add("> " + input);
                else userInputList.add("> ");
            }
        }
    }

    private void replaceLine(String input, int line) {
        if(line > this.userInputList.size()){
            System.out.println("Line " + line + " does not exist yet, use the \"insert\" command.");
            return;
        }
        this.userInputList.set(line, ("> " + input));
    }

    private void deleteLine(int line) {
        if(line > this.userInputList.size()){
            System.out.println("Line " + line + " does not exist. No deletion happened.");
            return;
        }
        this.userInputList.remove(line);
    }

    private void printToFile() throws IOException {
        System.out.println("Printing started.");
        try{
        Files.write(Path.of("src/JFD/Twelve/outputFile.txt"), this.userInputList);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Printing done.");
    }


}
