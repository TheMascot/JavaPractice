package JFD.Eight;

public class DisplayHousesAndApartments {

    public static void main(String[] args) {
        House place1 = new House();
        place1.setAddress("111 Main Street");
        place1.setTotalArea(600);
        place1.setNumberOfBedrooms(2);
        place1.setMonthlyMorgageCost(1000.00);
        place1.setYearlyPropertyCost(600);
        double cost1 = place1.getTotalMonthlyPayment();

        Apartment place2 = new Apartment();
        place2.setAddress("222 Java Road");
        place2.setTotalArea(1000);
        place2.setNumberOfBedrooms(1);
        place2.setMonthlyRentalCost(1500);
        double cost2 = place2.getMonthlyRentalCost();

        System.out.println(place1.getAddress());
        System.out.println
                ("  Cost per unit area: " + cost1 / place1.getTotalArea());
        System.out.println
                ("  Cost per bedroom:   " + cost1/ place1.getNumberOfBedrooms());

        System.out.println(place2.getAddress());
        System.out.println
                ("  Cost per unit area: " + cost2 / place2.getTotalArea());
        System.out.println
                ("  Cost per bedroom:   " + cost2 / place2.getNumberOfBedrooms());
    }

}
