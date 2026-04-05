package accounts;

public class SavingsAccount extends BankAccount implements InterestBearing {

    private AccountType accountType = AccountType.SAVINGS;

    public SavingsAccount(String name) {
        super(name);
    }

    @Override
    public void applyInterest() {
        this.setBalance(this.getBalance() * 1.05);
    }
}
