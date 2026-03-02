package JFD.OneToSeven;

public class useOrganization {
    public static void main(String[] args) {
        var org1 = new Organization();
        org1.setName("XYZ Company");
        org1.setRevenue(1000000.00);
        org1.setForProfit(true);

        Organization org2 = new Organization();
        org2.setName("XYZ University");
        org2.setRevenue(100000.00);
        org2.setForProfit(false);

        org1.display();
        org2.display();
    }
}
