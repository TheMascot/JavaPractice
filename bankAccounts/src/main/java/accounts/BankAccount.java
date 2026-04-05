package accounts;

public abstract class BankAccount {

    private String ownerName;
    private double balance;
    private AccountStatus accountStatus;

    BankAccount(String name){
        this.ownerName = name;
        this.balance = 0;
        this.accountStatus = AccountStatus.ACTIVE;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
