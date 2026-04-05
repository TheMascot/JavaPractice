package accounts;

public enum AccountType {

    SAVINGS("savings"),
    CHECKING("checking");

    private String name;

    AccountType(String name){
        this.name = name;
    }

}
