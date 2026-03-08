package JFD.Eleven;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveWordProcessor {

    private List<String> userInputs = new ArrayList<>(5);

    public List<String> getUserInputs() {
        return List.copyOf(userInputs);
    }

    public void setUserInputs(String currentInput, int place) {
        if(this.userInputs.size() > place){
        this.userInputs.set(place, currentInput);
        } else this.userInputs.add(currentInput);
    }

    public void displayUserInputs(){
        for(String s : userInputs){
            System.out.println(s);
        }
    }

    public void initializeUserInputs(){
        for (int i = 0; i < 5; i++) {
            this.userInputs.add("> ");
        }
    }

}
