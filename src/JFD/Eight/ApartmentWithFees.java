package JFD.Eight;

public class ApartmentWithFees extends Apartment {

    double quarterlyFees;

    public double getQuarterlyFees() {
        return quarterlyFees;
    }

    public void setQuarterlyFees(double quarterlyFees) {
        this.quarterlyFees = quarterlyFees;
    }

    @Override
    public void displayPlace(){
        System.out.println("APARTMENT WITH FEES");
        System.out.println("Address: " + this.address);
        System.out.println("Number of bedrooms: " + numberOfBedrooms);
        System.out.println("Total area: " + totalArea + " square meters");
        System.out.println("Monthly rental cost: " + this.monthlyRentalCost);
        System.out.println("Fees per month: " + (this.quarterlyFees / 3));
        System.out.println();
    }

}
