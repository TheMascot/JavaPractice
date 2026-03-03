package JFD.OneToSeven;

public class Organization_2_0 {

    private String name;
    private double revenue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.equals("")) {
            this.name = name;
        }
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        if (revenue >= 0) {
            this.revenue = revenue;
        }
    }
}
