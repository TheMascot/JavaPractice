package JFD.OneToSeven;

public class NonProfitOrganization extends Organization_2_0{

    public double getTax() {
        return getRevenue() * 0.02;
    }

}
