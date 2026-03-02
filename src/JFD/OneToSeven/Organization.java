package JFD.OneToSeven;

public class Organization {
    private String name;
    private double revenue;
    private boolean isForProfit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty()){
        this.name = name;
        }
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        if(revenue > 0){
        this.revenue = revenue;
        }
    }

    public boolean isForProfit() {
        return isForProfit;
    }

    public void setForProfit(boolean forProfit) {
        isForProfit = forProfit;
    }

    public void display() {
        System.out.print(name);
        System.out.print(" has annual revenue ");
        System.out.print(revenue);
        System.out.print(", is ");
        System.out.print(isForProfit ? "" : "not ");
        System.out.print("for profit, and pays ");
        System.out.print(tax());
        System.out.println(" tax.");
    }

    public double tax() {
        if (isForProfit) {
            return revenue * 0.10;
        } else {
            return revenue * 0.02;
        }
    }


}