package JFD.Twelve.Lambdas;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class LambdaMain {

    static void main() {

//        List<Employee> employees = new ArrayList<>();
//        employees.add(new Employee("Béla", 2.7));
//        employees.add(new Employee("Tibi", 3.8));
//        employees.add(new Employee("Jani", 3.2));
//        employees.add(new Employee("Feri", 4.6));
//        employees.add(new Employee("Niki", 2.2));
//        employees.add(new Employee("Gizi", 2.8));
//        employees.add(new Employee("Juli", 3.3));
//
//       int sum = employees.stream().filter(employee -> employee.getScore() >= 3).reduce(0, (acc, employee) -> acc + 100,
//                Integer::sum);
//
//        System.out.println(sum);

        Ingredients ingredients = new Ingredients();

        Recepies r1 = new Recepies(List.of("mushroom", "pasta", "tomato"), 30);
        Recepies r2 = new Recepies(List.of("potato", "meat", "peas"), 55);
        Recepies r3 = new Recepies();
        r3.addIngredients(ingredients.getRandomIngredient());
        r3.addIngredients(ingredients.getRandomIngredient());
        r3.addIngredients(ingredients.getRandomIngredient());
        r3.addIngredients(ingredients.getRandomIngredient());
        r3.setCookingTime(70);
        Recepies r4 = new Recepies();
        r4.addIngredients(ingredients.getRandomIngredient());
        r4.addIngredients(ingredients.getRandomIngredient());
        r4.addIngredients(ingredients.getRandomIngredient());
        r4.setCookingTime(45);
        Recepies r5 = new Recepies();
        r5.addIngredients(ingredients.getRandomIngredient());
        r5.addIngredients(ingredients.getRandomIngredient());
        r5.addIngredients(ingredients.getRandomIngredient());
        r5.addIngredients(ingredients.getRandomIngredient());
        r5.addIngredients(ingredients.getRandomIngredient());
        r5.setCookingTime(90);
        Recepies r6 = new Recepies();
        r6.addIngredients(ingredients.getRandomIngredient());
        r6.addIngredients(ingredients.getRandomIngredient());
        r6.setCookingTime(35);

        List<Recepies> recepiesList = new ArrayList<>();
        recepiesList.add(r1);
        recepiesList.add(r2);
        recepiesList.add(r3);
        recepiesList.add(r4);
        recepiesList.add(r5);
        recepiesList.add(r6);

        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
        System.out.println(r4.toString());
        System.out.println(r5.toString());
        System.out.println(r6.toString());

        double avgVeganCookingTime = recepiesList.stream().filter(recepies -> !recepies.getIngredientList().contains(
                "meat")).mapToInt(Recepies::getCookingTime).average().orElse(0.0);

        System.out.println(avgVeganCookingTime);

    }

}
