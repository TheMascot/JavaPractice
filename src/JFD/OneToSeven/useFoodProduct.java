package JFD.OneToSeven;

public class useFoodProduct {
    public static void main(String[] args) {
        var product1 = new FoodProduct();
        product1.setType("Peach Slices");
        product1.setWeight(500);
        product1.setServings(4);
        product1.setCalories(70);
        product1.setCost(5.00);

        var product2 = new FoodProduct();
        product2.setType("Bread");
        product2.setWeight(550);
        product2.setServings(10);
        product2.setCalories(150);
        product2.setCost(2.50);

        product1.display();
        product2.display();
    }
}
