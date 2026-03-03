package JFD.Eight;


public class House extends PlaceToLive {

    double monthlyMorgageCost;
    int yearlyPropertyCost;

    public double getMonthlyMorgageCost() {
        return monthlyMorgageCost;
    }

    public void setMonthlyMorgageCost(double monthlyMorgageCost) {
        this.monthlyMorgageCost = monthlyMorgageCost;
    }

    public int getYearlyPropertyCost() {
        return yearlyPropertyCost;
    }

    public void setYearlyPropertyCost(int yearlyPropertyCost) {
        this.yearlyPropertyCost = yearlyPropertyCost;
    }

    public double getTotalMonthlyPayment(){
        return this.monthlyMorgageCost + ((double) this.yearlyPropertyCost / 12);
    }

    @Override
    public void displayPlace(){
        System.out.println("HOUSE");
        System.out.println("Address: " + this.address);
        System.out.println("Number of bedrooms: " + numberOfBedrooms);
        System.out.println("Total area: " + totalArea + " square meters");
        System.out.println("Monthly morgage cost: " + this.monthlyMorgageCost);
        System.out.println("Property cost per month: " + (this.yearlyPropertyCost / 12));
        System.out.println();
    }
}

