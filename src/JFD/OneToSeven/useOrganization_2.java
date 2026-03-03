package JFD.OneToSeven;

public class useOrganization_2 {

    public static void main(String[] args) {
        ProfitMakingOrganization org1 =
                new ProfitMakingOrganization();
        org1.setName("XYZ Company");
        org1.setRevenue(1000000.00);

        NonProfitOrganization org2 = new NonProfitOrganization();
        org2.setName("XYZ University");
        org2.setRevenue(100000.00);

        System.out.print(org1.getName());
        System.out.print(" has annual revenue ");
        System.out.print(org1.getRevenue());
        System.out.print(" and pays ");
        System.out.print(org1.getTax());
        System.out.println(" in taxes.");

        System.out.print(org2.getName());
        System.out.print(" has annual revenue ");
        System.out.print(org2.getRevenue());
        System.out.print(" and pays ");
        System.out.print(org2.getTax());
        System.out.println(" in taxes.");
    }

}
