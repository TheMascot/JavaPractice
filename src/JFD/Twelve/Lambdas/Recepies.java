package JFD.Twelve.Lambdas;

import java.util.List;
import java.util.ArrayList;

public class Recepies {


    public Recepies() {
    }

    public Recepies(List<String> ingredientList, int cookingTime) {
        this.ingredientList = ingredientList;
        this.cookingTime = cookingTime;
    }

    private List<String> ingredientList = new ArrayList<>();
    private int cookingTime;

    public void addIngredients(String input){
        this.ingredientList.add(input);
    }

    public List<String> getIngredientList() {
        return ingredientList;
    }


    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    @Override
    public String toString() {
        return "Recepies{" +
                "ingredientList=" + ingredientList +
                ", cookingTime=" + cookingTime +
                '}';
    }
}
