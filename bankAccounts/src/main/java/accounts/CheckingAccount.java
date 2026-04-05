package accounts;

public class CheckingAccount extends BankAccount implements InterestBearing{

    private AccountType accountType = AccountType.CHECKING;

    public CheckingAccount(String name) {
        super(name);
    }

    @Override
    public void applyInterest() {
        this.setBalance(this.getBalance() * 1.01);
    }

    public String getAccountType() {
        return accountType.toString();
    }
}
