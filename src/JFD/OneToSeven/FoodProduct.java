package JFD.OneToSeven;

public class FoodProduct {
    private String string;
    private double weight;
    private int servings;
    private int calories;
    private double cost;

    public String getType() {
        return string;
    }

    public void setType(String type) {
        if(!type.isEmpty()){
        this.string = type;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight > 0){
        this.weight = weight;
        }
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        if(servings > 0){
        this.servings = servings;
        }
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        if(calories > 0){
        this.calories = calories;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if(cost > 0){
        this.cost = cost;
        }
    }

    public void display() {
        System.out.print(string);
        System.out.print(" has weight ");
        System.out.print(weight);
        System.out.print(" grams, has ");
        System.out.print(servings);
        System.out.print(" servings, and has ");
        System.out.print(calories);
        System.out.println(" calories.");
        System.out.println("  The cost per 100 grams is " + costPer100Grams() + ".");
        System.out.println("  The cost per serving is " + costPerServing() + ".");
        System.out.println("  The calorie count is " + totalCalories() + ".");
    }

    public double costPer100Grams() {
        return cost / (weight / 100);
    }

    public double costPerServing() {
        return cost / servings;
    }

    public int totalCalories() {
        return calories * servings;
    }


}
