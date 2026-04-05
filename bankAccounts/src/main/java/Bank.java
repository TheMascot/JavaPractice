import accounts.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class Bank {

   private List<BankAccount> accountList = new ArrayList<>();

    public void addAccount(BankAccount account){
        accountList.add(account);
    }

    public List<BankAccount> getAccountList() {
        return accountList;
    }
}