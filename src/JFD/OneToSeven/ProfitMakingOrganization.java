package JFD.OneToSeven;

public class ProfitMakingOrganization extends Organization_2_0{

    public double getTax() {
        return getRevenue() * 0.10;
    }

}
