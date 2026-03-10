package JFD.Twelve.Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ingredients {

    public List<String> ingredients = new ArrayList<>(List.of("meat", "cabbage", "pepper", "pasta", "tomato", "potato", "corn", "onion","peas" +
            "chickpeas", "rice", "flour"));

    public String getRandomIngredient(){
        Random r = new Random();
        return ingredients.get(r.nextInt(11));
    };


}
