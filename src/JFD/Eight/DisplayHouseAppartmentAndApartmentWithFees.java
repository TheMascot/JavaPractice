package JFD.Eight;

public class DisplayHouseAppartmentAndApartmentWithFees {

    public static void main(String[] args) {

        House h1 = new House();
        h1.setAddress("House address");
        h1.setNumberOfBedrooms(2);
        h1.setTotalArea(70);
        h1.setMonthlyMorgageCost(1200.00);
        h1.setYearlyPropertyCost(7000);

        Apartment a1 = new Apartment();
        a1.setAddress("Apartment address");
        a1.setTotalArea(90);
        a1.setNumberOfBedrooms(3);
        a1.setMonthlyRentalCost(2200);

        ApartmentWithFees aWF1 = new ApartmentWithFees();
        aWF1.setAddress("Apartment with fees address");
        aWF1.setTotalArea(80);
        aWF1.setNumberOfBedrooms(2);
        aWF1.setMonthlyRentalCost(1800);
        aWF1.setQuarterlyFees(600);

        h1.displayPlace();
        a1.displayPlace();
        aWF1.displayPlace();

    }
}
